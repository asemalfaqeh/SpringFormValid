package com.af.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.af.beans.UserBean;
import com.af.dao.Users;
import com.af.dao.UsersDao;

@Service
public class UsersServices {

	private UsersDao userdao;
	
	public UsersServices() {
		System.out.println("Servcies Success Loading");
	}
	
	@Autowired
	public void setUserdao(UsersDao userdao) {
		this.userdao = userdao;
	}

	public static List<Users> getUserSerive(){
		return UsersDao.getUsers();
	}
	
	public static boolean AddnewUser(Users users) {
		return UsersDao.AddUser(users);
	}
	
	public static boolean UpdateUser(Users users) {
		return UsersDao.Update(users);
	}
	
	
}
