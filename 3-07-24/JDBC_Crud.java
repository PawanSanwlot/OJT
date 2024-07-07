import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Crud {

    private static final String URL = "jdbc:mysql://localhost:3307/";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    public static void main(String[] args) {
        String databaseName = "testdb";
        String tableName = "users";

        try {
            // Establishing a connection
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);

            // Create database
            createDatabase(connection, databaseName);

            // Use the new database
            connection.setCatalog(databaseName);

            // Create table
            createTable(connection, tableName);

            // Insert records
            createRecord(connection, tableName, "John Doe", "john.doe@example.com");
            createRecord(connection, tableName, "Jane Smith", "jane.smith@example.com");
            createRecord(connection, tableName, "Bob Johnson", "bob.johnson@example.com");

            // Read operation
            readRecords(connection, tableName);

            // Update operation
            updateRecord(connection, tableName, 1, "Johnathan Doe", "johnathan.doe@example.com");

            // Delete operation
            deleteRecord(connection, tableName, 1);

            // Close the connection
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Create a new database
    private static void createDatabase(Connection connection, String databaseName) throws SQLException {
        String createDatabaseSQL = "CREATE DATABASE IF NOT EXISTS " + databaseName;
        Statement statement = connection.createStatement();
        statement.executeUpdate(createDatabaseSQL);
        System.out.println("Database created successfully");
    }

    // Create a new table
    private static void createTable(Connection connection, String tableName) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS " + tableName + " ("
                + "id INT AUTO_INCREMENT PRIMARY KEY, "
                + "name VARCHAR(100) NOT NULL, "
                + "email VARCHAR(100) NOT NULL)";
        Statement statement = connection.createStatement();
        statement.executeUpdate(createTableSQL);
        System.out.println("Table created successfully");
    }

    // Create a new record
    private static void createRecord(Connection connection, String tableName, String name, String email)
            throws SQLException {
        String insertSQL = "INSERT INTO " + tableName + " (name, email) VALUES (?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, email);
        preparedStatement.executeUpdate();
        System.out.println("Record created successfully");
    }

    // Read records from the database
    private static void readRecords(Connection connection, String tableName) throws SQLException {
        String selectSQL = "SELECT * FROM " + tableName;
        PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String email = resultSet.getString("email");
            System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
        }
    }

    // Update an existing record
    private static void updateRecord(Connection connection, String tableName, int id, String name, String email)
            throws SQLException {
        String updateSQL = "UPDATE " + tableName + " SET name = ?, email = ? WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(updateSQL);
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, email);
        preparedStatement.setInt(3, id);
        preparedStatement.executeUpdate();
        System.out.println("Record updated successfully");
    }

    // Delete a record from the database
    private static void deleteRecord(Connection connection, String tableName, int id) throws SQLException {
        String deleteSQL = "DELETE FROM " + tableName + " WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
        System.out.println("Record deleted successfully");
    }
}