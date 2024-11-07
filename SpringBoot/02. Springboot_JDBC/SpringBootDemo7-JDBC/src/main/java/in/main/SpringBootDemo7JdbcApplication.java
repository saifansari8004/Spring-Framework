package in.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.main.beans.User;
import in.main.dao.UserDao;

@SpringBootApplication
public class SpringBootDemo7JdbcApplication implements CommandLineRunner
{
	@Autowired
	UserDao userDao;
	
	public static void main(String[] args) 
	{
		SpringApplication.run(SpringBootDemo7JdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		//insert data
//		User ur1=new User(104, "Wahib", "wahib@gmail.com", "Male", "Lapata");
//		boolean status=userDao.insertData(ur1);
//		if(status)
//		{
//			System.out.println("Inserted");
//		}
//		else
//		{
//			System.err.println("Failed");
//		}
		
		
		//Upadate Data by Class
		
//		User ur1=new User(104, "Wahib", "wahib@gmail.com", "Male", "Mahad");
//		boolean status=userDao.updataDatabyClass(ur1);
//		if(status)
//		{
//			System.out.println("Updated");
//		}
//		else
//		{
//			System.err.println("Failed");
//		}
		
		
		//delete by id
//		boolean status=userDao.deletebyID(103);
//		if(status)
//		{
//			System.out.println("Deleted");
//		}
//		else
//		{
//			System.err.println("Failed");
//		}
//		
		
		//select all
		List<User> ulist=userDao.selectAll();
		System.out.println("ID\tName\tEmail\t\tGender\tCity");
		for(User user:ulist)
		{
			System.out.println(user.getId()+"\t"+user.getName()+"\t"+user.getEmail()+"\t"+user.getGender()+"\t"+user.getCity());
		}
		
		System.out.println("=====================================================");
		//select by id
		
		User user=userDao.selectById(101);
		System.out.println("ID : "+user.getId());
		System.out.println("Name : "+user.getName());
		System.out.println("Email : "+user.getEmail());
		System.out.println("Gender : "+user.getGender());
		System.out.println("City : "+user.getCity());
		
		
	}

}
