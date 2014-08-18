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
public class PortalController {
	

	@RequestMapping(value="/AAspliterNew/AAspliterPortal/portal/portal.html", method = RequestMethod.POST)
    public ModelAndView validation(@RequestParam("username") String username, @RequestParam("password") String password,HttpServletRequest request, HttpServletResponse response) {
	
		request.getSession().setAttribute("login", "yes");
		request.getSession().setAttribute("username", username);
		//Todo validate user password and username
		
        return new ModelAndView("/index");
    }
	
}