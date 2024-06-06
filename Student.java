package nov2023_04;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

	List<Course>enrolledCourses;
	
	
	public Student() {
		super();
	}


	public Student(int ID,String name,List<Course> enrolledCourses) {
		super(ID,name);
		this.enrolledCourses = new ArrayList<Course>();
	}






	@Override
	void DisplayDetails() {


		System.out.println("ID"+ID);
		System.out.println("name"+name);
		System.out.println("list"+enrolledCourses);

	}
	

}
