package com.bmo.tradeinfoservice.controller;

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
import com.bmo.bmomodel.model.Trade;
import com.bmo.tradeinfoservice.service.TradeService;

@RestController
public class TradeController {

	@Autowired
	private TradeService tradeService;

	@GetMapping("trade/{id}")
	public ResponseEntity<Trade> getTrade(@PathVariable("id") Integer myId) {

		Trade trade = tradeService.getTradebyId(myId);
		return new ResponseEntity<Trade>(trade, HttpStatus.OK);
	}

	@PostMapping("trade")
	public ResponseEntity<Trade> saveTrade(@RequestBody Trade myTrade) {

		Trade trade = tradeService.saveTrade(myTrade);
		return new ResponseEntity<com.bmo.bmomodel.model.Trade>(trade, HttpStatus.CREATED);
	}

	@DeleteMapping("trade/{id}")
	public ResponseEntity<String> deleteTradeId(@PathVariable("id") Integer myId) {

		tradeService.deleteTradebyId(myId);
		return new ResponseEntity<String>("Deleted", HttpStatus.OK);
	}

	@PutMapping("trade")
	public ResponseEntity<Trade> updateTrade(@RequestBody Trade trade) {

		Trade newTrade = tradeService.updateTrade(trade);
		return new ResponseEntity<Trade>(newTrade, HttpStatus.OK);
	}

}               
       