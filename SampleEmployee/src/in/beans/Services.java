package in.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Services
{
	@Value("8908")
	private int serviceid;
	@Value("Koluyt")
	private String sname;
	@Value("Eveneing")
	private String shift;
	
	public int getServiceid() {
		return serviceid;
	}
	public void setServiceid(int serviceid) {
		this.serviceid = serviceid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getShift() {
		return shift;
	}
	public void setShift(String shift) {
		this.shift = shift;
	}
	
	

	public void display()
	{
		System.out.println("Service ID ="+serviceid);
		System.out.println("Service Name ="+sname);
		System.out.println("Service Shift ="+shift);
	}
	
	
}
