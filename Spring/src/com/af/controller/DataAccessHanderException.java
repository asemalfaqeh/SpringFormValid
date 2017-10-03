package com.af.controller;

import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class DataAccessHanderException {

	@ExceptionHandler(DataAccessException.class)
	public String DataAccessExceptionHandle() {
		return "error";
	}
	
}
