package com.shusenwang.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("admin")
public class AdminController {

    @RequestMapping(value="/manager", method = RequestMethod.GET)
    public ModelAndView helloWorld(Model model) {
        //model.addAttribute("message", "Hello World!");
        return new ModelAndView("/admin");
    }
}