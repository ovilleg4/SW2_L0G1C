import java.sql.ResultSet;
import java.sql.SQLException;

public class Activity extends Resource{

	private String Keyword;
	private String Classification;
	private String Semester;
	private String CourseName;
	private String Participants; //Repalace Record with type of participants
	private int AssocInitID;
	
	public Activity() throws SQLException{
		
		ProjectQuery query = new ProjectQuery();
		ResultSet rs = query.getProject(Title);
		if(rs != null){
			
			setTitle(rs.getString("Title"));
			setDescription(rs.getString("Description"));
			setStartDate(rs.getDate("StartDate"));
			setEndDate(rs.getDate("EndDate"));
			setKeyword(rs.getString("Keyword"));
			setClassification(rs.getString("Classification"));
			setSemester(rs.getString("Semester"));
			setParticipants(rs.getString("Participants"));
			setAssocInitID(rs.getInt("AssocInitID"));
			
		}
	}
	
	public void createProject() throws SQLException{
		ActivityQuery query = new ActivityQuery();
		query.createProject(this);
	}
	
	public void updateProject()throws SQLException{
		ActivityQuery query = new ActivityQuery();
		query.updateActivity(this);
	}
	
	public void deleteProject() throws SQLException{
		ProjectQuery query = new ProjectQuery();
		query.deleteProject(Title);
	}
	
	public void setKeyword(String keyword){
		Keyword = keyword;
	}
	
	public void setParticipants(String student){
		Participants = student;
	}
	
	public void setClassification(String classification){
		Classification = classification;
	}
	
	public void setSemester(String semester){
		Semester = semester;
	}
	
	public void setAssocInitID(int initId){
		AssocInitID = initId;
	}
	
	public void setCourseName(String course){
		CourseName = course;
	}
	
	public String getKeyword(){
		return Keyword;
	}
	
	public String getClassification(){
		return Classification;
	}
	
	public String getSemester(){
		return Semester;
	}
	
	public String getCourseName(){
		return CourseName;
	}
	
	public int getAssocInitID(){
		return AssocInitID;
	}
	
	public String getParticipants(){
		return Participants;
	}
	
}
