package com.wisely.highlight.spring4.ch4.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String hello(ModelMap model) {
		model.addAttribute("TestJavaConfig", "say hello from controller by mvc 4");
		return "index";
	}

	@RequestMapping(value = "/helloagain", method = RequestMethod.GET)
	 public String sayHelloAgain(ModelMap model) {
	 model.addAttribute("greeting", "Hello World Again, from Spring 4 MVC");
	 return "welcome";
	 }
	// @RequestMapping(method = RequestMethod.GET)
	// public String sayHello(ModelMap model) {
	// model.addAttribute("greeting", "Hello World from Spring 4 MVC");
	// return "welcome";
	// }
	//
	// @RequestMapping(value = "/helloagain", method = RequestMethod.GET)
	// public String sayHelloAgain(ModelMap model) {
	// model.addAttribute("greeting", "Hello World Again, from Spring 4 MVC");
	// return "welcome";
	// }
}
