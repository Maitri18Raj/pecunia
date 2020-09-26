package com.capgemini.pecuniafinance.exceptions;

@SuppressWarnings("serial")
public class InsufficientBalance extends Exception {

	public InsufficientBalance(String errorMsg){
		super(errorMsg);
	}
}
