package in.beans;


public class Publisher 
{
	private long pub_id;
	private String name;
	
	public void setAuth_id(long pub_id) {
		this.pub_id = pub_id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "@"+pub_id+" - "+name;
	}
}
