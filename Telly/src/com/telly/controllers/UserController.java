package com.telly.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UserController{
   
    @RequestMapping("/login")
	public String showLogin() {
		return "login";
	}

    @RequestMapping("/loggedout")
	public String showLogout() {
		return "loggedout";
	}
	

}