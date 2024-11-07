package in.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.main.entities.User;
import in.main.operations.DoOperation;
import in.main.operations.DoOperationImpl;

@SpringBootApplication
public class SpringBootDemo9Hibernate2Application {

	public static void main(String[] args) 
	{
		ApplicationContext context=SpringApplication.run(SpringBootDemo9Hibernate2Application.class, args);
		DoOperation dop=context.getBean(DoOperation.class);
		
//		User user=dop.getUserDetails(6L);
//		if(user != null)
//		{
//			user.display();
//		}
//		else {
//			System.out.println("User not milaaa");
//		}
		
		User user = new User("Divay", "div@gmail.com", "div123", "Female", "Pune");
		dop.insertUserDetails(user);
		
	}

}
