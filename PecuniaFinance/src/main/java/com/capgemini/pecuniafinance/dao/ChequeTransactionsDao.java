package com.capgemini.pecuniafinance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.pecuniafinance.model.Transactions;

@Repository
public interface ChequeTransactionsDao extends JpaRepository<Transactions, String> {

}
