import java.io.File;
import java.util.ArrayList;

public class Project extends Resource{

	private String Goal;
	private String Objective;
	private ArrayList<String> Keywords;
	private String DocumentType;
	private String Website;
	private File Attachment;
	//private Record[] Membership; //Record is a place holder for the type of members associated with this project
	private ArrayList<Integer> AssocInitId;  //list of Initiative ID's
	
	public Project(){
		
	}
	
	public void setGoal(String goal){
		Goal = goal;
	}
	
	public void setObjective(String objective){
		Objective = objective;
	}
	
	public void addKeyword(String keyword){
		Keywords.add(keyword);
	}
	
	public void setDocumentType(String documentType){
		DocumentType = documentType;
	}
	
	public void setWebsite(String website){
		Website = website;
	}
	
	public void setAttachment(File attachment){
		Attachment = attachment;
	}
	
	public void addAssocInitID(int initId){
		AssocInitId.add(initId);
	}
	
	public String getGoal(){
		return Goal;
	}	
	
	public String getObjective(){
		return Objective;
	}
	
	public ArrayList<String> Keyword(){
		return Keywords;
	}
	
	public String getDocumentType(){
		return DocumentType;
	}
	
	public String getWebsite(){
		return Website;
	}
	
	public File getAttachment(){
		return Attachment;
	}
}
