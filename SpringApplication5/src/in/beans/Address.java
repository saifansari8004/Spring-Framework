package in.beans;

//Dependency Injection using Constructor method
public class Address 
{
	private int houseno;
	private String city;
	private int pincode;	
	public Address(int houseno, String city, int pincode) 
	{
		System.out.println("Contructor from Address");
		this.houseno = houseno;
		this.city = city;
		this.pincode = pincode;
	}	
	@Override
	public String toString() {
		
		return ("#"+houseno+" , "+city+" - "+pincode);
	}
}
