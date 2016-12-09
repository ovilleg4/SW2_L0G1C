
public class InitiativeAdministrator extends Role{

	final String Role = "IA";
	
	public InitiativeAdministrator(int initiativeId){
		ResourceID = initiativeId;
	}
	
	public String getRole(){
		return Role;
	}

}
