package com.jagadish.exception;

@SuppressWarnings("serial")
public class HotelNotFoundException extends RuntimeException{

	public HotelNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public HotelNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	
}
