package kodlama.io;

public class Main {

	public static void main(String[] args) {
		
		
		User user = new User();
		user.setId(3); 
		user.setFirstName("Ali"); 
		user.setLastName("Demir");
		
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Hakan");
		student.setLastName("Yıldırım");
		student.setKartNo("1234 4134 1245 3214 23");
		
		Instructor instructor = new Instructor();
		instructor.setId(2);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setEmail("engndmr@gmail.com");
	
/*		User[] users = {user, student, instructor};
		
	    for(User x : users) {
			System.out.println("İsim :" + x.firstName);
			System.out.println("Soyisim :" + x.lastName);

		}
*/	
		
		
		UserManager userManager = new UserManager();
		userManager.signUp(user);
		
		StudentManager studentManager = new StudentManager();
		studentManager.signIn(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.courseAdd(instructor);
		instructorManager.blocked(student);
		
		

		
		
	}

}
