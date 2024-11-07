package in.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.main.entities.User;
import in.main.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public boolean registerUser(User user) 
	{
		try 
		{
			User checkUser=null;
			checkUser=userRepository.findByEmail(user.getEmail());
			if(checkUser!=null)
			{
				return false;
			}
			else
			{
				userRepository.save(user);
				return true;
			}
		}
		catch (Exception e) 
		{
			System.err.println(e.getMessage());
			return false;
		}
	}

	@Override
	public User getLoginUser(String email, String password)
	{
		User user=null;
		try 
		{
			user = userRepository.findByEmail(email);
			if(user != null)
			{
				if(user.getPassword().equals(password))
				{
					return user;
				}
				else
				{
					return null;
				}
			}
			else
			{
				return null;
			}
		}
		catch (Exception e) 
		{
			System.err.println(e.getMessage());
			return null;
		}
	}
	
	

}
