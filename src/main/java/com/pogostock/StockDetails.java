package com.pogostock;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stockDetails")
public class StockDetails {
	
	
	@Id
	@Column(name="custname")
	private String custname;
	@Column(name="custid")
	private String custid;
@Column(name="stockid")
	private String stockid;
	@Column(name="stockqty")
	private String stockqty;
@Column(name="rate")
	private String rate;
	
	
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	
	public String getStockid() {
		return stockid;
	}
	public void setStockid(String stockid) {
		this.stockid = stockid;
	}
	public String getStockqty() {
		return stockqty;
	}
	public void setStockqty(String stockqty) {
		this.stockqty = stockqty;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	
	
	

}
