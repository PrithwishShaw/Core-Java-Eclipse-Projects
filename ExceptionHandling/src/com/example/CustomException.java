package com.example;

public class CustomException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomException(String bal) {
		System.out.println(bal);
	}

}
