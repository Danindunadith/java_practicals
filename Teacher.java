package nov2023_04;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {

	List<Course>coursesTaught;
	
	public Teacher() {
		
	}

	public Teacher(int ID, String name,List<Course>coursesTaught) {
		super(ID, name);
		this.coursesTaught=new ArrayList<Course>();


	}





	@Override
	void DisplayDetails() {
		System.out.println("Tid"+ID);
		

	}

}
