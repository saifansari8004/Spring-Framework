package in.beans;

//Achieving Autowiring using XML File

public class Address 
{
	private int homeno;
	private String city;
	private int pincode;
	
	
	
	public Address(int homeno, String city, int pincode) 
	{
		this.homeno = homeno;
		this.city = city;
		this.pincode = pincode;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "#"+homeno+", "+city+"-"+pincode;
	}
	
}

