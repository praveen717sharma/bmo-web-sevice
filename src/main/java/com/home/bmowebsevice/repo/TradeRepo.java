package com.home.bmowebsevice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.home.bmowebsevice.model.Trade;

@Repository
public interface TradeRepo extends JpaRepository<Trade, Integer>{

}
