package in.beans;

//Dependency Injection using Setter method
public class Address 
{
	private int houseno;
	private String city;
	private int pincode;
	
	
	public void setHouseno(int houseno) {
		System.out.println("Setter from hno");
		this.houseno = houseno;
	}
	public void setCity(String city) {
		System.out.println("Setter from city");
		this.city = city;
	}
	public void setPincode(int pincode) {
		System.out.println("Setter from pincode");
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		
		return ("#"+houseno+" , "+city+" - "+pincode);
	}
}
