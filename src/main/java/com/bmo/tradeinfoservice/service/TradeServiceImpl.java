package com.bmo.tradeinfoservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmo.bmomodel.model.Trade;
import com.bmo.tradeinfoservice.exception.TradeAlreadyExistException;
import com.bmo.tradeinfoservice.exception.TradeNotFoundException;
import com.bmo.tradeinfoservice.repo.TradeRepo;

@Service
public class TradeServiceImpl implements TradeService {

	@Autowired
	private TradeRepo tradeRepo;
	
	@Override
	public Trade saveTrade(Trade trade) {

		Trade savedTrade = null;
		Integer id = trade.getTradeId();
		Optional<Trade> otrade = tradeRepo.findById(id);
		if (otrade.isPresent()) {
			throw new TradeAlreadyExistException("Trade Already Exist");
		} else {
			savedTrade = tradeRepo.save(trade);
		}
		return savedTrade;
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
	public void deleteTradebyId(int id) {

		Optional<Trade> oTrade = tradeRepo.findById(id);
		if (oTrade.isPresent()) {
			tradeRepo.delete(oTrade.get());
		} else {
			throw new TradeNotFoundException("Trade Not Found");
		}
	}

	@Override
	public Trade updateTrade(Trade newTrade) {

		Integer id = newTrade.getTradeId();
		Trade existingTrade = null;

		Optional<Trade> oTrade = tradeRepo.findById(id);
		if (oTrade.isPresent()) {

			existingTrade = oTrade.get();

			/*
			 * existingTrade.setBuyerFirstName(newTrade.getBuyerFirstName());
			 * existingTrade.setBuyerLastName(newTrade.getBuyerLastName());
			 * existingTrade.setSellerFirstName(newTrade.getSellerFirstName());
			 * existingTrade.setSellerLastName(newTrade.getSellerLastName());
			 */
			existingTrade.setQuantity(newTrade.getQuantity());
			tradeRepo.save(existingTrade);

		} else {
			throw new TradeNotFoundException("Trade Not Found");
		}
		return newTrade;
	}

}
