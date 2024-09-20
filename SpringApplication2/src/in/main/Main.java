package in.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.beans.Student;
import in.resources.ConfigJavaFile;

public class Main 
{
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigJavaFile.class);
		
//		Student std = (Student)context.getBean("stdid");
//		std.display();
		
//		Student std = (Student)context.getBean(Student.class); // for multiple obj it will give error
//		std.display();
		
		Student std1 = (Student)context.getBean("stdid1");
		std1.display();
		
		Student std2 = (Student)context.getBean("stdid2");
		std2.display();
		
	}
}
