package in.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.beans.Student;

public class Main
{
	public static void main(String[] args) {
		
		String locString = "in/res/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(locString);
		
		Student stdStudent = context.getBean(Student.class);
		stdStudent.display();		
	}
}
