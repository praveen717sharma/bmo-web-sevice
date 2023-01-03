package com.bmo.tradeinfoservice.service;

import com.bmo.bmomodel.model.Trade;

public interface TradeService {
	
	public abstract Trade getTradebyId(int id);
	
	public abstract Trade saveTrade(Trade trade);
	
	public abstract void deleteTradebyId(int id);
	
	public abstract Trade updateTrade(Trade trade);

}


