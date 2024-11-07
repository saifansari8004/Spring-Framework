package in.main.operations;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import in.main.config.HibernateConfig;
import in.main.entities.User;

@Repository
public class DoOperationImpl implements DoOperation
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
	public void insertUserDetails(User user)
	{
		try 
		{
			session.save(user);
			transaction.commit();
			System.out.println("Success");
		} 
		catch (Exception e) {
			transaction.rollback();
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
