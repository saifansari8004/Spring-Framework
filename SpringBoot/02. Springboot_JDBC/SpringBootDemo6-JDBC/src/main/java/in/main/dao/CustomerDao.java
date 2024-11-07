package in.main.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import in.main.beans.Customer;

@Repository
public class CustomerDao 
{
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public boolean Insert_Customer(Customer customer)
	{
		boolean status = false;
		try 
		{
			String insert_sql_query = "insert into customers values(?,?,?,?,?)";
			int cnt = jdbcTemplate.update(insert_sql_query,customer.getId(),customer.getName(),customer.getEmail(),customer.getGender(),customer.getCity());
			if(cnt > 0)
			{
				status =true;
			}
			else 
			{
				status=false;
			}
		} 
		catch (Exception e)
		{
			status=false;
			e.printStackTrace();
		}
		return status;
	}
	
	public boolean Update_Customer(Customer customer)
	{
		boolean status=false;
		try
		{
			String update_sql_query="update customers set name=?,email=?,gender=?,city=? where id=?";
			int cnt=jdbcTemplate.update(update_sql_query,customer.getName(),customer.getEmail(),customer.getGender(),customer.getCity(),customer.getId());
			if (cnt > 0)
			{
				status=true;
			} 
			else 
			{
				status=false;
			}
		}
		catch (Exception e)
		{
			status=false;
			e.printStackTrace();
		}
		
		
		return status;
	}
	
	//----------------------------------------Deletion
	
	public boolean delete_customer(int id)
	{
		boolean status=false;
		try
		{
			String update_sql_query="delete from customers where id=?";
			int cnt=jdbcTemplate.update(update_sql_query,id);
			if (cnt > 0)
			{
				status=true;
			} 
			else 
			{
				status=false;
			}
		}
		catch (Exception e)
		{
			status=false;
			e.printStackTrace();
		}
		
		
		return status;
	}
	
	
	//=========Select for Object====
	public Customer SelectById(int id)
	{
		Customer customer = new Customer();
		try 
		{
			String select_sql_query="select * from customers where id = ?";
			customer=jdbcTemplate.queryForObject(select_sql_query,new CustomerRowMapper(),id);	
		}
		catch (Exception e) 
		{
			 e.printStackTrace();
		}
		return customer;
	}
	
	
	// Select All from Table
	public List<Customer> SelectAll()
	{
		String select_query="select * from customers";
		return jdbcTemplate.query(select_query,new CustomerRowMapper());
	}
	
	
	
	
	
	
	public static final class CustomerRowMapper implements RowMapper<Customer>
	{

		@Override
		public Customer mapRow(ResultSet rs, int rowNum) throws SQLException 
		{
			Customer customer = new Customer();
			
			customer.setId(rs.getInt("id"));
			customer.setName(rs.getString("name"));
			customer.setEmail(rs.getString("email"));
			customer.setGender(rs.getString("gender"));
			customer.setCity(rs.getString("city"));
			
			return customer;
		}
		
	}
}
