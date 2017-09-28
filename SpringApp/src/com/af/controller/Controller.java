package com.af.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.af.dao.Users;
import com.af.services.UsersServices;

@org.springframework.stereotype.Controller
@EnableWebMvc
public class Controller {

	private UsersServices usersservices;
	
	@Autowired
	public void setUsersservices(UsersServices usersservices) {
		this.usersservices = usersservices;
	}

	@RequestMapping(value="/Home")
	public String ShowIndex(Model model) {
		List<Users> usrs = UsersServices.getUsers();
		model.addAttribute("users",usrs);
		return "index";
	}

}
