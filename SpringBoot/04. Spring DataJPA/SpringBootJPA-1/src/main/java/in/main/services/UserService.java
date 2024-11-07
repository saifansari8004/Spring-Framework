package in.main.services;

import java.util.List;

import in.main.entities.User;

public interface UserService
{
	public boolean insertUserData(User user);
	public boolean updateEmailByID(Long id,String email);
	public List<User> getAllUser();
	public User getUserByID(Long id);
	public boolean deleteUserData(Long id);
}
