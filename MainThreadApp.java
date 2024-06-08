package que02b2018;

public class MainThreadApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculation cal = new Calculation();
		

		Thread ti = new Thread(new ParallelThread(cal, 1, 20)) ;
		
		
	}

}
