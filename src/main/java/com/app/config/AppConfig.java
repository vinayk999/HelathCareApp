package com.app.config;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages="com.app")
@PropertySource("classpath:app.properties")
@EnableWebMvc
public class AppConfig {

	private static Logger log=Logger.getLogger(AppConfig.class);
	@Autowired
	public Environment env;
	@Bean
	public InternalResourceViewResolver viewResolver(){
		log.info("in internalresource view resolver");
		//log.info("in view resolver");
		InternalResourceViewResolver v=new InternalResourceViewResolver();
		//System.out.println("in appconfig view");
		//v.setPrefix("/WEB-INF/views/");
		v.setPrefix(env.getProperty("pre"));
		//System.out.println("in appconfig jsp");
		//v.setSuffix(".jsp");
		v.setSuffix(env.getProperty("suf"));
		//System.out.println("coming out");
		return v;
	}
}
