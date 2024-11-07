package in.res;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.beans.Address;
import in.beans.Student;

@Configuration
public class JavaConfig {
	
	@Bean
	public Address createAddress ()
	{
		Address address = new Address();
		address.setHouseno(543);
		address.setCity("Dammam");
		address.setPincode(542321);
		return address;
	}
	@Bean
	public Student createStudent()
	{
		Student stdStudent = new Student();
		stdStudent.setRollno(786);
		stdStudent.setName("Hammad");
		//stdStudent.setAddress(createAddress()); //Manual DI
		return stdStudent;
	}

}
