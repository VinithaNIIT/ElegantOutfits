package com.niit.controller;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import javax.validation.executable.ExecutableValidator;
import javax.validation.metadata.BeanDescriptor;

import com.niit.model.Category;

public class CategoryFormValidator implements Validator {

	public boolean supports(Class<?> arg0) {
		return Category.class.equals(arg0);
	}

	public void validate(Object arg0, Errors arg1) {
		Category category = (Category) arg0;
		
	}

	

}
