package example1;

public class Worker implements Work, Eat, Salary {

	@Override
	public void work() {
		System.out.println("Bizim elemean 9-5 arasý çalýþýyor");
	}

	@Override
	public void eat() {
		System.out.println("Bizim elemeana yemek bizden");		
	}

	@Override
	public void salary() {
		System.out.println("Bizim elemeana maaþ var");		
		
	}
	

	
	
	
}
