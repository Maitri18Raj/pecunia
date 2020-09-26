package com.capgemini.pecuniafinance.service;

import com.capgemini.pecuniafinance.model.Account;
import com.capgemini.pecuniafinance.model.ChequeTransactions;
import com.capgemini.pecuniafinance.model.SlipTransactions;

public interface TransactionService {

    String debitUsingSlip(SlipTransactions debit) ;
	

	String debitUsingCheque(ChequeTransactions debit);


	String creditUsingCheque(ChequeTransactions credit);


	String creditUsingSlip(SlipTransactions credit);
	
	
	String updateBalance(Account balance) ;


	Account getAccountbyID(long accountID);



	
}
