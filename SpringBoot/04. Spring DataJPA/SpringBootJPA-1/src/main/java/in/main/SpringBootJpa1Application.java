package in.main;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.main.entities.User;
import in.main.services.UserServiceImpl;

@SpringBootApplication
public class SpringBootJpa1Application {

	public static void main(String[] args) 
	{
		ApplicationContext context=SpringApplication.run(SpringBootJpa1Application.class, args);
		UserServiceImpl doQuery=context.getBean(UserServiceImpl.class);
		
//		User user=doQuery.getUserByID(9L);
//		if(user!=null)
//		{
//			user.display();
//		}
//		else {
//			System.err.println("User not Found");
//		}

		boolean check=doQuery.deleteUserData(8L);
		if(check)
		{
			System.out.println("User Deleted Success");
		}
		else 
		{
			System.out.println("User Deleted Failed");
		}
		
		List<User> uList=doQuery.getAllUser();
		for(User user2:uList)
		{
			user2.display();
			System.out.println("---------------------");
		}
	}

}
