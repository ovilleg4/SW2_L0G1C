import java.io.File;

public class Initiative extends Resource{

	private File Attachment;
	private String Website;
	//private Record[] Membership; //replace record with membership type
	private int AssocPID;
	private int[] AssocActID;
	
	public Initiative(){
	
	}
	
	public void setTitle(String title){
		this.Title = title;
	}
	
	public String getTitle(){
		return this.Title;
	}
}	
