package in.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.main.beans.User;
import in.main.dao.UDao;

@SpringBootApplication
public class SpringJdbcPracticeApplication implements CommandLineRunner
{
	@Autowired
	UDao uDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcPracticeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		
//		boolean chk=uDao.insert(new User(109,"Chinni","chin@gmail.com","Female","Mahad"));
//		if (chk) 
//		{
//			System.out.println("Success");
//		} else 
//		{
//			System.out.println("Failed");	
//		}
		
		List<User> uList=uDao.selectAll();
		System.out.println("ID\tName\tEmail\t\tGender\tCity");
		for(User user:uList)
		{
			System.out.println(user.getId()+"\t"+user.getName()+"\t"+user.getEmail()+"\t"+user.getGender()+"\t"+user.getCity());
		}
		
	}

}
