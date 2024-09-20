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
		Address addr = new Address();
		
		addr.setHomeno(543);
		addr.setCityString("Mumbai");
		addr.setPincode(987654);
		
		return addr;
	}
	
	@Bean
	public Student createstd()
	{
		Student stdStudent = new Student();
		
		stdStudent.setRollno(5468);
		stdStudent.setNameString("Ragat");
		stdStudent.setAddress(createaddr());
		
		return stdStudent;
	}
}
