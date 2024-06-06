package nov2023_04;

public abstract class Course {
	
	 String code;
	 String course_name;
	
	public Course() {
		super();
	}

	public Course(String code, String course_name) {
		super();
		this.code = code;
		this.course_name = course_name;
	}
	
	abstract void DisplayCourseDetails();

}
