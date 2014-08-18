package com.shusenwang.web.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.support.RequestContextUtils;

@Controller
public class SpringController {

	@Resource(name="springManager")
	private ISpring springManager;
	
	@RequestMapping("/spring/get")
	public String get(HttpServletRequest request){
		//spring context
		WebApplicationContext ac1=WebApplicationContextUtils.getWebApplicationContext(request.getSession().getServletContext());
		//spring mvc context
		WebApplicationContext ac2=RequestContextUtils.getWebApplicationContext(request);
		System.out.println(springManager.get());
		return "/success";
	}
	
}
