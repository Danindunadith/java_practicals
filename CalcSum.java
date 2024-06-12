package que022018;

public class CalcSum implements Runnable {
	
	private long sum = 0;

	@Override
	public void run() {
		
		synchronized (CalcSum.class) {
			for(int i=0;i<100000;i++) {
				sum=sum+i;
			}
			
			System.out.println("current thread: "+Thread.currentThread().getName() + "Sum: "+ sum);
		}
		
		

	}

}
