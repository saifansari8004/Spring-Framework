package in.main.services;

import java.util.List;

import in.main.entities.User;

public interface UserService 
{
	public boolean insertUserDetails(User user);
	public List<User> getAllUser();
	public User getUserById(Long id);
	public boolean updateUserEmail(Long id,String email);
	public boolean updateUserPassword(Long id,String psassword);
}
