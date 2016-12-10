import java.sql.*;
public class ActivityQuery extends Query{

	public ActivityQuery() throws SQLException{
		table = "activity";
		ds = new Database();
		ds.connect();
	}
	
}
