import java.util.ArrayList;

public class Activity extends Resource{

	private ArrayList<String> Keywords;
	private String Classification;
	private String Semester;
	private String CourseName;
	//private Record[] Participants; //Repalace Record with type of participants
	private int AssocInitID;
	
	public Activity(){
		
	}
	
	public void addKeyword(String keyword){
		Keywords.add(keyword);
	}
	
	public void setClassification(String classification){
		Classification = classification;
	}
	
	public void setSemester(String semester){
		Semester = semester;
	}
	
	public void setAssocInitID(int initId){
		AssocInitID = initId;
	}
	
	public void setCourseName(String course){
		CourseName = course;
	}
	
	public ArrayList<String> getKeyword(){
		return Keywords;
	}
	
	public String getClassification(){
		return Classification;
	}
	
	public String getSemester(){
		return Semester;
	}
	
	public String getCourseName(){
		return CourseName;
	}
	
	public int getAssocInitID(){
		return AssocInitID;
	}
	
}
