import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Initiative extends Resource{

	private String Attachment;
	private String Website;
	private String Membership; //replace record with membership type
	private int AssocPID;
	private String AssocActID;
	
	public Initiative() throws SQLException{
		InitiativeQuery query = new InitiativeQuery();
		ResultSet rs = query.getInitiative(Title);
		if(rs != null){
			
			setTitle(rs.getString("Title"));
			setDescription(rs.getString("Description"));
			setStartDate(rs.getDate("StartDate"));
			setEndDate(rs.getDate("EndDate"));
			setAttachment(rs.getString("Attachment"));
			setWebsite(rs.getString("Website"));
			setMembership(rs.getString("Membership"));
			setAssocPID(rs.getInt("AssocPID"));
			setAssocActID(rs.getString("AssocActID"));
		}
	}
	
	public void createInitiative() throws SQLException{
		InitiativeQuery query = new InitiativeQuery();
		query.createInitiative(this);
	}
	
	public void updateInitiative() throws SQLException{
		InitiativeQuery query = new InitiativeQuery();
		query.updateInitiative(this);
	}
	
	public void deleteInitiative() throws SQLException{
		InitiativeQuery query = new InitiativeQuery();
		query.deleteInitiative(Title);
	}
	
	public void setAttachment(String attachment){
		Attachment = attachment;
	}
	
	public void setWebsite(String website){
		Website = website;
	}
	
	public void setAssocPID(int pid){
		AssocPID = pid;
	}
	
	public void setAssocActID(String actID){
		AssocActID = actID;
	}
	
	public void setMembership(String members){
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
