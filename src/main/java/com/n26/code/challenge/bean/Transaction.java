package com.n26.code.challenge.bean;

public class Transaction {

	private Double amount = 0.0;
	private Long timestamp ;
	
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	
	
}
