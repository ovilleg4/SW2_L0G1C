import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Student {

	private String FirstName;
	private String LastName;
	private String Gender;
	private Date DateOfBirth;
	private String Citizenship;
	private String Race;
	private String Major;
	private String Classification;
	private Date EnrollmentDate;
	private Date GraduationDate;
	private Date DropOutDate;
	private double GPA;
	private double MajorGPA;
	private String CompletedCourses;
	
	public Student(String firstName, String lastName) throws SQLException{
		BannerQuery query = new BannerQuery();
		ResultSet rs = query.getStudent(firstName, lastName);
		if(rs!=null){
			setFirstName(rs.getString("FirstName"));
			setLastName(rs.getString("LastName"));
			setGender(rs.getString("Gender"));
			setDateOfBirth(rs.getDate("DoB"));
			setCitizenship(rs.getString("Citizenship"));
			setRace(rs.getString("Race"));
			setMajor(rs.getString("Major"));
			setClassification(rs.getString("Classification"));
			setEnrollmentDate(rs.getDate("Enrollment"));
			setGraduationDate(rs.getDate("Graduation"));
			setDateOfBirth(rs.getDate("DropOut"));
			setGPA(rs.getDouble("GPA"));
			setMajorGPA(rs.getDouble("MajorGPA"));
			setCompletedCourses(rs.getString("CompletedCourses"));
		} 
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public Date getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public String getCitizenship() {
		return Citizenship;
	}

	public void setCitizenship(String citizenship) {
		Citizenship = citizenship;
	}

	public String getRace() {
		return Race;
	}

	public void setRace(String race) {
		Race = race;
	}

	public String getMajor() {
		return Major;
	}

	public void setMajor(String major) {
		Major = major;
	}

	public String getClassification() {
		return Classification;
	}

	public void setClassification(String classification) {
		Classification = classification;
	}

	public Date getEnrollmentDate() {
		return EnrollmentDate;
	}

	public void setEnrollmentDate(Date enrollmentDate) {
		EnrollmentDate = enrollmentDate;
	}

	public Date getGraduationDate() {
		return GraduationDate;
	}

	public void setGraduationDate(Date graduationDate) {
		GraduationDate = graduationDate;
	}

	public Date getDropOutDate() {
		return DropOutDate;
	}

	public void setDropOutDate(Date dropOutDate) {
		DropOutDate = dropOutDate;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	public double getMajorGPA() {
		return MajorGPA;
	}

	public void setMajorGPA(double majorGPA) {
		MajorGPA = majorGPA;
	}

	public String getCompleteCourses() {
		return CompletedCourses;
	}

	public void setCompletedCourses(String completedCourses) {
		CompletedCourses = completedCourses;
	}
	
	
}
