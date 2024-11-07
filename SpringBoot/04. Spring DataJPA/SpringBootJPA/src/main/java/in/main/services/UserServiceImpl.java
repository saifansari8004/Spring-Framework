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
	
	public boolean insertUserDetails(User user)
	{
		boolean status=false;
		try 
		{
			userRepository.save(user);
			status=true;
			
		} catch (Exception e) 
		{
			status=false;
			e.printStackTrace();
		}
		return status;
	}
	@Override
	public List<User> getAllUser()
	{
		List<User> uList=null;
		try 
		{
			uList= userRepository.findAll();
		}
		catch (Exception e) 
		{
			uList=null;
		}
		return uList;
	}
	@Override
	public User getUserById(Long id)
	{
		User user=null;
		Optional<User> userOptional=userRepository.findById(id); 
		if(userOptional.isPresent())
		{
			user= userOptional.get();
		}
		else {
			user= null;
		}
		return user;
	}

	@Override
	public boolean updateUserEmail(Long id,String email) 
	{
		User user=null;
		user=getUserById(id);
		boolean status = false;
		if(user != null)
		{
			user.setEmail(email);
			userRepository.save(user);
			status=true;
		}
		else {
			status = false;
		}
		
		return status;
	}
	@Override
	public boolean updateUserPassword(Long id,String password) 
	{
		User user=null;
		user=getUserById(id);
		boolean status = false;
		if(user != null)
		{
			user.setPassword(password);
			userRepository.save(user);
			status=true;
		}
		else {
			status = false;
		}
		
		return status;
	}

}
