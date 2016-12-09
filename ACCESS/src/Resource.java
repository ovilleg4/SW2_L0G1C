import java.sql.Date;

public abstract class Resource {

	protected int ID;
	protected String Title;
	protected String Description;
	protected Date StartDate;
	protected Date EndDate;

	public void setId(int Id){
		ID = Id;
	}
	
	public void setTitle(String title){
		Title = title;
	}
	
	public void setDescription(String description){
		Description = description;
	}
	
	public void setStartDate(Date date){
		StartDate = date;
	}
	
	public void setEndDate(Date date){
		EndDate = date;
	}
	
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
