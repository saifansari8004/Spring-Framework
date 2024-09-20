package in.res;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("in.beans")
@ComponentScan(basePackages = {"in.beans"})
public class JavaConfig 
{

}
