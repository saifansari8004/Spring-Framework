package in.main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootDemo3Application implements CommandLineRunner
{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		demoClass().DemoMothod("Saif");
		demoClass().printMessage("You have successfuly registred for the course Spring boot full stack development");
		
	}
	
	//Bean annotation use krke bean object baneyge to obj return krenga
	@Bean
	public DemoClass demoClass()
	{
		return new DemoClass();
	}

}
