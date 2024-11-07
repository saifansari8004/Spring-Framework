package in.main.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.main.entities.User;
import in.main.services.UserServiceImpl;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class MyController 
{
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	
	@GetMapping("/register")
	public String openRegisterPage(Model model)
	{
		model.addAttribute("user",new User());
		return "register";
	}
	
	@PostMapping("/regForm")
	public String submitForm(@ModelAttribute("user") User user,Model model)
	{
		boolean status=userServiceImpl.registerUser(user);
		if(status)
		{
			model.addAttribute("successMsg","User Registered Successfully");
			System.out.println("User Registered");
		}
		else 
		{
			model.addAttribute("errorMsg","User Registered Failed");
			System.out.println("User not Registered");	
		}
		return "register";
	}
	
	
	@GetMapping("/login")
	public String openLoginPage(Model model)
	{
		model.addAttribute("user",new User());
		return "login";
	}
	
	@PostMapping("/loginForm")
	public String submitLogin(@ModelAttribute("user") User user,Model model)
	{
		User validUser=null;
		validUser = userServiceImpl.getLoginUser(user.getEmail(), user.getPassword());
		if(validUser != null)
		{
			model.addAttribute("model_user",validUser);
			return "profile";
		}
		else 
		{
			model.addAttribute("errorMsg","Invalid Credentials!");
			return "login";
		}
	}
	
	@GetMapping("/logout")
	public String userLogout(HttpServletRequest request)
	{
		HttpSession session=request.getSession();
		if(session != null)
		{
			session.invalidate();
		}
		return "login";
	}
}
