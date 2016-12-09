import java.sql.SQLException;

public class Main {
	public static void main(String[] args) throws SQLException{
		
		DataSource ds = new Database();
		ds.connect();
	}
}
