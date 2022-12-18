package com.home.bmowebsevice.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class TradeExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(TradeNotFoundException.class)
	public final ResponseEntity<TradeException> tradeNotFoundException(Exception ex, WebRequest request)
			throws Exception {

		TradeException tradeException = new TradeException(ex.getMessage(), LocalDateTime.now(),
				request.getDescription(false));

		return new ResponseEntity<TradeException>(tradeException, HttpStatus.NOT_FOUND);

	}
	

}
