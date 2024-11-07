package in.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.main.entities.User;

@SpringBootApplication
public class SpringBootDemo8HibernateApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(SpringBootDemo8HibernateApplication.class, args);
		
		
		Configuration cfg = new Configuration();
		cfg.configure("/in/main/resources/hibernate.cfg.xml");
		
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
//		try 
//		{
//			User user = new User("Varsha", "varsha@gmail.com", "var123", "Female", "Latur");
//			session.save(user);
//			transaction.commit();
//			System.out.println("Success");
//		}
//		catch (Exception e)
//		{
//			System.out.println("Error");
//			e.printStackTrace();
//		}
		
		try 
		{
			User user=session.get(User.class,9L);
			if(user!=null)
			{
				user.display();
			}
			else {
				System.out.println("User not mila!!");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
