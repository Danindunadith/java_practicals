package que012023;

import java.util.Scanner;

public class Student {
	
	private String StudentId;
	private String name;
	private String address;
	private String contactnumber;
	public Student(String studentId, String name, String address, String contactnumber) {
		super();
		StudentId = studentId;
		this.name = name;
		this.address = address;
		this.contactnumber = contactnumber;
	}
	
	public void Read(String studentId, String name, String address, String contactnumber) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Student Id:");
		StudentId =input.next();
		
		System.out.println("Enter name:");
		name = input.next();
		
		System.out.println("Enter address:");
		address = input.next();
		
		System.out.println("Enter contact number:");
		contactnumber = input.next();
		
		
	}
	
	
	public void print(String studentId, String name, String address, String contactnumber) {
		
		System.out.println(studentId+"StudentId:");
		System.out.println(name+"Name:");
		System.out.println(address+"Address:");
		System.out.println(contactnumber+"ContactNumber:");
	}

}
