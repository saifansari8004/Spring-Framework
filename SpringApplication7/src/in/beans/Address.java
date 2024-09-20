package in.beans;

public class Address 
{
	private int homeno;
	private String cityString;
	private int pincode;
	
	
	
	public Address(int homeno, String cityString, int pincode) {
		this.homeno = homeno;
		this.cityString = cityString;
		this.pincode = pincode;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "#"+homeno+" , "+cityString+"-"+pincode;
	}
	
}