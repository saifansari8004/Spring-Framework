package in.main.controllers;

import java.net.http.HttpRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	private UserServiceImpl serviceImpl;
	
	@GetMapping("/register")
	public String openRegisterPage(Model model)
	{
		model.addAttribute("user",new User());
		return "register";
	}
	
	@PostMapping("/regForm")
	public String userRegistration(@ModelAttribute("user") User user,Model model)
	{
		boolean status=serviceImpl.registerUser(user);
		if(status)
		{
			model.addAttribute("successMsg","User Registeration Successfully");
		}
		else
		{
			model.addAttribute("errorMsg","User Registeration Failed");
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
	public String userLoginForm(@ModelAttribute("user") User user , Model model)
	{
		User db_user=null;
		db_user=serviceImpl.loginUser(user.getEmail(), user.getPassword());
		if(db_user != null)
		{
			model.addAttribute("model_user",db_user);
			return "profile";
		}
		else
		{
			model.addAttribute("errorMsg","Invalid Credentials!!");
			return "login";
		}
	}
	
	@GetMapping("/logout")
	public String logoutUser(HttpServletRequest request)
	{
		HttpSession session=request.getSession(false);
		if(session!=null)
		{
			session.invalidate();
		}
		return "redirect:/login";
	}
	
	
}
