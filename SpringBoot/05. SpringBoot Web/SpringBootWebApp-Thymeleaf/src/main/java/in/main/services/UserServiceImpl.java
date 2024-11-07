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
		User checkUser=null;
		checkUser=userRepository.findByEmail(user.getEmail());
		if(checkUser != null)
		{
			return false;
		}
		else
		{
			userRepository.save(user);
			return true;
		}
	}

	@Override
	public User loginUser(String email, String password)
	{
		User db_user=null;
		db_user=userRepository.findByEmail(email);
		if(db_user != null && db_user.getPassword().equals(password))
		{
			return db_user;
		}
		return null;
	}

}
