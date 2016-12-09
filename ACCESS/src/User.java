import java.util.ArrayList;

public class User {
    protected ArrayList<Role> roles;
    protected String userType;
    
    protected boolean departmentViewing = false;
    protected boolean collegeViewing = false;
    protected boolean universityViewing = false;
    
    public User(){
    	
    }
    
    //check project permissions
    boolean checkProjectUpdateAccess(int ID) {
    	for (int i = 0; i < roles.size(); i++){
    		if (roles.get(i).getResourceID() == ID && roles.get(i).hasUpdateProject()){
    			return true;
    		}
    	}	
    	return false;
    }
    
    boolean checkProjectDeleteAccess(int ID) {
    	for (int i = 0; i < roles.size(); i++){
    		if (roles.get(i).getResourceID() == ID && roles.get(i).hasDeleteProject()){
    			return true;
    		}
    	}	
    	return false;
    }
    
    boolean checkProjectReadAccess(int ID) {
    	for (int i = 0; i < roles.size(); i++){
    		if (roles.get(i).getResourceID() == ID && roles.get(i).hasReadProject()){
    			return true;
    		}
    	}	
    	return false;
    }
    
    // check initiative permissions
    boolean checkInitiativeCreateAccess(int ID) {
    	for (int i = 0; i < roles.size(); i++){
    		if (roles.get(i).getResourceID() == ID && roles.get(i).hasCreateInitiative()){
    			return true;
    		}
    	}	
    	return false;
    }
    
    boolean checkInitiativeLinkAccess(int ID) {
    	for (int i = 0; i < roles.size(); i++){
    		if (roles.get(i).getResourceID() == ID && roles.get(i).hasLinkInitiative()){
    			return true;
    		}
    	}	
    	return false;
    }
    
    boolean checkInitiativeUpdateAccess(int ID) {
    	for (int i = 0; i < roles.size(); i++){
    		if (roles.get(i).getResourceID() == ID && roles.get(i).hasUpdateInitiative()){
    			return true;
    		}
    	}	
    	return false;
    }
    
    boolean checkInitiativeDeleteAccess(int ID) {
    	for (int i = 0; i < roles.size(); i++){
    		if (roles.get(i).getResourceID() == ID && roles.get(i).hasDeleteInitiative()){
    			return true;
    		}
    	}	
    	return false;
    }
    
    boolean checkInitiativeReadAccess(int ID) {
    	for (int i = 0; i < roles.size(); i++){
    		if (roles.get(i).getResourceID() == ID && roles.get(i).hasReadInitiative()){
    			return true;
    		}
    	}	
    	return false;
    }
    
    //check Activity permissions
    boolean checkActivityCreateAccess(int ID) {
    	for (int i = 0; i < roles.size(); i++){
    		if (roles.get(i).getResourceID() == ID && roles.get(i).hasCreateActivity()){
    			return true;
    		}
    	}	
    	return false;
    }
    
    
    boolean checkActivityReadAccess(int ID) {
    	for (int i = 0; i < roles.size(); i++){
    		if (roles.get(i).getResourceID() == ID && roles.get(i).hasReadActivity()){
    			return true;
    		}
    	}	
    	return false;
    }
    
    boolean checkActivityLinkAccess(int ID) {
    	for (int i = 0; i < roles.size(); i++){
    		if (roles.get(i).getResourceID() == ID && roles.get(i).hasLinkActivity()){
    			return true;
    		}
    	}	
    	return false;
    }
    
    boolean checkActivityUpdateAccess(int ID) {
    	for (int i = 0; i < roles.size(); i++){
    		if (roles.get(i).getResourceID() == ID && roles.get(i).hasUpdateActivity()){
    			return true;
    		}
    	}	
    	return false;
    }
    
    boolean checkActivityDeleteAccess(int ID) {
    	for (int i = 0; i < roles.size(); i++){
    		if (roles.get(i).getResourceID() == ID && roles.get(i).hasDeleteActivity()){
    			return true;
    		}
    	}	
    	return false;
    }
    
    
    
    
}