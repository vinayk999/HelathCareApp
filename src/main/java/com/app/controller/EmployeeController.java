package com.app.controller;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mysql.jdbc.log.Log;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

	Logger log=Logger.getLogger(EmployeeController.class);
	
	
	@RequestMapping("/view")
	public String showMsg(){
		
		//System.out.println("in view controller");
		log.info("in controller");
		return "View";
	}
}
