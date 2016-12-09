
public class Evaluator extends Role{
	
	final String Role = "Evaluator";
	
	public Evaluator(int resourceId){
		
		ResourceID = resourceId;
		
		updateProject = false;
		deleteProject = false;
		readProject = true;
		createInitiative = false;
		linkInitiative = false;
		readInitiative = false;
		updateInitiative = false;
		deleteInitiative = false;
		createActivity = false;
		readActivity = false;
		linkActivity = false;
		updateActivity = false;
		deleteActivity = false;
	}
	
	public String getRole(){
		return Role;
	}
}
