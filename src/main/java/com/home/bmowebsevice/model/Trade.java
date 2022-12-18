package com.home.bmowebsevice.model;


import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="MY_TRADE")
public class Trade {

	@Id
	private Integer tradeId;
	private String buyerFirstName;
	private String buyerLastName;
	private String sellerFirstName;
	private String sellerLastName;
	@Column(name="My_QUANTITY")
	private int quantity;
	
	public Trade() {
		// TODO Auto-generated constructor stub
	}
	
	public Trade(Integer tradeId, String buyerFirstName, String buyerLastName, String sellerFirstName,
			String sellerLastName, int quantity) {
		super();
		this.tradeId = tradeId;
		this.buyerFirstName = buyerFirstName;
		this.buyerLastName = buyerLastName;
		this.sellerFirstName = sellerFirstName;
		this.sellerLastName = sellerLastName;
		this.quantity = quantity;
	}



	public Integer getTradeId() {
		return tradeId;
	}
	public void setTradeId(Integer tradeId) {
		this.tradeId = tradeId;
	}
	public String getBuyerFirstName() {
		return buyerFirstName;
	}
	public void setBuyerFirstName(String buyerFirstName) {
		this.buyerFirstName = buyerFirstName;
	}
	public String getBuyerLastName() {
		return buyerLastName;
	}
	public void setBuyerLastName(String buyerLastName) {
		this.buyerLastName = buyerLastName;
	}
	public String getSellerFirstName() {
		return sellerFirstName;
	}
	public void setSellerFirstName(String sellerFirstName) {
		this.sellerFirstName = sellerFirstName;
	}
	public String getSellerLastName() {
		return sellerLastName;
	}
	public void setSellerLastName(String sellerLastName) {
		this.sellerLastName = sellerLastName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}	
}
