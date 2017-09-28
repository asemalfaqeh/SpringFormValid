package com.af.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.af.dao.Users;
import com.af.dao.UsersDao;

@Service
public class UsersServices {

	private UsersDao userdao;
	
	@Autowired
	public void setUserdao(UsersDao userdao) {
		this.userdao = userdao;
	}

	public UsersServices() {
		System.out.println("Loading Services");
	}
	
	public static List<Users> getUsers(){
		return UsersDao.getUsers();
	}
	
}
