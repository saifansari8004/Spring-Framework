package in.res;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JavaConfig 
{
	@Bean 
	public DriverManagerDataSource createDataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/spring_programs");
		dataSource.setUsername("root");
		dataSource.setPassword("sa12345");	
		return dataSource;
	}
	
	@Bean
	public NamedParameterJdbcTemplate createTemplate()
	{
		return new NamedParameterJdbcTemplate(createDataSource());
	}
}
