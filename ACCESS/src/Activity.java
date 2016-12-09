import java.util.ArrayList;

public class Activity extends Resource{

	private ArrayList<String> Keywords;
	private String Classification;
	private String Semester;
	private String CourseName;
	private ArrayList<Student> Participants; //Repalace Record with type of participants
	private int AssocInitID;
	
	public Activity(){
		
	}
	
	public void addKeyword(String keyword){
		Keywords.add(keyword);
	}
	
	public void addParticipant(Student student){
		Participants.add(student);
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
	
	public ArrayList<Student> getParticipants(){
		return Participants;
	}
	
	public Student getParticipant(String firstName, String lastName){
		for(int i=0; i<Participants.size(); i++){
			if(Participants.get(i).getFirstName() == firstName){
				if(Participants.get(i).getLastName() == lastName){
					return Participants.get(i);
				}
			}
		}
		return null;
	}
	
	
}
