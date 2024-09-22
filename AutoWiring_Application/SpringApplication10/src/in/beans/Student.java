package in.beans;

//Achieving Autowiring using XML File

public class Student 
{
	private int rollno;
	private String name;
	private Address address;
	
	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	public void display() {
		System.out.println("Roll no : "+rollno);
		System.out.println("Name : "+name);
		System.out.println("Address : "+address);
	}
}
