package in.operations;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import in.beans.Student;
import in.mappers.StudentRowMapper;

public class CrudOperation 
{
	public static void insertOperation(NamedParameterJdbcTemplate npjdbcTemplate) 
	{
		Map<String,Object> map = new HashMap<String,Object>();
	    map.put("key_roll", 127);
	    map.put("key_name", "Shams");
	    map.put("key_mark", 80.1f);
	       
	    String insert_sql_query = "INSERT into student VALUES(:key_roll,:key_name,:key_mark)";
	    int cnt = npjdbcTemplate.update(insert_sql_query, map);
	    if(cnt > 0)
	    {
	    	System.out.println("Inserted Successfully");
	    }
	    else 
	    {
	    	System.out.println("Inserted Failed");
	    }
	}
	
	public static void updateOperation(NamedParameterJdbcTemplate npjdbcTemplate) 
	{
		Map<String,Object> map = new HashMap<String,Object>();
	    map.put("key_roll", 127);
	    map.put("key_mark", 80.1f);
	       
	    String update_sql_query = "UPDATE student SET std_marks=:key_mark WHERE std_rollno=:key_roll";
	    int cnt = npjdbcTemplate.update(update_sql_query, map);
	    if(cnt > 0)
	    {
	    	System.out.println("Updated Successfully");
	    }
	    else 
	    {
	    	System.out.println("Updated Failed");
	    }
	}
	
	
	public static void deleteOperation(NamedParameterJdbcTemplate npjdbcTemplate) 
	{
		Map<String,Object> map = new HashMap<String,Object>();
	    map.put("key_roll", 127);
	       
	    String delete_sql_query = "DELETE FROM student WHERE std_rollno=:key_roll";
	    int cnt = npjdbcTemplate.update(delete_sql_query, map);
	    if(cnt > 0)
	    {
	    	System.out.println("Deleted Successfully");
	    }
	    else 
	    {
	    	System.out.println("Deleted Failed");
	    }
	}	
	
	//--Select_All Query Function
	public static void select_allOperation(NamedParameterJdbcTemplate npjdbcTemplate) 
	{
		String select_sql_queryString = "SELECT * FROM student";
	    List<Student>std_list=npjdbcTemplate.query(select_sql_queryString, new StudentRowMapper());
	    System.out.println("RollNo\tName\tMarks");
	    for(Student std : std_list)
	    {
	        System.out.println(std.getRollno()+"\t"+std.getName()+"\t"+std.getMarks());
	    }
	}
	
	//--Select_for_Condition Query Function
	public static void select_conditionOperation(NamedParameterJdbcTemplate npjdbcTemplate) 
	{
		Map<String,Object> map = new HashMap<String,Object>();
	    map.put("key_mark", 90.0f);
		String select_sql_queryString = "SELECT * FROM student WHERE std_marks > :key_mark";
		List<Student>std_list=npjdbcTemplate.query(select_sql_queryString, map, new StudentRowMapper());
		System.out.println("RollNo\tName\tMarks");
		for(Student std : std_list)
		{
			System.out.println(std.getRollno()+"\t"+std.getName()+"\t"+std.getMarks());
		}
	}

	//--SelectForObject Query Function
	public static void selectforobjectOperation(NamedParameterJdbcTemplate npjdbcTemplate) 
	{
		Map<String,Object> map = new HashMap<String,Object>();
	    map.put("key_roll", 125);
		String select_sql_queryString = "SELECT * FROM student WHERE std_rollno=:key_roll";
	    Student std=npjdbcTemplate.queryForObject(select_sql_queryString, map, new StudentRowMapper());
	        
	    System.out.println("Roll no :"+std.getRollno());
	    System.out.println("Name :"+std.getName());
	    System.out.println("Marks :"+std.getMarks());
	    System.out.println("==========================");
	}
}
