import java.io.File;
import java.util.ArrayList;

public class Initiative extends Resource{

	private String Attachment;
	private String Website;
	private String Membership; //replace record with membership type
	private int AssocPID;
	private String AssocActID;
	
	public Initiative(){
		ProjectQuery query = new ProjectQuery();
		ResultSet rs = query.getProject(Title);
		if(rs != null){
			setTitle(rs.getString("Title"));
			setDescription(rs.getString("Description"));
			setStartDate(rs.getDate("StartDate"));
			setEndDate(rs.getDate("EndDate"));
			setGoal(rs.getString("Attachment"));
			setObjective(rs.getString("Website"));
			setKeyword(rs.getString("Membership"));
			setDocumentType(rs.getInt("AssocPID"));
			setAttachment(rs.getInt("AssocActID"));
		}
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
	
	public void setAssocActID(int actID){
		AssocActID = actID;
	}
	
	public void setMember(String members){
		Membership = members;
	}
	
	public String getAttachment(){
		return Attachment;
	}
	
	public String getWebsite(){
		return Website;
	}
	
	public int getAssocPID(){
		return AssocPID;
	}
	
	public String getAssocActID(){
		return AssocActID;
	}
	
	public String getMemberships(){
		return Membership;
	}
}	
