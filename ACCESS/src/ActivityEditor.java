
public class ActivityEditor extends Role{

	final String Role = "AE";
	
	public ActivityEditor(int activityId){
		ResourceID = activityId;
	}
	
	public String getRole(){
		return Role;
	}
}
