package in.res;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.beans.Address;
import in.beans.Student;

@Configuration
public class JavaConfig 
{
	@Bean
	public Address createaddr()
	{
		Address addr = new Address(654,"Raigad",234124);
		return addr;
	}
	
	@Bean
	public Student createstd()
	{
		Student stdStudent = new Student(876,"Geeta",createaddr());
		return stdStudent;
	}
}
