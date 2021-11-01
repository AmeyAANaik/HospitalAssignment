package com.north.Hospital.ControlerAdvice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.north.Hospital.Exception.HospitalNotFoundException;

@ControllerAdvice
public class controllerAdvice {

	@ResponseBody
	@ExceptionHandler(HospitalNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String hospitalNotFoundException(HospitalNotFoundException ex)
	{
		return ex.getMessage();
	}
	
}
