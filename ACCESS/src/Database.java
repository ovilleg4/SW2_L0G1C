import java.sql.*;

public class Database extends DataSource{

	public Database(){
		Host = "jdbc:mysql://127.0.0.1/database";
		Username = "root";
		Password = "";
	}
	
	public void Query(String sql){
		Statement stmt = null;
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				
			}
			
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
	
	
}
