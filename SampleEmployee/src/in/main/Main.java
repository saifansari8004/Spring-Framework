package in.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.beans.Employee;
import in.beans.Services;
import in.res.ConfigJava;


public class Main 
{
	public static void main(String[] args) {
		//String loc = "in/res/applicationContext.xml";
		//ApplicationContext context = new ClassPathXmlApplicationContext(loc);
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigJava.class);
		
//		Employee emp = (Employee)context.getBean("emp_id");
//		emp.display();
//		
//		Employee emp1 = (Employee)context.getBean(Employee.class);
//		emp1.display();
		
		Services src = (Services)context.getBean("services");
		src.display();
		
		
	}
}
