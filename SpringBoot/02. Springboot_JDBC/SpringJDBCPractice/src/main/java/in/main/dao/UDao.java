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
public class UDao 
{
	@Autowired
	JdbcTemplate template;
	
	
	public boolean insert(User user)
	{
		boolean sta=false;
		try 
		{
			String insertString="insert into customers value(?,?,?,?,?)";
			int cnt = template.update(insertString,user.getId(),user.getName(),user.getEmail(),user.getGender(),user.getCity());
			if (cnt > 0)
			{
				sta=true;
			}
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return sta;
	}
	
	
	public List<User> selectAll()
	{
		return template.query("select * from customers", new UserRowMapper());
	}
	
	public static final class UserRowMapper implements RowMapper<User>
	{

		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			return new User(rs.getInt("id"), rs.getString("name"), rs.getString("email"), rs.getString("gender"), rs.getString("city"));
		}
		
	}
}
