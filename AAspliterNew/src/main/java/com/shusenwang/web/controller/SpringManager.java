package com.shusenwang.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.support.RequestContextUtils;

public class SpringManager implements ISpring{
	@Override
	public String get() {

		
		System.out.println("------I am springManager----");
		
		return "I am getMethod";
	}


}
