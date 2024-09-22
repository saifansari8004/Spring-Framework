package in.beans;

import java.util.List;

public class Author 
{
	private long auth_id;
	private String auth_name;
	private List<String> books;
	
	
	public void setBooks(List<String> books) {
		this.books = books;
	}
	public void setAuth_id(long auth_id) {
		this.auth_id = auth_id;
	}
	
	public void setAuth_name(String auth_name) {
		this.auth_name = auth_name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "$"+auth_id+" - "+auth_name;
	}
	
	public void display()
	{
		System.out.println("ID - "+auth_id);
		System.out.println("Name - "+auth_name);
		System.out.println("Books - "+books.toString());
	}

}
