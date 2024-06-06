package nov2023_04;

public abstract class Person {
	
	 int ID;
	 String name;
	
	public Person() {
		super();
	}

	public Person(int iD, String name) {
		super();
		ID = iD;
		this.name = name;
	}
	
	abstract void DisplayDetails();
	

}
