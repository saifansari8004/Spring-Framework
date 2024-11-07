package in.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.beans.User;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class SampleController
{
	@GetMapping("/football")
	public String openFootball()
	{
		return "football";
	}
	
	@GetMapping("/cricket")
	public String openCricket()
	{
		return "cricket";
	}
	
	@GetMapping("/enquiry")
	public String openEnquiry()
	{
		return "enquiry";
	}
	
//	@PostMapping("/profile")
//	public String openProfile(HttpServletRequest request)
//	{
//		
//		String nameString=request.getParameter("name");
//		String emailString=request.getParameter("email");
//		String phoneString=request.getParameter("phone");
//		String cityString=request.getParameter("city");
//		
//		System.out.println("Name : "+nameString);
//		
//		return "profile";
//	}
	
//	@PostMapping("/profile")
//	public String openProfile(@RequestParam("name") String nameString,
//								@RequestParam("email") String emailString,
//								@RequestParam("phone") String phoneString,
//								@RequestParam("city") String cityString,
//								Model model)
//	{
//		
//		
//		
//		System.out.println("Name : "+nameString);
//		
//		User user = new User();
//		user.setName(nameString);
//		user.setEmail(emailString);
//		user.setPhone(phoneString);
//		user.setCity(cityString);
//		
//		model.addAttribute("model_user",user);
//		
//		return "profile";
//	}
	
	@PostMapping("/profile")
	public ModelAndView openProfile(@ModelAttribute("model_user") User user)
	{
		return new ModelAndView("profile");
	}
	
	
}
