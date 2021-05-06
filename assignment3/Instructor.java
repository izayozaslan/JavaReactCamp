package assignmentDay3;

public class Instructor extends User{
	
	String course;
	
	public Instructor(String id, String firstName, String lastName, String userName, String password, String course) {
		super(id, firstName, lastName, userName, password );
		this.course = course;
	} 

}
