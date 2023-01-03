package com.bmo.tradeinfoservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class TradeNotFoundException extends RuntimeException{
	
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	public TradeNotFoundException(String message) {
		super(message);
	}

}
