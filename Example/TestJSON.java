import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TestJSON {

	public static void main(String[] args) {

		String jsonstring = "{\"name\":\"peter\",\"age\":50}";
		
		try {
			
			JSONObject peter = new JSONObject(jsonstring);

			int age = peter.getInt("age");
			String name = peter.getString("name");
			System.out.println(name + " " + age);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}

