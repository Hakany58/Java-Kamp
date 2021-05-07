package kodlama.io;

public class InstructorManager {
	
	public void courseAdd(Instructor instructor) {
		
		System.out.println("Kursu baþarýyla ekledin " + instructor.getFirstName());
		
	}
	
	public void blocked(Student student) {
		
		System.out.println("Bu kullanýcýyý engellediniz : " + student.getFirstName());
		
	}

}
