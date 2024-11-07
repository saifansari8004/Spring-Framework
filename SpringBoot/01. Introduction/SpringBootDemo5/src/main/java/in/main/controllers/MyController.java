package in.main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController
{
	@ResponseBody
	@GetMapping("/")
	public String page()
	{
		return "Welcome to First Practice Module of SpringBoot Web Module";
	}
}
