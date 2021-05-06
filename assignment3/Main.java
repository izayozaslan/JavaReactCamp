package assignmentDay3;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor("1", "Engin", "Demirog", "engindemirog", "abc100", "Java");
		Student student1 = new Student("2", "İzay", "Özaslan", "izoz", "asdf56", 90);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(instructor1);
		instructorManager.deleteCourse(instructor1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.increasePerformance(student1);
		studentManager.joinClass(student1);
		
		UserManager userManager = new UserManager();
		userManager.signIn(instructor1);
		userManager.signOut(student1); 

	} 

}
