package in.main.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import in.main.entities.User;
import in.main.services.UserService;

@RestController
public class MyController
{
	@Autowired
	private UserService userService;
	
	@GetMapping("/user")
	public List<User> getUsersDetail()
	{
		return userService.getAllUser();
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUserByID(@PathVariable Long id)
	{
		User user= userService.getUserByIDOptional(id).orElse(null);
		if(user != null)
		{
			return ResponseEntity.ok(user);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@PutMapping("/user")
	public User insertUserDetails(@RequestBody User user)
	{
		
		return userService.addUser(user);
	}
	
//	@PostMapping("/user/{id}")
//	public ResponseEntity<User> updateUserById(@PathVariable Long id , @RequestBody User user)
//	{
//		User dbUser= userService.updateUser(id, user);
//		if(dbUser != null)
//		{
//			return ResponseEntity.ok(user);
//		}
//		else {
//			return ResponseEntity.notFound().build();
//		}
//	}
	
	@PostMapping("/user/{id}")
	public ResponseEntity<User> updateEmailById(@PathVariable Long id , @RequestBody String email)
	{
		User dbUser= userService.updateEmail(id, email);
		if(dbUser != null)
		{
			return ResponseEntity.ok(dbUser);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
}
