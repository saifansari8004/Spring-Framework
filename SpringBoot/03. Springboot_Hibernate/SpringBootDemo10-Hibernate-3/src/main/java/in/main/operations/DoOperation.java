package in.main.operations;


import in.main.entities.User;

public interface DoOperation 
{
	public User getUserDetails(Long id);
	public void insertUserDetails(User user);
}
