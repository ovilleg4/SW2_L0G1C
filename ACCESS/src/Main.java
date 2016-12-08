import org.json.JSONException;
import org.json.JSONObject;

public class Main {
	public static void main(String[] args) throws JSONException{
		Initiative i = new Initiative();
		i.setTitle("Going No Where");
		//System.out.println(i.getTitle());
		JSONObject j = new JSONObject(i);
		
	}
}
