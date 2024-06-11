package que012023;

public class StudentApp {

	public static void main(String[] args) {
		
		Student s1 = new Student("str01", "pasindu", "matara", "0415635986");
		Course c2 = new Course("it2030","OOP", "ravi");
		
		s1.Read("str01", "pasindu", "matara", "0415635986");
		c2.AddStudent();

	}

}
