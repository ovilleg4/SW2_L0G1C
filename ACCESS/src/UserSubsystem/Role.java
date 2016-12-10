package UserSubsystem;

public abstract class Role {

	protected int ResourceID;
	
	protected boolean updateProject;
	protected boolean deleteProject;
	protected boolean readProject;
	protected boolean createInitiative;
	protected boolean linkInitiative;
	protected boolean readInitiative;
	protected boolean updateInitiative;
	protected boolean deleteInitiative;
	protected boolean createActivity;
	protected boolean readActivity;
	protected boolean linkActivity;
	protected boolean updateActivity;
	protected boolean deleteActivity;
	
	
	public int getResourceID() {
		return ResourceID;
	}

	public boolean hasUpdateProject() {
		return updateProject;
	}

	public boolean hasDeleteProject() {
		return deleteProject;
	}

	public boolean hasReadProject() {
		return readProject;
	}

	public boolean hasCreateInitiative() {
		return createInitiative;
	}

	public boolean hasLinkInitiative() {
		return linkInitiative;
	}

	public boolean hasReadInitiative() {
		return readInitiative;
	}

	public boolean hasUpdateInitiative() {
		return updateInitiative;
	}

	public boolean hasDeleteInitiative() {
		return deleteInitiative;
	}

	public boolean hasCreateActivity() {
		return createActivity;
	}

	public boolean hasReadActivity() {
		return readActivity;
	}

	public boolean hasLinkActivity() {
		return linkActivity;
	}

	public boolean hasUpdateActivity() {
		return updateActivity;
	}

	public boolean hasDeleteActivity() {
		return deleteActivity;
	}
	
	

}
