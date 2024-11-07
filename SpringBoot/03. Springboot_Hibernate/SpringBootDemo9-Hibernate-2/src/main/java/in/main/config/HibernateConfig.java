package in.main.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig 
{
	public static SessionFactory getSessionFactory()
	{
		Configuration cfg= new Configuration();
		cfg.configure("/in/main/resources/hibernate.cfg.xml");
		
		return cfg.buildSessionFactory();
	}
}
