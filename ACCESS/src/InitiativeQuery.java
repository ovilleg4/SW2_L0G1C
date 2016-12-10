import java.sql.*;
public class InitiativeQuery extends Query{

	public InitiativeQuery() throws SQLException{
		table = "initiatve";
		ds = new Database();
		ds.connect();
	}

	public ResultSet getInitative(String title){
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
	
	public void deleteInitiative(String title){
		Statement stmt = null;
		try{
			stmt = ds.con.createStatement();
			String sql = "DELETE FROM "+table+" WHERE Title = "+title;
			stmt.executeQuery(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public void updateInitiative(Initiative i){
		Statement stmt = null;
		try{
			stmt = ds.con.createStatement();
			String sql = "UPDATE "+table+" SET Title="+i.getTitle()+",Description="+i.getDescription()
			+",StartDate="+i.getStartDate()+",EndDate="+i.getEndDate()+",Attachment="+i.getAttachment()
			+",Website="+i.getWebsite()+",AssocPID="+i.getAssocPID()+",AssocActID="+i.getAssocActID()
			+",Membership="+i.getMemberships();
			stmt.executeQuery(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	
	public void createInitiative(Initiative i){
		Statement stmt = null;
		try{
			stmt = ds.con.createStatement();
			String sql = "INSERT INTO initiatve(Title, Description, StartDate, EndDate, Goal,"
			+ " Attachment, Website, AssocPID, AssocActID, Membership, Membership) "
			+ "VALUES("+i.getTitle()+","+i.getDescription()+","+i.getStartDate()+","
			+i.getEndDate()+","+i.getAttachment()+","+i.getWebsite()+","+i.getAssocPID()+","
			+i.getAssocActID()+","+i.getMemberships()+")";
			
			stmt.executeQuery(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
