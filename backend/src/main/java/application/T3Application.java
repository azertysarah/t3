package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;
@SpringBootApplication
public class T3Application {
    public static void main(String[] args) {
        SpringApplication.run(T3Application.class, args);

        MongoClient client = MongoClients.create("mongodb+srv://sarah:ZG78Ikl5oYtkTiJO@cluster0.etrektj.mongodb.net/?retryWrites=true&w=majority");
        MongoDatabase db = client.getDatabase("T3");
        /*MongoCollection<Document> collection = db.getCollection("monuments");

        Document monument1 = collection.find(new Document()).first();
        System.out.println("Monument 1: " + monument1.toJson());

        String targetSiecle = "Néolithique";

        List<Document> monuments = collection.find(Filters.eq("fields.siecle", targetSiecle)).into(new ArrayList<>());

        if (!monuments.isEmpty()) {
            for (Document monument : monuments) {
                System.out.println(monument.toJson());
            }
        } else {
            System.out.println("No monuments found from the specified century.");
        }*/
    }
}