package models.entities;

import models.exeptions.WhithdrawExeption;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double whithDrawLimit;
	
	public Account() {
	}
	
	public Account(Integer number, String holder, Double balance, Double whithDrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.whithDrawLimit = whithDrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWhithDrawLimit() {
		return whithDrawLimit;
	}

	public void setWhithDrawLimit(Double whithDrawLimit) {
		this.whithDrawLimit = whithDrawLimit;
	}

	public void whithDraw(double amount) throws WhithdrawExeption {
		
		if (amount > whithDrawLimit) {
			throw new WhithdrawExeption("The amount exceeds withdraw limit");
		}else if (amount > balance) {
			throw new WhithdrawExeption("Not enouth balance");
		}else {
			balance -=  amount;
			System.out.println("New balance: " + String.format("%.2f", this.balance));
		}
		
		
		
		
	}
	
}
