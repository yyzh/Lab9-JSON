import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GenJSON {

	public static void main(String[] args) {

		try {
			
			JSONObject peter = new JSONObject();

			peter.put("name", "peter");
			peter.put("age", 50);
			System.out.println(peter.toString());  // {"age":50,"name":"peter"}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}

