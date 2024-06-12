package springmvcProject.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController 
{
	@RequestMapping("/home")
	public String home(Model model)
	{
		System.out.println("this is url page");
		model.addAttribute("name","Monika kushwah");
		model.addAttribute("id",101);
//		List<String> friends = new ArrayList<String>();
//		friends.add("monika");
//		friends.add("vaishu");
//		friends.add("aryan");
//		model.addAttribute("frnd",friends);
		
		return "index";
	}
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("this is about url page");
		return "about";
	}
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("help page");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name","monika");
		modelAndView.addObject("id",121);
		
		modelAndView.setViewName("help");
		return modelAndView;
	}

}
