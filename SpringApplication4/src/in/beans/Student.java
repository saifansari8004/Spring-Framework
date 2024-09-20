package in.beans;


//Dependency Injection using Setter method
public class Student
{
	private int rollno;
	private String name;
	private Address address;
	
	public void setRollno(int rollno)
	{
		System.out.println("Setter from Rollno");
		this.rollno = rollno;
	}
	public void setName(String name) {
		System.out.println("Setter from name");
		this.name = name;
	}
	public void setAddress(Address address) {
		System.out.println("Setter from Address");
		this.address = address;
	}
	
	public void display() 
	{
		System.out.println("Roll no :"+rollno);
		System.out.println("Name : "+name);
		System.out.println("Address : "+address); //internally call toString() method in Address
	}
	
	

}
