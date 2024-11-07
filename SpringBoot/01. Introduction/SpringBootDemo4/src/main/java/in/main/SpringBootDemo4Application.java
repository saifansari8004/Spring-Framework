package in.main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import in.main.beans.User;

@SpringBootApplication
public class SpringBootDemo4Application implements CommandLineRunner
{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		user1().display();
		user2().display();
		user3().display();
	}
	
	@Bean
	public User user1()
	{
		return new User(231,"Saif Ansair", 98.6f);
	}
	
	@Bean
	public User user2()
	{
		return new User(232,"Areeb Sayed", 99.6f);
	}
	
	@Bean
	public User user3()
	{
		return new User(233,"Farhan Pal", 97.6f);
	}

}
