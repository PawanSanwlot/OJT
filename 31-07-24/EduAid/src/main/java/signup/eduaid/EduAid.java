package signup.eduaid;

import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.bson.Document;

public class EduAid {
    // Connection details
    private static final String CONNECTION_STRING = "mongodb://localhost:27017";
    private static final String DATABASE_NAME = "Eduaid";
    private static final String COLLECTION_NAME = "volunteer_signup";
    
    public static void createVolunteer(String volunteerid, String volunteername, String volunteeremail, String volunteerprofession, 
        char volunteergender, Date volunteerDOB, int volunteerage, int phone, String volunteerProfilePicture, 
        String volunteerGovtIdPicture, String govtIdNumber, String country, String address, boolean hasJoinedTrustBefore) {
        
        try (MongoClient mc = MongoClients.create(CONNECTION_STRING)) {
            MongoDatabase db = mc.getDatabase(DATABASE_NAME);
            MongoCollection<Document> col = db.getCollection(COLLECTION_NAME);

            Document volunteer = new Document("volunteerid", volunteerid)
                    .append("volunteername", volunteername)
                    .append("volunteeremail", volunteeremail)
                    .append("volunteerprofession", volunteerprofession)
                    .append("volunteergender", volunteergender)
                    .append("volunteerDOB", volunteerDOB)
                    .append("volunteerage", volunteerage)
                    .append("phone", phone)
                    .append("volunteerProfilePicture", volunteerProfilePicture)
                    .append("volunteerGovtIdPicture", volunteerGovtIdPicture)
                    .append("govtIdNumber", govtIdNumber)
                    .append("country", country)
                    .append("address", address)
                    .append("hasJoinedTrustBefore", hasJoinedTrustBefore);

            col.insertOne(volunteer);
            System.out.println("Volunteer details created: " + volunteer.toJson());
        }
    }

    public static void readVolunteer() {
        try (MongoClient mc = MongoClients.create(CONNECTION_STRING)) {
            MongoDatabase db = mc.getDatabase(DATABASE_NAME);
            MongoCollection<Document> col = db.getCollection(COLLECTION_NAME);
        
            FindIterable<Document> volunteers = col.find();
            System.out.println("Volunteer details: ");
            for (Document obj : volunteers) {
                System.out.println(obj.toJson());
            }
        }
    }

    public static void updateVolunteer(String volunteerid, String volunteername, String volunteeremail, String volunteerprofession, 
        char volunteergender, Date volunteerDOB, int volunteerage, int phone, String volunteerProfilePicture, 
        String volunteerGovtIdPicture, String govtIdNumber, String country, String address, boolean hasJoinedTrustBefore) {
        
        try (MongoClient mc = MongoClients.create(CONNECTION_STRING)) {
            MongoDatabase db = mc.getDatabase(DATABASE_NAME);
            MongoCollection<Document> col = db.getCollection(COLLECTION_NAME);
            
            Document updateFields = new Document("volunteername", volunteername)
                    .append("volunteeremail", volunteeremail)
                    .append("volunteerprofession", volunteerprofession)
                    .append("volunteergender", volunteergender)
                    .append("volunteerDOB", volunteerDOB)
                    .append("volunteerage", volunteerage)
                    .append("phone", phone)
                    .append("volunteerProfilePicture", volunteerProfilePicture)
                    .append("volunteerGovtIdPicture", volunteerGovtIdPicture)
                    .append("govtIdNumber", govtIdNumber)
                    .append("country", country)
                    .append("address", address)
                    .append("hasJoinedTrustBefore", hasJoinedTrustBefore);
            
            col.updateOne(Filters.eq("volunteerid", volunteerid), new Document("$set", updateFields));
            System.out.println("Volunteer details updated");
        }
    }

    public static void deleteVolunteer(String volunteerid) {
        try (MongoClient mc = MongoClients.create(CONNECTION_STRING)) {
            MongoDatabase db = mc.getDatabase(DATABASE_NAME);
            MongoCollection<Document> col = db.getCollection(COLLECTION_NAME);
         
            col.deleteOne(Filters.eq("volunteerid", volunteerid));
            System.out.println("Volunteer detail deleted");
        }
    }

    public static void main(String[] args) {
        // Example date format
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        // Callback method / calling method
        try {
            Date dob1 = dateFormat.parse("12/07/1998");
            Date dob2 = dateFormat.parse("22/09/1999");
            Date dob3 = dateFormat.parse("22/09/2000");
            createVolunteer("1", "Harilal", "Hari@mail.com", "Fronend", 'M', dob1, 24, 908765432, 
                            "profilePic1.jpg", "govtIdPic1.jpg", "ID123456", "India", "123 Street, City", true);
            readVolunteer();
            createVolunteer("2", "Pavan", "Pavan@mail.com", "Developer", 'M', dob2, 30, 909876543, 
                            "profilePic2.jpg", "govtIdPic2.jpg", "ID789012", "India", "456 Avenue, City", false);
            readVolunteer();
            createVolunteer("3", "Krishna", "Krishna@mail.com", "FullstackDeveloper", 'M', dob3, 23, 909876543, 
                            "profilePic3.jpg", "govtIdPic3.jpg", "ID345678", "India", "789 Road, City", true);
            readVolunteer();
            updateVolunteer("1", "Hari", "Sreehari@mail.com", "Senior Dev", 'M', dob1, 25, 908765432, 
                            "profilePic1_updated.jpg", "govtIdPic1_updated.jpg", "ID123456", "India", "123 Street, City", true);
            readVolunteer();
//            deleteVolunteer("2");
//            readVolunteer();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
