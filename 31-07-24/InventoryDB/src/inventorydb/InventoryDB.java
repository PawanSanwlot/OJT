package inventorydb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InventoryDB {

    private static final String URL = "jdbc:mysql://localhost:3307/";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    public static void main(String[] args) {
        String databaseName = "InventoryDB";  // Note: Correct the typo in the actual name of your database if needed.
        String tableName = "products";

        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);

            createDatabase(connection, databaseName);

            connection.setCatalog(databaseName);

            createTable(connection, tableName);

//            createRecord(connection, tableName, "Mac", 89.70, 5);
            createRecord(connection, tableName, "XBox", 50.70, 15);
            createRecord(connection, tableName, "iphone", 99.70, 50);
            
            readRecords(connection, tableName);

//            updateRecord(connection, tableName, 1, "Alexander", "alexander@mail.com");
//
//            deleteRecord(connection, tableName, 1);
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createDatabase(Connection connection, String databaseName) throws SQLException {
        String createDatabaseSQL = "CREATE DATABASE IF NOT EXISTS " + databaseName;
        Statement statement = connection.createStatement();
        statement.executeUpdate(createDatabaseSQL);
        System.out.println("Database created successfully");
    }

    private static void createTable(Connection connection, String tableName) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS " + tableName + " ("
                + "product_id INT AUTO_INCREMENT PRIMARY KEY, "
                + "product_name VARCHAR(255) NOT NULL, "
                + "price DOUBLE NOT NULL, "
                + "stock_quantity INT NOT NULL)";
        Statement statement = connection.createStatement();
        statement.executeUpdate(createTableSQL);
        System.out.println("Table created successfully");
    }

    private static void createRecord(Connection connection, String tableName, String product_name, double price, int stock_quantity)
            throws SQLException {
        String insertSQL = "INSERT INTO " + tableName + " (product_name, price, stock_quantity) VALUES (?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
        preparedStatement.setString(1, product_name);
        preparedStatement.setDouble(2, price);
        preparedStatement.setInt(3, stock_quantity);
        preparedStatement.executeUpdate();
        System.out.println("Record created successfully");
    }

    private static void readRecords(Connection connection, String tableName) throws SQLException {
        String selectSQL = "SELECT * FROM " + tableName;
        PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            int product_id = resultSet.getInt("product_id");
            String product_name = resultSet.getString("product_name");
            double price = resultSet.getDouble("price");
            int stock_quantity = resultSet.getInt("stock_quantity");
            System.out.println("product_id: " + product_id + ", product_name: " + product_name + ", price: " + price + ", stock_quantity: " + stock_quantity);
        }
    }
}
