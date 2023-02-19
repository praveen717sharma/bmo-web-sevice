package com.bmo.tradeinfoservice.exception;

import java.time.LocalDateTime;

public class TradeException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	private String message;
	private LocalDateTime localDatetime;
	private String discription;
	
	public TradeException() {
		super();
	}

	public TradeException(String message, LocalDateTime localDatetime, String discription) {
		super();
		this.message = message;
		this.localDatetime = localDatetime;
		this.discription = discription;  
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getLocalDatetime() {
		return localDatetime;
	}

	public void setLocalDatetime(LocalDateTime localDatetime) {
		this.localDatetime = localDatetime;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

}
