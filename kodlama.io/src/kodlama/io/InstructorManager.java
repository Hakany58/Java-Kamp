package kodlama.io;

public class InstructorManager {
	
	public void courseAdd(Instructor instructor) {
		
		System.out.println("Kursu başarıyla ekledin " + instructor.getFirstName());
		
	}
	
	public void blocked(Student student) {
		
		System.out.println("Bu kullanıcıyı engellediniz : " + student.getFirstName());
		
	}

}
