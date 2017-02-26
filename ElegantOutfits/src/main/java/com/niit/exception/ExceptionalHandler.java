package com.niit.exception;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionalHandler {
	
	private static final Logger log=LoggerFactory.getLogger(ExceptionalHandler.class);
	
	
	@ExceptionHandler(SQLException.class)
	public ModelAndView handlesSQLException(HttpServletRequest request,Exception e)
	{
		log.error("SQLException Occured:: URL="+request.getRequestURI());
		log.error("SQLException Occured:: Exception="+e.getMessage());
		ModelAndView mv=new ModelAndView("error");
		mv.addObject("message","It seems one of the table or few fields does not ");
		mv.addObject("errorMessage", e.getMessage());
		
		return mv;
	}
	

}
