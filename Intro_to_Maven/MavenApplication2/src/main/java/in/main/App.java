package in.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.beans.Student;
import in.res.JavaConfig;

public class App 
{
	static ApplicationContext  context;
	@Override
	protected void finalize() throws Throwable 
	{
		System.out.println("Context destroyed");
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        context= new AnnotationConfigApplicationContext(JavaConfig.class);
        
        Student stdStudent = context.getBean(Student.class);
        stdStudent.display();
        context= null;
        try {
			Thread.sleep(2000); // sleep 2 seconds
		} catch (InterruptedException e) {
			
			System.out.println(e);
		}
        System.gc();
        System.out.println("Exit from Main");
    }
}
