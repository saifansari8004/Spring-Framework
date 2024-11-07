package in.main.controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController
{
	@GetMapping("getName")
	public String getNamePage(Model model)
	{
		model.addAttribute("name","Mohammad Saif Ansari");
		return "profile";
	}
	
	@GetMapping("conditional")
	public String getCondition(Model model)
	{
		int n1=2;
		int n2=4;
		model.addAttribute("num1",n1);
		model.addAttribute("num2",n2);
		return "condition";
	}
	
	@GetMapping("looping")
	public String getLoopingPage(Model model)
	{
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		for(int i=2;i<=10;i++)
		{
			list.add(i);
		}
		model.addAttribute("model_list",list);
		return "looping";
	}
}
