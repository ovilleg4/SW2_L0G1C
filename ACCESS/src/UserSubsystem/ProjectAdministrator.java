package UserSubsystem;

public class ProjectAdministrator extends Role{

	final String Role = "PA";
	
	public ProjectAdministrator(int projectId){
		
		ResourceID = projectId;
		
		updateProject = false;
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
