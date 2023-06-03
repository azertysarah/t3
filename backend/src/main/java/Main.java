import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Main {
    public static void main(String[] args) {
        MongoClient client = MongoClients.create("mongodb+srv://sarah:ZG78Ikl5oYtkTiJO@cluster0.etrektj.mongodb.net/?retryWrites=true&w=majority");
        MongoDatabase db = client.getDatabase("T3");
        MongoCollection<Document> collection = db.getCollection("monuments");

        Document monument1 = collection.find(new Document()).first();
        System.out.println("Monument 1: " + monument1.toJson());
    }
}