import java.sql.*;
public class InitiativeQuery extends Query{

	public InitiativeQuery() throws SQLException{
		table = "initiatve";
		ds = new Database();
		ds.connect();
	}
}
