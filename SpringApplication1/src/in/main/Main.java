package in.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.beans.Student;

public class Main 
{
	public static void main(String args[])
	{
		String conf_loc = "in/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(conf_loc);
		
		Student std1 = (Student)context.getBean("stdid1");
		std1.display();
		
		System.out.println("+++++++++++++++++++++");
		
		Student std2 = (Student)context.getBean("stdid2");
		std2.display();
	}
}
