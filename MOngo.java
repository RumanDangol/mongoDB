package sd;



import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Indexes;
import com.mongodb.util.JSON;

public class MOngo {

	public static void main(String[] args) throws InterruptedException {
		
		/**
		 * CountDownlatch is used to wait until a no of thread is finished
		 * no of thread is passed as an arguments
		 */
		CountDownLatch latch = new CountDownLatch(1);
		/**
		 * Connect to mongo by mongo client
		 * by default localhost as sever
		 * and port 27017 as default port
		 */
		MongoClient mongoClient = new MongoClient();
		/**
		 * Get database
		 * if database doesnot exit it will create it
		 */
		MongoDatabase db = mongoClient.getDatabase("test");
		
		/**
		 * get collection table from test1
		 * if not exit it will create
		 */
//		MongoCollection<Document> animals = db.getCollection("animals");
		MongoCollection<Document> students = db.getCollection("students");
		

		/**
		 * insert into collection as document where lala is field and hehe is value
		 */
		//collection.insertOne(new Document("lala", "hehe"));
		/**
		 * mongodb assingmnet 3
		 */
//		Document animal = new Document("animal", "monkey");
//		
//		animals.insertOne(animal);
//		animal.remove("monkey");
//		animal.append("animal", "cat");
//		animals.insertOne(animal);
//		animal.remove("animal");
//		animal.append("animal", "lion");
//		animals.insertOne(animal);
		
		/**
		 * mongodb assignment2
		 */
		
//		
//		Document student = new Document();
//		
//
//		student.put("first_name", "John");
//		student.put("last_name", "Doe");
//		student.put("data_of_admission", "2010-02-21T05:00:00Z");
//		student.put("residence_hall", "Fairweather");
//		student.put("has_car", true);
//		student.put("student_id", "2348023902");
//		
//		
//		List<String> classes = new ArrayList<>();
//		classes.add("['His343','Math234','Phy123','Art232']");
//				       
//		student.put("current_classes", classes);
//			
//		students.insertOne(student);
			
//		students.createIndex(Indexes.ascending("first_name"));
//		students.createIndex(Indexes.ascending("last_name"));
//			
		students.dropIndexes();
		latch.await();
		
		
		mongoClient.close();

	}

}
