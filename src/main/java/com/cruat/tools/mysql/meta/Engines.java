package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;

@Entity
@Table(name = "ENGINES")
public class Engines {
	@Column(name = "ENGINE")
	String engine;

	@Column(name = "SAVEPOINTS")
	String savepoints;

	@Column(name = "XA")
	String xa;

	@Column(name = "COMMENT")
	String comment;

	@Column(name = "TRANSACTIONS")
	String transactions;

	@Column(name = "SUPPORT")
	String support;

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getSavepoints() {
		return savepoints;
	}

	public void setSavepoints(String savepoints) {
		this.savepoints = savepoints;
	}

	public String getXa() {
		return xa;
	}

	public void setXa(String xa) {
		this.xa = xa;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getTransactions() {
		return transactions;
	}

	public void setTransactions(String transactions) {
		this.transactions = transactions;
	}

	public String getSupport() {
		return support;
	}

	public void setSupport(String support) {
		this.support = support;
	}

}