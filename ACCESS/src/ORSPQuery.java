import java.sql.*;
public class ORSPQuery extends Query{

	public ORSPQuery() throws SQLException{
		table = "fundedproject";
		ds = new ORSP();
		ds.connect();
	}
}
