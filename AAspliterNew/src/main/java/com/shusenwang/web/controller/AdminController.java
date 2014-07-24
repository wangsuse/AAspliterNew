package com.shusenwang.web.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.shusenwang.web.entity.User;


@Controller
public class AdminController {
	

	@RequestMapping(value="/validation", method = RequestMethod.POST)
    public ModelAndView validation(@RequestParam("username") String username, @RequestParam("password") String password,HttpServletRequest request, HttpServletResponse response) {
	
		request.getSession().setAttribute("login", "yes");
		request.getSession().setAttribute("username", username);
		//Todo validate user password and username
		
        return new ModelAndView("/index");
    }
	
    @RequestMapping(value="/admin/manager", method = RequestMethod.GET)
    public String manager(HttpServletRequest request) {
        //model.addAttribute("message", "Hello World!");
    	Map<String, Object> map=new HashMap<String, Object>();
    	map.put("user1", "wss");
    	map.put("user2", "wss2");
    	map.put("user3", "wss3");
    	
        return "admin";
    }
    
  
    
    @RequestMapping(value="/registerUser", method = RequestMethod.POST)
    public String registerUser(User user,HttpServletRequest request ) {
    	if (!user.getPassword1().equals(user.getPassword2())){
    		return "error";
    	}
    	request.getSession().setAttribute("userName", user.getUserName());
		request.getSession().setAttribute("login", "yes");
        return "index";
    }
    
    @RequestMapping(value="/updateUser", method = RequestMethod.POST)
    public String register(User user,HttpServletRequest request ) {
    	request.setAttribute("success", "true");
    	
        return "register";
    }	
    
    @RequestMapping(value="/index", method = RequestMethod.GET)
    public String index(HttpServletRequest request ) {

        return "index";
    }
    
    @RequestMapping(value="/loadContent", method = RequestMethod.GET)
    public void loadContent(HttpServletRequest request, HttpServletResponse response ) {

    	String result="{"+
				 "\"username\":"+ request.getSession().getAttribute("username")+"}";
		PrintWriter out=null;
		try {
			out=response.getWriter();
			out.write(result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.setContentType("application/json");
    }
}