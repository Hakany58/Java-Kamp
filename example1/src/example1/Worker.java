package example1;

public class Worker implements Work, Eat, Salary {

	@Override
	public void work() {
		System.out.println("Bizim elemean 9-5 aras� �al���yor");
	}

	@Override
	public void eat() {
		System.out.println("Bizim elemeana yemek bizden");		
	}

	@Override
	public void salary() {
		System.out.println("Bizim elemeana maa� var");		
		
	}
	

	
	
	
}
