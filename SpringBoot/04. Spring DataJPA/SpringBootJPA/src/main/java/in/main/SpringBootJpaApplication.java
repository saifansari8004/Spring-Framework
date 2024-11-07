package in.main;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import in.main.entities.User;
import in.main.services.UserServiceImpl;

@SpringBootApplication
public class SpringBootJpaApplication {

	public static void main(String[] args) 
	{
		System.out.println("ENTER");
		ApplicationContext context=SpringApplication.run(SpringBootJpaApplication.class, args);
		UserServiceImpl userServiceImpl=context.getBean(UserServiceImpl.class);
		
//		User user = new User("Sarvesh","sar@gmail.com","sar123","Male","Warje");
//		boolean e=userServiceImpl.insertUserDetails(user);
//		if(e)
//		{
//			System.out.println("Insertion Success");
//		}
//		else
//		{
//			System.out.println("Insertion Failed");
//		}
		
		List<User> ulist=userServiceImpl.getAllUser();
		System.out.println("Id\tName\tEmail\t\tPassword     Gender\tCity");
		System.out.println("--------------------------------------------------------");
		for(User user:ulist)
		{
			System.out.println(user.getId()+"\t"+user.getName()+"\t"+user.getEmail()+"\t"+user.getPassword()+"\t"+user.getGender()+"\t"+user.getCity());
		}
		

		
//		User user =userServiceImpl.getUserById(10L);
//		if(user != null)
//		{
//			user.display();
//		}
//		else
//		{
//			System.out.println("User no found");
//		}
		
//		boolean e=userServiceImpl.updateUserEmail(7L,"var@gmail.com");
//		if(e)
//		{
//			System.out.println("Updation Success");
//		}
//		else
//		{
//			System.out.println("Updation Failed");
//		}
		
//		boolean e=userServiceImpl.updateUserPassword(4L,"far123");
//		if(e)
//		{
//			System.out.println("Updation Success");
//		}
//		else
//		{
//			System.out.println("Updation Failed");
//		}
		
		
		
		System.out.println("EXIT");
	}

}
