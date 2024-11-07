package in.main.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import in.main.beans.User;

@Repository
public class UserDao 
{	
	@Autowired
	JdbcTemplate template;
	
	//Insert Data
	public boolean insertData(User user)
	{
		boolean st=false;
		try 
		{
			String queryString="insert into customers values(?,?,?,?,?)";
			int cnt = template.update(queryString,user.getId(),user.getName(),user.getEmail(),user.getGender(),user.getCity());
			if(cnt > 0)
			{
				st=true;
			}
		} 
		catch (Exception e)
		{
			st=false;
			e.printStackTrace();
		}
		return st;
	}
	
	//upadte data by class
	public boolean updataDatabyClass(User user)
	{
		boolean st=false;
		try 
		{
			String queryString="update customers set name=?,email=?,gender=?,city=? where id=?";
			int cnt = template.update(queryString,user.getName(),user.getEmail(),user.getGender(),user.getCity(),user.getId());
			if(cnt > 0)
			{
				st=true;
			}
		} 
		catch (Exception e)
		{
			st=false;
			e.printStackTrace();
		}
		return st;
	}
	
	
	//delete by id
	public boolean deletebyID(int id)
	{
		boolean st=false;
		try 
		{
			String queryString="delete from customers where id=?";
			int cnt = template.update(queryString,id);
			if(cnt > 0)
			{
				st=true;
			}
		} 
		catch (Exception e)
		{
			st=false;
			e.printStackTrace();
		}
		return st;
	}
	
	
	
	//select all
	public List<User> selectAll()
	{
		String queryString="Select * from customers";
		return template.query(queryString, new UserRowMapper());
	}
	
	//select for objectpublic List<User> selectAll()
	public User selectById(int id)
	{
		String queryString="Select * from customers where id=?";
		return template.queryForObject(queryString, new UserRowMapper(),id);
	}
	
	public static final class UserRowMapper implements RowMapper<User>
	{

		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException
		{
			return new User(rs.getInt("id"), rs.getString("name"), rs.getString("email"), rs.getString("gender"), rs.getString("city"));
		}
		
	}
}
