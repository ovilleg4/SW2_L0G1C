package UserSubsystem;

public class Owner extends Role{

	final String Role = "Owner";
	
	public Owner(int resourceId){
		
		ResourceID = resourceId;
		
		updateProject = true;
		deleteProject = true;
		readProject = true;
		createInitiative = true;
		linkInitiative = true;
		readInitiative = true;
		updateInitiative = true;
		deleteInitiative = true;
		createActivity = true;
		readActivity = true;
		linkActivity = true;
		updateActivity = true;
		deleteActivity = true;
	}
	
	public String getRole(){
		return Role;
	}
}
