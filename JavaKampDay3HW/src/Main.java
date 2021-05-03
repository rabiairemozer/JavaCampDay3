
public class Main {

	public static void main(String[] args) {
		
		UserManager userManager=new UserManager();
		

		
		Student student = new Student (1," İrem Özer","iromi@gmail.com","123456",11,"Java");
		
		Instructor instructor=new Instructor (2," Engin Demiroğ","engindemirog@gmail.com","147852",27,"Java");
		
		User [] users = {instructor,student};
		userManager.addMultiple(users);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.addCourses(instructor);
		
		StudentManager studentManager=new StudentManager();
		studentManager.complete(student);
		
		
		User [] users2 = {instructor,student};
		userManager.deleteMultiple(users2);
		
		
		
		

	}

}
