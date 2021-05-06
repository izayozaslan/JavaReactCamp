package assignmentDay3;

public class Student extends User {
	
	double performance;
	
	public Student(String id, String firstName, String lastName, String userName, String password, double performance) {
		super(id, firstName, lastName, userName, password );
		this.performance = performance;
	} 
	

}
