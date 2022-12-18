package com.home.bmowebsevice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.bmowebsevice.dao.TradeDao;
import com.home.bmowebsevice.model.Trade;

@Service
public class TradeServiceImpl implements TradeService {
	
	@Autowired
	private TradeDao tradeDao;

	@Override
	public Trade saveTrade(Trade trade) {
		
		Trade resultTrade = tradeDao.saveTrade(trade);
		return resultTrade;
	}

	@Override
	public Trade getTradebyId(int id) {
		
		Trade trade = tradeDao.getTradebyId(id);
		return trade;
	}


	@Override
	public Trade deleteTradebyId(int id) {
		
		Trade trade = tradeDao.getTradebyId(id);
		
		return trade;
	}

	@Override
	public Trade updateTradebyId(int id) {
	   Trade trade =tradeDao.updateTradebyId(id);
		return trade ;
	}


	
}

	