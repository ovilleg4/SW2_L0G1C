import java.sql.Date;

public abstract class Resource {

	protected int ID;
	protected String Title;
	protected String Description;
	protected Date StartDate;
	protected Date EndDate;


	public int getID(){
		return ID;
	}
	
	public String getTitle(){
		return Title;
	}
	
	public String getDescritpion(){
		return Description;
	}
	
	public Date getStartDate(){
		return StartDate;
	}
	
	public Date getEndDate(){
		return EndDate;
	}





}
