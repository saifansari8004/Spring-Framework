package in.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.main.beans.Customer;
import in.main.dao.CustomerDao;

@SpringBootApplication
public class SpringBootDemo6JdbcApplication implements CommandLineRunner
{
	@Autowired
	CustomerDao customerDao;
	public static void main(String[] args) 
	{
		SpringApplication.run(SpringBootDemo6JdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		//Customer customer1=new Customer(101, "Saif", "saif@gmail.com", "Male", "Mumbai");
//		Customer customer2=new Customer(103, "Anas", "anas@gmail.com", "Male", "Raigad");
//		boolean status=customerDao.Insert_Customer(customer2);
//		if(status)
//		{
//			System.out.println("Insertion Success");
//		}
//		else
//		{
//			System.out.println("Insertion Failed");
//		}
		
		//-----Updation by Customer
//		Customer customer = new Customer(101, "Saif", "saif@gmail.com", "Male", "Magarpatta");
//		boolean status=customerDao.Update_Customer(customer);
//		if(status)
//		{
//			System.out.println("Updation Success");
//		}
//		else
//		{
//			System.out.println("Updation Failed");
//		}
		
		//-----Updation byID
//		Customer customer = customerDao.SelectById(101);
//		customer.setCity("Pune");
//		
//		boolean status=customerDao.Update_Customer(customer);
//		if(status)
//		{
//			System.out.println("Updation Success");
//		}
//		else
//		{
//			System.out.println("Updation Failed");
//		}
//		
		
		// ===Deletion====
//		boolean status=customerDao.delete_customer(103);
//		if(status)
//		{
//			System.out.println("Deletion Success");
//		}
//		else
//		{
//			System.out.println("Deletion Failed");
//		}
//		
		// select by id
		//Customer customer = customerDao.SelectById(101);
//		System.out.println("ID : "+customer.getId());
//		System.out.println("Name : "+customer.getName());
//		System.out.println("Email : "+customer.getEmail());
//		System.out.println("Gender : "+customer.getGender());
//		System.out.println("City : "+customer.getCity());
		
		//select all customer
		List<Customer> list=customerDao.SelectAll();
		for(Customer customer:list) 
		{
			System.out.println("**************************");
			System.out.println("ID : "+customer.getId());
			System.out.println("Name : "+customer.getName());
			System.out.println("Email : "+customer.getEmail());
			System.out.println("Gender : "+customer.getGender());
			System.out.println("City : "+customer.getCity());
		}
		
	}

}
