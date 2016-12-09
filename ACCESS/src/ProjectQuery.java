import java.sql.*;
public class ProjectQuery extends Query{
	
	public ProjectQuery() throws SQLException{
		table = "project";
		ds = new Database();
		ds.connect();
	}
}
