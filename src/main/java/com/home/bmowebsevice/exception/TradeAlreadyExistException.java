package com.home.bmowebsevice.exception;


public class TradeAlreadyExistException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TradeAlreadyExistException(String message) {
		super(message);
	}
}
