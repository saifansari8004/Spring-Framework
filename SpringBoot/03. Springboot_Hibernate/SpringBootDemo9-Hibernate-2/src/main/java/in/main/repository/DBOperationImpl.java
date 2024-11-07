package in.main.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import in.main.config.HibernateConfig;
import in.main.entities.User;

@Repository
public class DBOperationImpl implements DBOperation
{
	Session session = HibernateConfig.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	
	@Override
	public User getUserDetails(Long id) 
	{
		User user = session.get(User.class, id);
		return user;
	}

	@Override
	public boolean insertUserDetails(User user)
	{
		boolean status=false;
		try 
		{
			session.save(user);
			transaction.commit();
			status=true;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			status=false;
			transaction.rollback();
		}
		return status;
	}

	@Override
	public boolean deleteUserDetails(Long id)
	{
		boolean status=false;
		User user= null;
		user=session.get(User.class, id);
		if(user != null)
		{
			try 
			{
				session.delete(user);
				transaction.commit();
				status=true;
			}
			catch (Exception e) 
			{
				transaction.rollback();
				e.printStackTrace();
				status=false;
			}
		}
		else 
		{
			System.out.println("User not Found");
		}
		
		
		
		return status;
	}

}
