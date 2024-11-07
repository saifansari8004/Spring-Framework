package in.main.repository;

import in.main.entities.User;

public interface DBOperation 
{
	public User getUserDetails(Long id);
	public boolean insertUserDetails(User user);
	public boolean deleteUserDetails(Long id);
}
