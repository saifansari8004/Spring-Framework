package in.main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController 
{
	@GetMapping("/")
	@ResponseBody
	public String openPage()
	{
		return "Welcome to first web spring boot web program";
	}
}
