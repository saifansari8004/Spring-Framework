package in.beans;

public class Student 
{
	private int rollno;
	private String nameString;
	private Address address;
	
	
	public Student(int rollno, String nameString, Address address) {
		
		this.rollno = rollno;
		this.nameString = nameString;
		this.address = address;
	}


	public void display()
	{
		System.out.println("Roll No : "+rollno);
		System.out.println("Name : "+nameString);
		System.out.println("Address : "+address);
	}
}
