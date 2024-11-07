package in.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.beans.User;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController 
{
	//@RequestMapping(value = "newPage" ,method= RequestMethod.GET)
	@GetMapping("/newPage")
	public ModelAndView openNewPage()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("newPage");
		return mv;
	}
	
	@GetMapping("/dusraPage")
	public String openDusraPage()
	{
		return "dusraPage";
	}
	
	@GetMapping("myform")
	public String openForm()
	{
		return "myform";
	}
	
	
//	@PostMapping("/profile")
//	public String openProfile(HttpServletRequest req)
//	{
//		String mynameString=req.getParameter("name");
//		String myemailString=req.getParameter("email");
//		String myphoneString=req.getParameter("phone");
//		String mycityString=req.getParameter("city");
//		String mybatsmanString=req.getParameter("batsman");
//		
//		System.out.println("Name :"+mynameString);
//		System.out.println("Email :"+myemailString);
//		System.out.println("Phone :"+myphoneString);
//		System.out.println("City :"+mycityString);
//		System.out.println("Fav Batsman :"+mybatsmanString);
//		
//		return "profile";
//	}

//	@PostMapping("/profile")
//	public String openProfile(	@RequestParam("name") String mynameString,
//								@RequestParam("email") String myemailString,		
//								@RequestParam("phone") String myphoneString,	
//								@RequestParam("city") String mycityString,
//								@RequestParam("batsman") String mybatsmanString,
//								Model model
//								)
//	{
//		
//		System.out.println("Name :"+mynameString);
//		System.out.println("Email :"+myemailString);
//		System.out.println("Phone :"+myphoneString);
//		System.out.println("City :"+mycityString);
//		System.out.println("Fav Batsman :"+mybatsmanString);
//		
////		model.addAttribute("name_key", mynameString);
////		model.addAttribute("email_key", myemailString);
////		model.addAttribute("phone_key", myphoneString);
////		model.addAttribute("city_key", mycityString);
////		model.addAttribute("batsman_key", mybatsmanString);
//		User user = new User();
//		user.setName(mynameString);
//		user.setEmail(myemailString);
//		user.setPhone(myphoneString);
//		user.setCity(mycityString);
//		user.setBatsman(mybatsmanString);
//		
//		model.addAttribute("model_user",user);
//		return "profile";
//	}
	
	@PostMapping("/profile")
	public String openProfile(@ModelAttribute("model_user") User user)
	{
		
		
		return "profile";
	}
}