package kodlama.io;

public class InstructorManager {
	
	public void courseAdd(Instructor instructor) {
		
		System.out.println("Kursu ba�ar�yla ekledin " + instructor.getFirstName());
		
	}
	
	public void blocked(Student student) {
		
		System.out.println("Bu kullan�c�y� engellediniz : " + student.getFirstName());
		
	}

}
