package in.main.beans;

public class User 
{
	private int rollno;
	private String name;
	private float mark;
	
	
	
	public User(int rollno, String name, float mark)
	{
		this.rollno = rollno;
		this.name = name;
		this.mark = mark;
	}
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMark() {
		return mark;
	}
	public void setMark(float mark) {
		this.mark = mark;
	}
	
	public void display()
	{
		System.out.println("Roll No: "+rollno);
		System.out.println("Name : "+name);
		System.out.println("Mark :"+mark);
		System.out.println("------------------");
	}
	
}
