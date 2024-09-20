package in.beans;

public class Student 
{
	private int rollno;
	private String nameString;
	private Address address;
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void display()
	{
		System.out.println("Roll No : "+rollno);
		System.out.println("Name : "+nameString);
		System.out.println("Address : "+address);
	}
}
