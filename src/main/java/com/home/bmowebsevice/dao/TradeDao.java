package com.home.bmowebsevice.dao;

import com.home.bmowebsevice.model.Trade;

public interface TradeDao {

	public abstract Trade getTradebyId(int id);

	public abstract Trade saveTrade(Trade trade);

	public abstract Trade deleteTradebyId(int id);
	
	public abstract Trade updateTradebyId(int id);

}
