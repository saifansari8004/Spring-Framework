package in.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mysql.cj.x.protobuf.MysqlxCrud.Insert;

import in.beans.Student;
import in.mappers.StudentRowMapper;
import in.res.JavaConfig;

public class App 
{
	// Insert Function
	public static void insert(JdbcTemplate jdbcTemplate)
	{
		int roll = 126;
        String nameString = "Delete";
        float marks = 50.5f;
        String insert_sql_query = "INSERT INTO student VALUES(?,?,?)";
        int cnt = jdbcTemplate.update(insert_sql_query,roll,nameString,marks);
        if(cnt > 0)
        {
        	System.out.println("Data Inserted into Student");
        }
        else {
        	System.out.println("Data Failed to insert into Student");
		}
	}
	
	// Update function
	public static void update(JdbcTemplate jdbcTemplate)
	{
		int roll = 121;
		float marks = 98.1f;
		String update_sql_query = "UPDATE student SET std_marks=? WHERE std_rollno=?";
        int cnt = jdbcTemplate.update(update_sql_query,marks,roll);
        if(cnt > 0)
        {
        	System.out.println("Data Updated in Student");
        }
        else {
        	System.out.println("Data Failed to Updated in Student");
		}
	}
	
	//--Delete function
	public static void delete(JdbcTemplate jdbcTemplate)
	{
		int roll = 126;
		String delete_sql_query = "DELETE from student WHERE std_rollno=?";
        int cnt = jdbcTemplate.update(delete_sql_query,roll);
        if(cnt > 0)
        {
        	System.out.println("Data Deleted from Student");
        }
        else {
        	System.out.println("Data Failed to DELETE");
		}
	}
	
	//--Select_All Query Function
	public static void select_all(JdbcTemplate jdbcTemplate) 
	{
		String select_sql_queryString = "SELECT * FROM student";
        List<Student>std_list=jdbcTemplate.query(select_sql_queryString, new StudentRowMapper());
        System.out.println("RollNo\tName\tMarks");
        for(Student std : std_list)
        {
        	System.out.println(std.getRollno()+"\t"+std.getName()+"\t"+std.getMarks());
        }
	}
	//--Select_Condition Query Function
	public static void select_condition(JdbcTemplate jdbcTemplate) 
	{
		float top = 90.0f;
		String select_sql_queryString = "SELECT * FROM student WHERE std_marks>?";
        List<Student>std_list=jdbcTemplate.query(select_sql_queryString, new StudentRowMapper(),top);
        System.out.println("RollNo\tName\tMarks");
        for(Student std : std_list)
        {
        	System.out.println(std.getRollno()+"\t"+std.getName()+"\t"+std.getMarks());
        }
	}
	//--SelectForObject Query Function
	public static void selectforobject(JdbcTemplate jdbcTemplate) 
	{
		int roll=121;
		String select_sql_queryString = "SELECT * FROM student WHERE std_rollno=?";
        Student std=jdbcTemplate.queryForObject(select_sql_queryString, new StudentRowMapper(),roll);
        
        System.out.println("Roll no :"+std.getRollno());
        System.out.println("Name :"+std.getName());
        System.out.println("Marks :"+std.getMarks());
        System.out.println("==========================");
	}
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        
       //-----CRUD Operation---update() method..
       //insert(jdbcTemplate);
       //update(jdbcTemplate);
       //delete(jdbcTemplate);
        
        //-- Retrieving Operation--- query() method..
        //select_all(jdbcTemplate);
        //select_condition(jdbcTemplate);
        //selectforobject(jdbcTemplate);
        
        
        System.out.println("====Exit from Main====");
    }
}
