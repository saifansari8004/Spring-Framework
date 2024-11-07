package in.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import in.operation.CrudOperation;


public class App 
{
    public static void main( String[] args )
    {
        String locString = "/in/res/applicationContext.xml";
        
        
        ApplicationContext context = new ClassPathXmlApplicationContext(locString);
        JdbcTemplate template = context.getBean(JdbcTemplate.class);
        
        //CrudOperation.insertOperation(npjdbcTemplate);
        //CrudOperation.updateOperation(npjdbcTemplate);
        //CrudOperation.deleteOperation(npjdbcTemplate);
        
        CrudOperation.select_allOperation(template);
        //CrudOperation.selectforobjectOperation(npjdbcTemplate);
        //CrudOperation.select_conditionOperation(npjdbcTemplate);
        
        System.out.println("====EXIT FROM MAIN====");
    }
}
