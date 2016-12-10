package ResourceSubsystem;
import UserSubsystem.Role;

public class ActivityEditor extends Role{

	final String Role = "AE";
	
	public ActivityEditor(int activityId){
		
		ResourceID = activityId;
		
		updateProject = false;
		deleteProject = false;
		readProject = false;
		createInitiative = false;
		linkInitiative = false;
		readInitiative = false;
		updateInitiative = false;
		deleteInitiative = false;
		createActivity = false;
		readActivity = true;
		linkActivity = false;
		updateActivity = true;
		deleteActivity = false;
	}
	
	public String getRole(){
		return Role;
	}
}
