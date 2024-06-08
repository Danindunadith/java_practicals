package que02b2018;

import java.util.Iterator;

public class Calculation {

	private double ans=1;

	public double getAns() {
		return ans;
	}

	public void setAns(double ans) {
		this.ans = ans;
	}
	
	public void Factorial(int start,int end) {
		for(int i=start;i<=end;i++) {
			ans =ans * (double)i;
		}
			
	}
}
