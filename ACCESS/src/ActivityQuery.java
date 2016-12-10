import java.sql.*;
public class ActivityQuery extends Query{

	public ActivityQuery() throws SQLException{
		table = "activity";
		ds = new Database();
		ds.connect();
	}
	
	public ResultSet getActivity(String title){
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
	
	public void deleteActivity(String title){
		Statement stmt = null;
		try{
			stmt = ds.con.createStatement();
			String sql = "DELETE FROM "+table+" WHERE Title = "+title;
			stmt.executeQuery(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public void updateActivity(Activity a){
		Statement stmt = null;
		try{
			stmt = ds.con.createStatement();
			String sql = "UPDATE "+table+" SET Title="+a.getTitle()+",Description="+a.getDescription()
			+",StartDate="+a.getStartDate()+",EndDate="+a.getEndDate()+",Keyword="+a.getKeyword()
			+",Classification="+a.getClassification()+",Semester="+a.getSemester()+",Participants="+a.getParticipants()
			+",AssocInitID="+a.getAssocInitID()+" WHERE Title="+a.getTitle();
			stmt.executeQuery(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	
	public void createProject(Activity a){
		Statement stmt = null;
		try{
			stmt = ds.con.createStatement();
			String sql = "INSERT INTO project(Title, Description, StartDate, EndDate, Keyword,"
			+ " Classification, Semester, Participants, AssocInitID) VALUES("+a.getTitle()+","
			+a.getDescription()+","+a.getStartDate()+","+a.getEndDate()+","+a.getKeyword()+","
			+a.getClassification()+","+a.getSemester()+","+a.getParticipants()+","+a.getAssocInitID()
			+")";
			
			stmt.executeQuery(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
}
