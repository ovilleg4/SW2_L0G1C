package DBsubsystem;
import java.sql.*;
public class BannerQuery extends Query{

	public BannerQuery() throws SQLException{
		table = "student";
		ds = new Banner();
		ds.connect();
	}
	
	public ResultSet getStudent(String firstName, String lastName){
		Statement stmt = null;
		try {
			stmt = ds.con.createStatement();
			String sql = "SELECT * FROM " + table + " WHERE FirstName = "+firstName+ " AND LastName = "+lastName; 
			ResultSet rs = stmt.executeQuery(sql);
			return rs;
			
		}catch (SQLException e){
			e.printStackTrace();
		}
		return null;
	}
}
