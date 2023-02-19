package com.bmo.tradeinfoservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bmo.bmomodel.model.Trade;

@Repository
public interface TradeRepo extends JpaRepository<Trade, Integer>{
	
	
}
