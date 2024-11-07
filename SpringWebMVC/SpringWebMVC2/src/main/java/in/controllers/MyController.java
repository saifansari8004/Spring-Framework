package in.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
	@GetMapping("/about-us")
	public String openAbout()
	{
		return "about-us";
	}
}
