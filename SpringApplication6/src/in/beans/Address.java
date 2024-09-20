package in.beans;

public class Address 
{
	private int homeno;
	private String cityString;
	private int pincode;
	
	
	public void setHomeno(int homeno) {
		this.homeno = homeno;
	}
	public void setCityString(String cityString) {
		this.cityString = cityString;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "#"+homeno+" , "+cityString+"-"+pincode;
	}
	
}