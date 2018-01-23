package sys.spvisor.core.dao;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.bson.Document;
import org.bson.json.JsonReader;
import org.bson.types.ObjectId;

public class MongodbDao {
	
	private MongoClient mongoClient = null;
	private MongoDatabase database = null;
	private MongoCollection<Document> collection = null;
//	MongoClient mongoClient = new MongoClient("localhost" , 27017 );
//	MongoDatabase database = mongoClient.getDatabase("test_database");
//	MongoCollection<Document> collection = database.getCollection("data");
	static MongodbDao MongoDatabase = null;
	
	public static MongodbDao getDatabase(){
		if(MongoDatabase == null){
			MongoDatabase = new MongodbDao();
			return MongoDatabase;
		}else{
			return MongoDatabase;
		}
	}
	
	public MongodbDao(){
		try {
			mongoClient = new MongoClient("localhost", 27017);
        } catch (MongoException e) {
            e.printStackTrace();
        }
        //获取temp DB；如果默认没有创建，mongodb会自动创建
		database = mongoClient.getDatabase("test_database");
        //获取users DBCollection；如果默认没有创建，mongodb会自动创建
		collection = database.getCollection("data");
	}
	
	
	public void destroy() {
        if (mongoClient != null)
        	mongoClient.close();
        mongoClient = null;
        database = null;
        database = null;
    }
	
	//查询，不指定查询条件
	public MongoCursor<Document> query_all(String proid,List<String> projection_str,boolean project_all){
		
		if(project_all==true){
			FindIterable<Document> findIterable = collection.find();  
	        MongoCursor<Document> mongoCursor = findIterable.iterator();
	        return mongoCursor;
		}
		Document projection = new Document();
		for(int i=0;i<projection_str.size();++i){
			projection.append(projection_str.get(i), 1);
		}
		FindIterable<Document> findIterable = collection.find(new Document("proId",proid)).projection(projection);  
        MongoCursor<Document> mongoCursor = findIterable.iterator();
        return mongoCursor;        
	}


	//通过objectid查询
	public MongoCursor<Document> query_byId(String obid,List<String> projection_str,boolean project_all){
		/*		
		BasicDBObject query = new BasicDBObject();
		query.put("_id", new ObjectId(obid));
	    
		String query_str = "";
		for(Map.Entry<String, String> entry:query.entrySet()){
			if(entry.getKey()=="_id"){
				query_str += ",\""+entry.getKey()+"\""+":\""+entry.getValue()+"\"";
			}
			query_str += ",\""+entry.getKey()+"\""+":\""+entry.getValue()+"\"";
		}
		if(query.isEmpty()){
			query_str = "{}";
		}
		else{
			query_str = "{"+query_str.substring(1)+"}";
		}
		System.out.println("query:"+query_str);
*/		
//		Document doc = Document.parse(query_str);
		if(project_all==true){
			FindIterable<Document> findIterable = collection.find(new Document("_id",new ObjectId(obid)));  
	        MongoCursor<Document> mongoCursor = findIterable.iterator();
	        return mongoCursor;
		}
		Document projection = new Document();
		for(int i=0;i<projection_str.size();++i){
			projection.append(projection_str.get(i), 1);
		}
		FindIterable<Document> findIterable = collection.find(new Document("_id",new ObjectId(obid))).projection(projection);  
        MongoCursor<Document> mongoCursor = findIterable.iterator();
        return mongoCursor;        
	}
	
	//插入json数据
	public void insert(String json_str,String _id){
		System.out.println("mongodb:"+json_str);
//		JsonReader reader = new JsonReader(json_str);
		Document doc = Document.parse(json_str);
		List<Document> documents = new ArrayList<Document>();  
		documents.add(doc);
		if(_id != null){
			Document doctmp = new Document();
			doctmp.put("_id", new ObjectId(_id));
			collection.deleteOne(doctmp);
		}	
		collection.insertMany(documents);	
	}

}
