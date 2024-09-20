package in.beans;

public class Employee 
{
	private int empid;
	private String name;
	private String address;
	
	
	
	public int getEmpid() {
		return empid;
	}



	public void setEmpid(int empid) {
		this.empid = empid;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public void display()
	{
		System.out.println("Emp ID ="+empid);
		System.out.println("Emp Name ="+name);
		System.out.println("Emp Address ="+address);
	}
}
