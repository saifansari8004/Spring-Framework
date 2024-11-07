package in.main.services;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.main.entities.User;
import in.main.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	UserRepository userRepository;
	
	@Override
	public boolean insertUserData(User user) 
	{
		boolean status=false;
		try 
		{
			User userCheck=null;
			userCheck=getUserByID(user.getId());
			if(userCheck!=null)
			{
				System.out.println("User Already Registered");
				status=false;
			}
			else
			{
				userRepository.save(user);
				status=true;
			}
			
		} 
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			status=false;
		}
		return status;
	}

	@Override
	public boolean updateEmailByID(Long id, String email)
	{
		boolean status=false;
		try 
		{
			User userCheck=null;
			userCheck=getUserByID(id);
			if(userCheck!=null)
			{
				userCheck.setEmail(email);
				userRepository.save(userCheck);
				status=true;
			}
			else
			{
				System.out.println("User not Found");
				status=false;
			}
		}
		catch
		(Exception e)
		{
			System.err.println(e.getMessage());
			status=false;
		}
		return status;
	}

	@Override
	public List<User> getAllUser() 
	{
		List<User> ulist=null;
		try 
		{
			ulist=userRepository.findAll();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			ulist=null;
		}
		return ulist;
	}

	@Override
	public User getUserByID(Long id) 
	{
		User user =null;
		try 
		{
			Optional<User> optional=userRepository.findById(id);
			if(optional.isPresent())
			{
				user=optional.get();
			}
			else
			{
				user=null;
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
			user=null;
		}
		return user;
	}

	@Override
	public boolean deleteUserData(Long id) 
	{
		boolean status = false;
		try 
		{
			User user =null;
			user= getUserByID(id);
			if(user != null)
			{
				userRepository.deleteById(id);
				status=true;
			}
			else {
				System.out.println("User Not Found");
				status=false;
			}
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
			status=false;
		}
		return status;
	}
	

}
