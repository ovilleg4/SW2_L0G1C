import java.sql.*;
public class ORSPQuery extends Query{

	public ORSPQuery() throws SQLException{
		table = "fundedproject";
		ds = new ORSP();
		ds.connect();
	}
	
	public ResultSet getFundedProject(String title){
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
}
