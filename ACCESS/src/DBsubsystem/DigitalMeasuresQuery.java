package DBsubsystem;
import java.sql.*;
public class DigitalMeasuresQuery extends Query{

	public DigitalMeasuresQuery() throws SQLException{
		table = "faculty";
		ds = new DigitalMeasures();
		ds.connect();
	}

	public ResultSet getFaculty(String firstName, String lastName) {
		Statement stmt = null;
		try {
			stmt = ds.con.createStatement();
			String sql = "SELECT * FROM " + table + " WHERE FirstName = " + lastName;
			ResultSet rs = stmt.executeQuery(sql);
			return rs;

		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
