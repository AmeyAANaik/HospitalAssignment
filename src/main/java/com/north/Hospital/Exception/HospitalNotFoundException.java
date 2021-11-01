package com.north.Hospital.Exception;

import java.util.function.Supplier;

import org.omg.SendingContext.RunTime;

public class HospitalNotFoundException extends RuntimeException {

	public HospitalNotFoundException(String id) {
		super("Could not find hospital "+ id);
		// TODO Auto-generated constructor stub
	}


	
}
