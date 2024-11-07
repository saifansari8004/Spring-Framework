package in.main.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User
{
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private String gender;
	@Column
	private String city;
	
	public User() {
		
	}

	public User(String name, String email, String password, String gender, String city) 
	{
		this.name = name;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.city = city;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public void display()
	{
		System.out.println("Id :"+id);
		System.out.println("Name: "+name);
		System.out.println("Email: "+email);
		System.out.println("Pass: "+password);
		System.out.println("Gender: "+gender);
		System.out.println("City: "+city);
	}
	
}
