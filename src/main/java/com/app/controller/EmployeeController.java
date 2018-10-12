package com.app.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

	private static Logger log=Logger.getLogger(EmployeeController.class);
	
	
	@RequestMapping("/view")
	public String showMsg(){
		log.info("in controller");
		/*//System.out.println("in view controller");
		log.info("in controller");*/
		return "View";
	}
}
