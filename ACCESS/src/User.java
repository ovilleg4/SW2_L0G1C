public class User {
    private Role[] roles;
    private String userType;

    boolean checkUserReadAccess(int ID) {
	for (int i = 0; i < this.roles.length; i++)
	    if (this.roles[i].getID() == ID && this.roles[i].hasReadAccess())
		return true;
	return false;
    }
}
