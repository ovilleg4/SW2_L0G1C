
public class Owner extends Role{

	final String Role = "Owner";
	
	public Owner(int resourceId){
		ResourceID = resourceId;
	}
	
	public String getRole(){
		return Role;
	}
}
