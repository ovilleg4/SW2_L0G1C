import java.io.File;
import java.util.ArrayList;

public class Initiative extends Resource{

	private File Attachment;
	private String Website;
	//private Record[] Membership; //replace record with membership type
	private int AssocPID;
	private ArrayList<Integer> AssocActID;
	
	public Initiative(){
	
	}
	
	public void setAttachent(File attachment){
		Attachment = attachment;
	}
	
	public void setWebsite(String website){
		Website = website;
	}
	
	public void setAssocPID(int pid){
		AssocPID = pid;
	}
	
	public void addAssocActID(int actID){
		AssocActID.add(actID);
	}
	
	public File getAttachement(){
		return Attachment;
	}
	
	public String getWebsite(){
		return Website;
	}
	
	public int getAssocPID(){
		return AssocPID;
	}
	
	public ArrayList<Integer> getAssocActID(){
		return AssocActID;
	}
}	
