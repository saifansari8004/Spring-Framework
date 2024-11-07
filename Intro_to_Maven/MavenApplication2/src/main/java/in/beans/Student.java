package in.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student 
{
	private int rollno;
	private String name;
	@Autowired
	private Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void display() {
		System.out.println("Name = "+name);
		System.out.println("Roll no = "+rollno);
		System.out.println("Address = "+address);
	}
}

