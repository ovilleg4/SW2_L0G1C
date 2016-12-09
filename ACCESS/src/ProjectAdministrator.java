
public class ProjectAdministrator extends Role{

	final String Role = "PA";
	
	public ProjectAdministrator(int projectId){
		ResourceID = projectId;
	}
	
	public String getRole(){
		return Role;
	}
}
