import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Student {

	private String FirstName;
	private String LastName;
	private String Email;
	private String Department;
	private String AdminstrativeAssignment;
	
	public Student(String firstName, String lastName) throws SQLException{
		BannerQuery query = new BannerQuery();
		ResultSet rs = query.getStudent(firstName, lastName);
		if(rs!=null){
			setFirstName(rs.getString("FirstName"));
			setLastName(rs.getString("LastName"));
			setEmail(rs.getString("Email"));
			setDepartment(rs.getString("Department"));
			setDepartment(rs.getString("AdminstrativeAssignment"));
		} 
	}	
}
