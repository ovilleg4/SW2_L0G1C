package UserSubsystem;

public class InitiativeAdministrator extends Role{

	final String Role = "IA";
	
	public InitiativeAdministrator(int initiativeId){
		
		ResourceID = initiativeId;
		
		updateProject = false;
		deleteProject = false;
		readProject = true;
		createInitiative = false;
		linkInitiative = false;
		readInitiative = true;
		updateInitiative = false;
		deleteInitiative = false;
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
