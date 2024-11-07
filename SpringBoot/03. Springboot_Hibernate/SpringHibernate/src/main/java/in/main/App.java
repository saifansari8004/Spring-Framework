package in.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.entities.User;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Enter");
        
        Configuration cfg=new Configuration();
        cfg.configure("/in/config/hibernate.cfg.xml");
        
        
        SessionFactory sessionFactory=cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        
        
        //Insert
//        try 
//        {
//        	session.save(user);
//        	transaction.commit();
//        	System.out.println("Success");
//		}
//        catch (Exception e) 
//        {
//			transaction.rollback();
//			e.printStackTrace();
//		}
        
        
        //Select
        
//        try 
//        {
//			User user2=session.get(User.class, 1L);
//			user2.display();
//        	
//		}
//        catch (Exception e) 
//        {
//        	
//			e.printStackTrace();
//		}

        //Update
//      try 
//      {
//    	 User user2=session.get(User.class, 4L);
//    	 user2.setCity("Raigad");
//    	 
//      	session.saveOrUpdate(user2);
//      	transaction.commit();
//      	System.out.println("Success");
//		}
//      catch (Exception e) 
//      {
//			transaction.rollback();
//			e.printStackTrace();
//		}
//        
        
        //Delete
        
        try 
        {
        	User user2=session.get(User.class, 5L);
        	session.delete(user2);
        	transaction.commit();
        	System.out.println("Success");
  		}
        catch (Exception e) 
        {
  			transaction.rollback();
  			e.printStackTrace();
  		}
          
        
        
        System.out.println("Exit");
    }
}
