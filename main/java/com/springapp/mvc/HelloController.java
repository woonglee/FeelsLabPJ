package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	@RequestMapping(value="/main.do",method = RequestMethod.GET)

	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "hello";
	}

	@RequestMapping(value="/{name}/{std}/list.do",method = RequestMethod.GET)
	public String test(@PathVariable String name,@PathVariable String std, ModelMap model,HelloBean bean){

		model.put("name",name);
		model.put("STD",std);

		System.out.println("name : "+name);
		System.out.println("std : "+std);

		String returnPage = name+"/"+std+"/list";
		System.out.println("returnPage : "+returnPage);

		return returnPage;
	}
}