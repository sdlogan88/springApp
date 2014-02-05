package com.slogan.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping(method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		model.addAttribute("message","Hello Spring MVC Framework!");
		
		return "hello";
	}
	
	@RequestMapping(value="/newRoute/{id}")
	public String newRoute(ModelMap model, @PathVariable(value="id") Long id) {
		model.addAttribute("id",id);
		return "new";
	}
}
 