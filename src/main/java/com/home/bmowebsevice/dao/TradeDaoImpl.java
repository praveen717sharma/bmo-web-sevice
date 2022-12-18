package com.home.bmowebsevice.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.home.bmowebsevice.exception.TradeNotFoundException;
import com.home.bmowebsevice.model.Trade;
import com.home.bmowebsevice.repo.TradeRepo;

@Repository
public class TradeDaoImpl implements TradeDao{
	
	@Autowired
	private TradeRepo tradeRepo;

	@Override
	public Trade saveTrade(Trade trade) {
		
		Trade resultTrade = tradeRepo.save(trade);
		return resultTrade;		
	}
    
	@Override
	public Trade getTradebyId(int id) {

		Optional<Trade> oTrade = tradeRepo.findById(id);
		if (oTrade.isPresent()) {
			return oTrade.get();
		} else {
			throw new TradeNotFoundException("Trade Not Found Message");
		}
	}
    
	@Override
	public Trade deleteTradebyId(int id) {
		Optional<Trade> oTrade = tradeRepo.findById(id);
		if (oTrade.isPresent()) {
			return oTrade.get();
		} else {
			System.out.println("Trade not found");
		}
		return null;
	}

	@Override
	public Trade updateTradebyId(int id) {
	Optional<Trade>	oTrade=tradeRepo.findById(id);
		return getTradebyId(id);
	}

}
