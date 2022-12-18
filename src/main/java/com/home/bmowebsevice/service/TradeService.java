package com.home.bmowebsevice.service;

import com.home.bmowebsevice.model.Trade;

public interface TradeService {
	
	public abstract Trade getTradebyId(int id);
	
	public abstract Trade saveTrade(Trade trade);
	
	public abstract Trade deleteTradebyId(int id);
	
	public abstract Trade updateTradebyId(int id);

}
