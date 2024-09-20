package in.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.beans.Student;
@Configuration
public class ConfigJavaFile 
{
	
	//Simple Beans
//	@Bean
//	public Student stdid()
//	{
//		Student stdStudent = new Student();
//		
//		stdStudent.setName("Anas");
//		stdStudent.setRollno(2009);
//		stdStudent.setEmail("anas@gamil.com");
//		
//		return stdStudent;
//	}
	
	
	// Bean with id and method name
	@Bean("stdid1")
	public Student createStudent()
	{
		Student stdStudent = new Student();
		
		stdStudent.setName("Anas");
		stdStudent.setRollno(2009);
		stdStudent.setEmail("anas@gamil.com");
		
		return stdStudent;
	}
	
	@Bean("stdid2")
	public Student createStudent1()
	{
		Student stdStudent = new Student();
		
		stdStudent.setName("Waib");
		stdStudent.setRollno(2002);
		stdStudent.setEmail("waib@gamil.com");
		
		return stdStudent;
	}
	
}
