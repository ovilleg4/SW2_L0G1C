package ResourceSubsystem;
import java.sql.ResultSet;
import java.sql.SQLException;

import DBsubsystem.ORSPQuery;

public class FundedProject extends Resource{

	private String Goal;
	private String Objective;
	private String Keyword;
	private String PIName;
	private String COPIName;
	
	public FundedProject(String title) throws SQLException{
		ORSPQuery query = new ORSPQuery();
		ResultSet rs = query.getFundedProject(title);
		if(rs != null){
			setTitle(rs.getString("Title"));
			setDescription(rs.getString("Description"));
			setStartDate(rs.getDate("StartDate"));
			setEndDate(rs.getDate("EndDate"));
			setGoal(rs.getString("Goal"));
			setObjective(rs.getString("Objective"));
			setKeyword(rs.getString("Keyword"));
			setPIName(rs.getString("PiName"));
			setCOPIName(rs.getString("CoPiName"));
		}
	}

	public String getGoal() {
		return Goal;
	}

	public String getObjective() {
		return Objective;
	}

	public String getKeyword() {
		return Keyword;
	}

	public String getPIName() {
		return PIName;
	}

	public String getCOPIName() {
		return COPIName;
	}

	public void setGoal(String goal) {
		Goal = goal;
	}

	public void setObjective(String objective) {
		Objective = objective;
	}

	public void setKeyword(String keyword) {
		Keyword = keyword;
	}

	public void setPIName(String pIName) {
		PIName = pIName;
	}

	public void setCOPIName(String cOPIName) {
		COPIName = cOPIName;
	}
	
	
}
