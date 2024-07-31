package signup.eduaid;

import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.bson.Document;

public class DonorSignup {
    private static final String CONNECTION_STRING = "mongodb://localhost:27017";
    private static final String DATABASE_NAME = "Eduaid";
    private static final String COLLECTION_NAME = "donor_signup";
    
    public static void createDonor(String donorId, String donorName, String donorEmail, char donorGender, Date donorDOB, int donorAge, int phone, String country, String address, String donationType, double donationAmount, String donorProfilePicture) {
        try (MongoClient mc = MongoClients.create(CONNECTION_STRING)) {
            MongoDatabase db = mc.getDatabase(DATABASE_NAME);
            MongoCollection<Document> col = db.getCollection(COLLECTION_NAME);

            Document donor = new Document("donorId", donorId)
                    .append("donorName", donorName)
                    .append("donorEmail", donorEmail)
                    .append("donorGender", donorGender)
                    .append("donorDOB", donorDOB)
                    .append("donorAge", donorAge)
                    .append("phone", phone)
                    .append("country", country)
                    .append("address", address)
                    .append("donationType", donationType)
                    .append("donationAmount", donationAmount)
                    .append("donorProfilePicture", donorProfilePicture);

            col.insertOne(donor);
            System.out.println("Donor details created: " + donor.toJson());
        }
    }

    public static void readDonors() {
        try (MongoClient mc = MongoClients.create(CONNECTION_STRING)) {
            MongoDatabase db = mc.getDatabase(DATABASE_NAME);
            MongoCollection<Document> col = db.getCollection(COLLECTION_NAME);
        
            FindIterable<Document> donors = col.find();
            System.out.println("Donor details: ");
            for (Document obj : donors) {
                System.out.println(obj.toJson());
            }
        }
    }

    public static void updateDonor(String donorId, String donorName, String donorEmail, char donorGender, Date donorDOB, int donorAge, int phone, String country, String address, String donationType, double donationAmount, String donorProfilePicture) {
        try (MongoClient mc = MongoClients.create(CONNECTION_STRING)) {
            MongoDatabase db = mc.getDatabase(DATABASE_NAME);
            MongoCollection<Document> col = db.getCollection(COLLECTION_NAME);
            
            Document updateFields = new Document("donorName", donorName)
                    .append("donorEmail", donorEmail)
                    .append("donorGender", donorGender)
                    .append("donorDOB", donorDOB)
                    .append("donorAge", donorAge)
                    .append("phone", phone)
                    .append("country", country)
                    .append("address", address)
                    .append("donationType", donationType)
                    .append("donationAmount", donationAmount)
                    .append("donorProfilePicture", donorProfilePicture);
            
            col.updateOne(Filters.eq("donorId", donorId), new Document("$set", updateFields));
            System.out.println("Donor details updated");
        }
    }

    public static void deleteDonor(String donorId) {
        try (MongoClient mc = MongoClients.create(CONNECTION_STRING)) {
            MongoDatabase db = mc.getDatabase(DATABASE_NAME);
            MongoCollection<Document> col = db.getCollection(COLLECTION_NAME);
         
            col.deleteOne(Filters.eq("donorId", donorId));
            System.out.println("Donor detail deleted");
        }
    }

    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date dob1 = dateFormat.parse("12/07/1990");
            Date dob2 = dateFormat.parse("22/09/1985");
            Date dob3 = dateFormat.parse("15/03/1978");
            createDonor("1", "John Doe", "john@mail.com", 'M', dob1, 31, 908765432, "USA", "123 Street, City", "Blood", 0.0, "profilePic1.jpg");
            readDonors();
            createDonor("2", "Jane Smith", "jane@mail.com", 'F', dob2, 36, 909876543, "Canada", "456 Avenue, City", "Money", 500.0, "profilePic2.jpg");
            readDonors();
            createDonor("3", "Alice Brown", "alice@mail.com", 'F', dob3, 43, 909876543, "UK", "789 Road, City", "Clothes", 0.0, "profilePic3.jpg");
            readDonors();
            updateDonor("1", "John Doe", "john.new@mail.com", 'M', dob1, 32, 908765432, "USA", "123 Street, City", "Blood", 0.0, "profilePic1_updated.jpg");
            readDonors();
//            deleteDonor("2");
//            readDonors();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
