package example1;

public class Mian {

	public static void main(String[] args) {

		Worker worker = new Worker();
		worker.work();
		worker.eat();
		worker.salary();
		
		OutsourceWorker worker2 = new OutsourceWorker();
		worker2.work();
		
		

	}

}
