package Login.eduaid;
import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import org.bson.Document;

public class LoginForm {
    private static final String CONNECTION_STRING = "mongodb://localhost:27017";
    private static final String DATABASE_NAME = "Eduaid";
    private static final String COLLECTION_NAME = "login";

    public static void createUser(String userId, String username, String email, String password) {
        try (MongoClient mc = MongoClients.create(CONNECTION_STRING)) {
            MongoDatabase db = mc.getDatabase(DATABASE_NAME);
            MongoCollection<Document> col = db.getCollection(COLLECTION_NAME);

            Document user = new Document("userId", userId)
                    .append("username", username)
                    .append("email", email)
                    .append("password", password);

            col.insertOne(user);
            System.out.println("User created: " + user.toJson());
        }
    }

    public static void readUsers() {
        try (MongoClient mc = MongoClients.create(CONNECTION_STRING)) {
            MongoDatabase db = mc.getDatabase(DATABASE_NAME);
            MongoCollection<Document> col = db.getCollection(COLLECTION_NAME);

            FindIterable<Document> users = col.find();
            System.out.println("User details: ");
            for (Document obj : users) {
                System.out.println(obj.toJson());
            }
        }
    }

    public static void updateUser(String userId, String username, String email, String password) {
        try (MongoClient mc = MongoClients.create(CONNECTION_STRING)) {
            MongoDatabase db = mc.getDatabase(DATABASE_NAME);
            MongoCollection<Document> col = db.getCollection(COLLECTION_NAME);

            Document updateFields = new Document("username", username)
                    .append("email", email)
                    .append("password", password);

            col.updateOne(Filters.eq("userId", userId), new Document("$set", updateFields));
            System.out.println("User details updated");
        }
    }

    public static void deleteUser(String userId) {
        try (MongoClient mc = MongoClients.create(CONNECTION_STRING)) {
            MongoDatabase db = mc.getDatabase(DATABASE_NAME);
            MongoCollection<Document> col = db.getCollection(COLLECTION_NAME);

            col.deleteOne(Filters.eq("userId", userId));
            System.out.println("User detail deleted");
        }
    }

    public static void main(String[] args) {
        try {
            createUser("1", "johndoe", "john.doe@mail.com", "password123");
            readUsers();
            createUser("2", "janedoe", "jane.doe@mail.com", "securepassword");
            readUsers();
            updateUser("1", "john_doe", "john.doe@mail.com", "newpassword123");
            readUsers();
//            deleteUser("2");
//            readUsers();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
