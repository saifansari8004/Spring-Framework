package in.main;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.main.entities.User;
import in.main.repository.DBOperation;


@SpringBootApplication
public class SpringBootDemo9Hibernate2Application {

	public static void main(String[] args) 
	{
		ApplicationContext context=SpringApplication.run(SpringBootDemo9Hibernate2Application.class, args);
		DBOperation dOperation=context.getBean(DBOperation.class);
		
		//Get User
//		User user=null;
//		user=dOperation.getUserDetails(9L);
//		if(user!=null)
//		{
//			user.display();
//		}
//		else
//		{
//			System.out.println("User nahi Milaa");
		//}
		 
		//Insert User
//		User user = new User("Chinni", "cin@gmail.com", "chin123", "Female", "Pimpri");
//		boolean status=dOperation.insertUserDetails(user);
//		if(status)
//		{
//			System.out.println("Insertion Successful");
//		}
//		else
//		{
//			System.out.println("Insertion Failed ");
//		}
		
		//Delete User
//		boolean status=dOperation.deleteUserDetails(9L);
//		if(status)
//		{
//			System.out.println("Deletion Successful");
//		}
//		else
//		{
//			System.out.println("Deletion Failed ");
//		}
		
	}

}
