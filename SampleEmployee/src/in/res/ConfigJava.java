package in.res;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import in.beans.Employee;

@Configuration
@ComponentScan("in.beans")
public class ConfigJava 
{
//	@Bean
//	public Employee emp_id()
//	{
//		Employee employee = new Employee();
//		employee.setEmpid(9870);
//		employee.setName("Ronalodo");
//		employee.setAddress("Africs");
//		return employee;
//	}
}
