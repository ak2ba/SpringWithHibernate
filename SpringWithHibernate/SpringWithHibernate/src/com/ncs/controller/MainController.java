package com.ncs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ncs.HibernateManager.HibernateManager;

@Controller
public class MainController {
	@RequestMapping("/")
	String firstRequest() {
		return "first-page";
	}
	
	@RequestMapping("/register")
	String registerRequest() {
		return "register-page";
	}
	
	@RequestMapping("/registerUserData")
	String registerUserInfo(@RequestParam("name") String name, @RequestParam("pwd") String pwd) {
		HibernateManager hm = new HibernateManager();
		int x = hm.register(name, pwd);
		
		if(x==1)
			{
				return "success-reg-page";
			}
		else {
			return "fail-reg-page";
		}
	}
	
	@RequestMapping("/login")
	String loginRequest() {
		return "login-page";
	}
	
	@RequestMapping("/loginUser")
	String loginUser(@RequestParam("name") String name, 
			@RequestParam("pwd") String pwd, Model m) {
		HibernateManager hm = new HibernateManager();
		int x = hm.login(name, pwd);
		
		if(x==1)
			{
				m.addAttribute("name", name);
				return "success-login-page";
			}
		else {
			return "fail-login-page";
		}
	}
}
