package com.capgemini.pecuniafinance.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Transactions") 
@SequenceGenerator(name="seq", initialValue=10000, allocationSize=1)
public class Transactions {

	@Id
	@Column(length=8)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	private int transId;
	@Column(length=8)
	private String transType;
	@Column(length=8)
	private Double transAmount;
	@Column(length = 20)
	private Date transDate;
	@Column(length=12)
	private long transFrom;
	@Column(length=12)
	private long transTo;
	@Column(length = 12)
	private long accountId;
	
	
	//getters and setters

	public String getTransType() {
		return transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}
	public Double getTransAmount() {
		return transAmount;
	}
	public void setTransAmount(Double transAmount) {
		this.transAmount = transAmount;
	}
	public Date getTransDate() {
		return transDate;
	}
	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}
	public long getTransFrom() {
		return transFrom;
	}
	public void setTransFrom(long transFrom) {
		this.transFrom = transFrom;
	}
	public long getTransTo() {
		return transTo;
	}
	public void setTransTo(long transTo) {
		this.transTo = transTo;
	}
	public int getTransId() {
		return transId;
	}

	public void setTransId(int transId) {
		this.transId = transId;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public Transactions() {
		super();	
	}
	
	
	
	
}
