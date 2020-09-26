package com.capgemini.pecuniafinance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.pecuniafinance.model.SlipTransactions;

@Repository
public interface SlipTransactionsDao extends JpaRepository<SlipTransactions, String> {

}
