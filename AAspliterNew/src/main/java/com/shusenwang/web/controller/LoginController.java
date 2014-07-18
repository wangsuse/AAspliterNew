package com.shusenwang.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shusenwang.web.entity.User;

@Controller
public class LoginController {

	@RequestMapping(value="/login", method = RequestMethod.GET)
    public ModelAndView login(Model model) {
        return new ModelAndView("/login");
    }
	
	
	@RequestMapping(value="/register", method = RequestMethod.GET)
	    public String register(User user,HttpServletRequest request ) {
	        return "register";
	}
	
	@RequestMapping(value="/profile", method = RequestMethod.GET)
    public String profile(User user,HttpServletRequest request ) {
        return "profile";
}
	
}
