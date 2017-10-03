package com.af.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.af.services.UsersServices;
import com.af.beans.UserBean;
import com.af.dao.Users;
 
@Controller
@EnableWebMvc
public class Controllers {

	private UsersServices userservie;

	@Autowired
	public void UserService(UsersServices users) {
		this.userservie = users;
	}
	@RequestMapping(value="/Home")
	public String ShowUsers(Model model) {
		List<Users> users = UsersServices.getUserSerive();
		model.addAttribute("users",users);
		return "users";
	}
	//request dispatcher AddUsers.jsp
	@RequestMapping(value="Users")
	public String AddUsers(Model model) {
		//name in the model class
		//List<UserBean> userbean
		Users userbean = new Users();
		model.addAttribute("users",userbean);
		return "addusers";
	}
	//get data form addusers.jsp 
	/*
	@RequestMapping(value="AddUser",method=RequestMethod.POST)
	public String AddUser(Model model,@RequestParam("email")String email,
			@RequestParam("username")String username,
			@RequestParam("password")String password) {
		//model.addAttribute("email",email);
		System.out.println(email + " " + username + " " + password);
		return "addusers";*/
	//get data form addusers.jsp
	
	//handle Exception
	//if found exception forward to error.jsp page
	/*@ExceptionHandler(DataAccessException.class)
	public String DataAccessExceptionHandle() {
		return "error";
	*/
	
	//get data from model
	@RequestMapping(value="AddUser",method=RequestMethod.POST)
	public String AddUser(Model model,@Valid Users users1,BindingResult br) {
		//model.addAttribute("email",email);
		if(br.hasErrors()) {
				/*System.out.println("Form not Validate");
				List<ObjectError> errors = br.getAllErrors();
				for(ObjectError error : errors) {
					System.out.println(error.getDefaultMessage());
					return "addusers";
				} */
			return "addusers";
		}
		//System.out.println(users);
		UsersServices.AddnewUser(users1);
		System.out.println("Success Add");
		return "home";
	}
	
	@RequestMapping(value="/Update")
	public String ShowUpdate(Model model) {
		Users users = new Users();
		model.addAttribute("users",users);
		return "userupdate";
	}
	
	@RequestMapping(value="updateuser",method=RequestMethod.POST)
	public String UpdateUser(Model model,@Valid Users users,BindingResult br) {
		if(br.hasErrors()) {
			return "userupdate";
		}
		UsersServices.UpdateUser(users);
		System.out.println("Update Success");
		return "home";
	}
	
}





