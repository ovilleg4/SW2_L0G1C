package ResourceSubsystem;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DBsubsystem.ProjectQuery;

public class Project extends Resource{

	private String Goal;
	private String Objective;
	private String Keyword;
	private String DocumentType;
	private String Website;
	private String Attachment;
	private String Membership; //Record is a place holder for the type of members associated with this project
	private String AssocInitId;  //list of Initiative ID's
	
	public Project(String Title) throws SQLException{
		
		ProjectQuery query = new ProjectQuery();
		ResultSet rs = query.getProject(Title);
		if(rs != null){
			
			setTitle(rs.getString("Title"));
			setDescription(rs.getString("Description"));
			setStartDate(rs.getDate("StartDate"));
			setEndDate(rs.getDate("EndDate"));
			setGoal(rs.getString("Goal"));
			setObjective(rs.getString("Objective"));
			setKeyword(rs.getString("Keyword"));
			setDocumentType(rs.getString("DocumentType"));
			setAttachment(rs.getString("Attachment"));
			setWebsite(rs.getString("Website"));
			setMember(rs.getString("Membership"));
			setAssocInitID(rs.getString("AssocInitID"));
			
		}
	}
	
	public void createProject() throws SQLException{
		ProjectQuery query = new ProjectQuery();
		query.createProject(this);
	}
	
	public void updateProject()throws SQLException{
		ProjectQuery query = new ProjectQuery();
		query.updateProject(this);
	}
	
	public void deleteProject() throws SQLException{
		ProjectQuery query = new ProjectQuery();
		query.deleteProject(Title);
	}
	
	public Project(){
		
	}
	
	public void setGoal(String goal){
		Goal = goal;
	}
	
	public void setObjective(String objective){
		Objective = objective;
	}
	
	public void setKeyword(String keyword){
		Keyword = keyword;
	}
	
	public void setMember(String member){
		Membership = member;
	}
	
	public void setDocumentType(String documentType){
		DocumentType = documentType;
	}
	
	public void setWebsite(String website){
		Website = website;
	}
	
	public void setAttachment(String attachment){
		Attachment = attachment;
	}
	
	public void setAssocInitID(String initId){
		AssocInitId = initId;
	}
	
	public String getGoal(){
		return Goal;
	}	
	
	public String getObjective(){
		return Objective;
	}
	
	public String getKeyword(){
		return Keyword;
	}
	
	public String getDocumentType(){
		return DocumentType;
	}
	
	public String getWebsite(){
		return Website;
	}
	
	public String getAttachment(){
		return Attachment;
	}
	
	public String getMembers(){
		return Membership;
	}

	public String getAssocInitID(){
		return AssocInitId;
	}
	
	
	
}
