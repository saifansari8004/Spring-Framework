package in.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student 
{
	@Value("Sachin")
	private String name;
	@Value("7631")
	private int rollno;
	@Value("SachinT@gmail.com")
	private String email;
	@Value("98.76f")
	private float marks;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	public void display() {
		System.out.println("Name = "+name);
		System.out.println("Roll no = "+rollno);
		System.out.println("Marks = "+marks);
		System.out.println("Email = "+email);
	}
}
