package com.shusenwang.web.controller;


import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shusenwang.web.entity.User;


@Controller

public class AdminController {
	

	@RequestMapping(value="/validation", method = RequestMethod.POST)
    public ModelAndView validation(Model model) {
		//Todo validate user password and username
        return new ModelAndView("/index");
    }
	
    @RequestMapping(value="/admin/manager", method = RequestMethod.GET)
    public String manager(Model model) {
        //model.addAttribute("message", "Hello World!");
    	Map<String, Object> map=new HashMap<String, Object>();
    	map.put("user1", "wss");
    	map.put("user2", "wss2");
    	map.put("user3", "wss3");
    	
        return "admin";
    }
    
  
    
    @RequestMapping(value="/registerUser", method = RequestMethod.POST)
    public String registerUser(User user,HttpServletRequest request ) {
    	request.setAttribute("userName", user.getUserName());
		request.setAttribute("age", user.getAge());
		request.setAttribute("password", user.getPassword());
        return "index";
    }
    
    @RequestMapping(value="/updateUser", method = RequestMethod.POST)
    public String register(User user,HttpServletRequest request ) {
    	request.setAttribute("success", "true");
    	System.out.println(user.getEmail());
        return "register";
}
}