import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class ProjectQuery extends Query{
	
	public ProjectQuery() throws SQLException{
		table = "project";
		ds = new Database();
		ds.connect();
	}
	
	public ResultSet getProject(String title){
		Statement stmt = null;
		try {
			stmt = ds.con.createStatement();
			String sql = "SELECT * FROM " + table + " WHERE Title = "+title; 
			ResultSet rs = stmt.executeQuery(sql);
			return rs;

		}catch (SQLException e){
			e.printStackTrace();
		}
		return null;
	}
	
	public void deleteProject(String title){
		Statement stmt = null;
		try{
			stmt = ds.con.createStatement();
			String sql = "DELETE FROM "+table+" WHERE Title = "+title;
			stmt.executeQuery(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public void updateProject(Project p){
		Statement stmt = null;
		try{
			stmt = ds.con.createStatement();
			String sql = "UPDATE "+table+" SET Title="+p.getTitle()+",Description="+p.getDescription()
			+",StartDate="+p.getStartDate()+",EndDate="+p.getEndDate()+",Goal="+p.getGoal()
			+",Objective="+p.getObjective()+",Keyword="+p.getKeyword()+",DocumentType="+p.getDocumentType()
			+",Attachment="+p.getAttachment()+",Website="+p.getWebsite()+",Membership="+p.getMembers()
			+",AssocInitID="+p.getAssocInitID()+" WHERE Title="+p.getTitle();
			stmt.executeQuery(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	
	public void createProject(Project p){
		Statement stmt = null;
		try{
			stmt = ds.con.createStatement();
			String sql = "INSERT INTO project(Title, Description, StartDate, EndDate, Goal,"
			+ " Objective, Keyword, DocumentType, Attachment, Website, Membership,"
			+ "AssocInitID) VALUES("+p.getTitle()+","+p.getDescription()+","+p.getStartDate()+","
			+p.getEndDate()+","+p.getGoal()+","+p.getObjective()+","+p.getKeyword()+","
			+p.getDocumentType()+","+p.getAttachment()+","+p.getWebsite()+","+p.getMembers()+","
			+p.getAssocInitID()+")";
			
			stmt.executeQuery(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
