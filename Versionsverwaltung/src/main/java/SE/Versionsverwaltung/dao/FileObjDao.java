package SE.Versionsverwaltung.dao;

import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;
import SE.Versionsverwaltung.model.FileObj;
import com.mongodb.MongoException;
import com.mongodb.client.*;
import com.mongodb.client.result.InsertOneResult;
import org.bson.Document;

public interface FileObjDao {
    String uri = "mongodb+srv://maxikami:dVmonsq4559iB5JL@cluster1.eot2cys.mongodb.net/?retryWrites=true&w=majority";

    static FileObj getFileObjByID(String fileID) {

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("files_db");
            MongoCollection<Document> collection = database.getCollection("files_collection");

            Document doc = collection.find(eq("fileID", fileID)).first();
            if (doc != null) {
                return generateFileObj(doc);
            } else {
                System.out.println("No matching documents found.");
                return null;
            }
        }
    }

    static FileObj getFileObjByNameAndVersion(String fileName, String fileVersion){

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("files_db");
            MongoCollection<Document> collection = database.getCollection("files_collection");

            Document doc = collection.find(and(eq("fileName", fileName),eq("fileVersion", fileVersion))).first();
            if (doc != null) {
                return generateFileObj(doc);
            } else {
                System.out.println("No matching documents found.");
                return null;
            }
        }
    }

    static Boolean insertDocument(FileObj fileObj){

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("files_db");
            MongoCollection<Document> collection = database.getCollection("files_collection");

            Document doc = generateDocument(fileObj);
            try{
                InsertOneResult result = collection.insertOne(doc);
                System.out.println("Inserted document: " + result.getInsertedId());
                return true;
            } catch (MongoException me) {
                System.err.println("Unable to insert document: " + me);
                return false;
            }
        }
    }

    static Document generateDocument(FileObj fileObj){
        return new Document()
                .append("fileID", fileObj.getFileID())
                .append("fileName", fileObj.getFileName())
                .append("fileText", fileObj.getFileText())
                .append("fileVersion", fileObj.getFileVersion())
                .append("fileParent", fileObj.getFileParent())
                .append("fileEditor", fileObj.getFileEditor())
                .append("fileBlocked", false);
    }

    static FileObj generateFileObj(Document doc){
        return new FileObj(
                doc.getString("fileID"),
                doc.getString("fileName"),
                doc.getString("fileText"),
                doc.getString("fileVersion"),
                doc.getString("fileParent"),
                doc.getString("fileEditor"),
                doc.getBoolean("fileBlocked"));
    }
}