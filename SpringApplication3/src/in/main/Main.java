package in.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.beans.Student;
import in.res.JavaConfig;

public class Main 
{
	public static void main(String[] args) {
		
//		String locString = "in/res/applicationContext.xml";
//		ApplicationContext context = new ClassPathXmlApplicationContext(locString);
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Student std1 = (Student)context.getBean("student");
		std1.display();
	}
}
