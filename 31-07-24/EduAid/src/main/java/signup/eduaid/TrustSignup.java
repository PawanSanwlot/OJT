package signup.eduaid;

import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import java.util.Date;
import org.bson.Document;

public class TrustSignup {
    private static final String CONNECTION_STRING = "mongodb://localhost:27017";
    private static final String DATABASE_NAME = "Eduaid";
    private static final String COLLECTION_NAME = "trust_signup";
    
    public static void createTrust(String trustId, String trustName, String trustEmail, Date registrationDate, String country, String address, String trustProfilePicture) {
        try (MongoClient mc = MongoClients.create(CONNECTION_STRING)) {
            MongoDatabase db = mc.getDatabase(DATABASE_NAME);
            MongoCollection<Document> col = db.getCollection(COLLECTION_NAME);

            Document trust = new Document("trustId", trustId)
                    .append("trustName", trustName)
                    .append("trustEmail", trustEmail)
                    .append("registrationDate", registrationDate)
                    .append("country", country)
                    .append("address", address)
                    .append("trustProfilePicture", trustProfilePicture);

            col.insertOne(trust);
            System.out.println("Trust details created: " + trust.toJson());
        }
    }

    public static void readTrusts() {
        try (MongoClient mc = MongoClients.create(CONNECTION_STRING)) {
            MongoDatabase db = mc.getDatabase(DATABASE_NAME);
            MongoCollection<Document> col = db.getCollection(COLLECTION_NAME);
        
            FindIterable<Document> trusts = col.find();
            System.out.println("Trust details: ");
            for (Document obj : trusts) {
                System.out.println(obj.toJson());
            }
        }
    }

    public static void updateTrust(String trustId, String trustName, String trustEmail, Date registrationDate, String country, String address, String trustProfilePicture) {
        try (MongoClient mc = MongoClients.create(CONNECTION_STRING)) {
            MongoDatabase db = mc.getDatabase(DATABASE_NAME);
            MongoCollection<Document> col = db.getCollection(COLLECTION_NAME);
            
            Document updateFields = new Document("trustName", trustName)
                    .append("trustEmail", trustEmail)
                    .append("registrationDate", registrationDate)
                    .append("country", country)
                    .append("address", address)
                    .append("trustProfilePicture", trustProfilePicture);
            
            col.updateOne(Filters.eq("trustId", trustId), new Document("$set", updateFields));
            System.out.println("Trust details updated");
        }
    }

    public static void deleteTrust(String trustId) {
        try (MongoClient mc = MongoClients.create(CONNECTION_STRING)) {
            MongoDatabase db = mc.getDatabase(DATABASE_NAME);
            MongoCollection<Document> col = db.getCollection(COLLECTION_NAME);
         
            col.deleteOne(Filters.eq("trustId", trustId));
            System.out.println("Trust detail deleted");
        }
    }

    public static void main(String[] args) {
        try {
            createTrust("1", "Helping Hands", "contact@helpinghands.com", new Date(), "India", "123 Street, City", "trustPic1.jpg");
            readTrusts();
            createTrust("2", "Caring Hearts", "contact@caringhearts.com", new Date(), "USA", "456 Avenue, City", "trustPic2.jpg");
            readTrusts();
            createTrust("3", "Goodwill Trust", "contact@goodwilltrust.com", new Date(), "UK", "789 Road, City", "trustPic3.jpg");
            readTrusts();
            updateTrust("1", "Helping Hands Foundation", "contact@helpinghands.com", new Date(), "India", "123 Street, City", "trustPic1_updated.jpg");
            readTrusts();
//            deleteTrust("2");
//            readTrusts();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
