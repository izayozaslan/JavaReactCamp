package assignmentDay3;

public class InstructorManager {
	
	public void addCourse (Instructor instructor) {
		System.out.println(instructor.firstName + " " + instructor.course +" dersini ekledi.");
	
	}
	
	public void deleteCourse (Instructor instructor) {
		System.out.println(instructor.firstName + " " + instructor.course + " dersini sildi.");
	} 

}
