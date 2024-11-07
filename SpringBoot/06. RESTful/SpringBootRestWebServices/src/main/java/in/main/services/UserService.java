package in.main.services;

import java.util.List;
import java.util.Optional;

import in.main.entities.User;

public interface UserService 
{
	public List<User> getAllUser();
	public Optional<User> getUserByIDOptional(Long id);
	public User addUser(User user);
	public User updateUser(Long id,User user);
	public User updateEmail(Long id,String email);
}
