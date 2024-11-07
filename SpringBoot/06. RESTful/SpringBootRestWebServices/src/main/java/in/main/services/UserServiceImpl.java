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
	private UserRepository userRepository;
	
	@Override
	public List<User> getAllUser()
	{
		return userRepository.findAll();
	}

	@Override
	public Optional<User> getUserByIDOptional(Long id)
	{
		return userRepository.findById(id);
	}

	@Override
	public User addUser(User user)
	{
		return userRepository.save(user);
	}

	@Override
	public User updateUser(Long id, User user)
	{
		User db_user=userRepository.findById(id).orElse(null);
		if(db_user != null)
		{
			return userRepository.save(user);
		}
		return null;
	}

	@Override
	public User updateEmail(Long id, String email) 
	{
		User db_user=userRepository.findById(id).orElse(null);
		if(db_user != null)
		{
			db_user.setEmail(email);
			return userRepository.save(db_user);
		}
		return null;
	}
	
	

}
