package com.home.bmowebsevice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.home.bmowebsevice.model.Trade;
import com.home.bmowebsevice.service.TradeService;

@RestController
public class TradeController {

	@Autowired
	private TradeService tradeService;

	@GetMapping("getTrade/{id}")
	public ResponseEntity<Trade> getTrade(@PathVariable("id") Integer myId) {

		Trade trade = tradeService.getTradebyId(myId);
		return new ResponseEntity<Trade>(trade, HttpStatus.OK);
	}
	 

	@PostMapping("trade")
	public ResponseEntity<Trade> saveTrade(@RequestBody Trade myTrade) {
		
		Trade trade = tradeService.saveTrade(myTrade);
		return new ResponseEntity<Trade>(trade, HttpStatus.CREATED);

	}

	@DeleteMapping("trade/{id}")
	public ResponseEntity<Trade> deleteTradeId(@PathVariable("id") Integer myId) {

		Trade trade = tradeService.deleteTradebyId(myId);
		return new ResponseEntity<Trade>(trade, HttpStatus.OK);
	}
 
	@PutMapping("update/{id}")
	public ResponseEntity<Trade> updateTrade(@PathVariable("id") Integer id, @RequestBody Trade trade) {

		return new ResponseEntity<Trade>(trade, HttpStatus.OK);
	}

}
