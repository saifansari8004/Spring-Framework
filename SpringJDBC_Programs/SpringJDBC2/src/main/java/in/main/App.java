package in.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import in.operations.CrudOperation;
import in.res.JavaConfig;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
       NamedParameterJdbcTemplate npjdbcTemplate = context.getBean(NamedParameterJdbcTemplate.class);
       
       //CrudOperation.insertOperation(npjdbcTemplate);
       //CrudOperation.updateOperation(npjdbcTemplate);
       //CrudOperation.deleteOperation(npjdbcTemplate);
       
       //CrudOperation.select_allOperation(npjdbcTemplate);
       //CrudOperation.selectforobjectOperation(npjdbcTemplate);
       //CrudOperation.select_conditionOperation(npjdbcTemplate);
       
       System.out.println("====EXIT FROM MAIN====");
    }
}
