import java.sql.*;
public class DigitalMeasuresQuery extends Query{

	public DigitalMeasuresQuery() throws SQLException{
		table = "faculty";
		ds = new DigitalMeasures();
		ds.connect();
	}
}
