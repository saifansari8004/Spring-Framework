package in.beans;

//Achieving Autowiring using XML File

public class Address 
{
	private int homeno;
	private String city;
	private int pincode;
	
	
	public void setHomeno(int homeno) {
		this.homeno = homeno;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "#"+homeno+", "+city+"-"+pincode;
	}
	
}

