package que022018;

public class MainThreadApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//extent threads
		CountDown countdown1 = new CountDown();
		
		//Thread countDown = new Thread(new CountDown());
		
		
		//Runnable interface
		
		Thread calcsum1 = new Thread(new CalcSum());
		Thread calcsum2 = new Thread(new CalcSum());
		
		calcsum1.setName("Black");
		calcsum2.setName("White");
		
		countdown1.start();
		countdown1.join();
		
		
		calcsum1.start();
	
		calcsum2.start();

	}

}
