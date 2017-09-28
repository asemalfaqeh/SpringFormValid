package com.af.validation;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.validator.routines.EmailValidator;


;

public class ValidEmailImp1 implements ConstraintValidator<ValidEmail,String > {

	private int min;
	
	@Override
	public void initialize(ValidEmail constarintannotaion) {
		// TODO Auto-generated method stub
		 min = constarintannotaion.min();
	}

	@Override
	public boolean isValid(String email, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		if(email.length()<=min) {
			return false;
		}
		if(!EmailValidator.getInstance(false).isValid(email)) {
			return false;
		}
		return true;
		
	}

	
}