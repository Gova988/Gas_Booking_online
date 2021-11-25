package com.gasbooking.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class CylinderNotFoundException extends Exception {


		
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CylinderNotFoundException(String message) {
		super(message);
}

	public String getErrormessage() {

		return null;
	}

	
	}

