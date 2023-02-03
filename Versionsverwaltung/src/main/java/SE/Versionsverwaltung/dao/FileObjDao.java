package SE.Versionsverwaltung.dao;

import static com.mongodb.client.model.Filters.eq;
import SE.Versionsverwaltung.model.FileObj;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
public interface FileObjDao {

    public String uri = "mongodb+srv://maxikami:dVmonsq4559iB5JL@cluster1.eot2cys.mongodb.net/?retryWrites=true&w=majority";
    public static void getFileByID(String fileID) {

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("files_db");
            MongoCollection<Document> collection = database.getCollection("files_collection");

            Document doc = collection.find(eq("fileID", fileID)).first();
            if (doc != null) {
                System.out.println(doc.toJson());
            } else {
                System.out.println("No matching documents found.");
            }
        }
    }
}