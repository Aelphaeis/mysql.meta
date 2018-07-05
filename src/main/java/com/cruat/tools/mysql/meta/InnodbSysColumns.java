package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import java.math.BigInteger;

@Entity
@Table(name = "INNODB_SYS_COLUMNS")
public class InnodbSysColumns {
	@Column(name = "MTYPE")
	int mtype;

	@Column(name = "LEN")
	int len;

	@Column(name = "POS")
	BigInteger pos;

	@Column(name = "PRTYPE")
	int prtype;

	@Column(name = "NAME")
	String name;

	@Column(name = "TABLE_ID")
	BigInteger tableId;

	public int getMtype() {
		return mtype;
	}

	public void setMtype(int mtype) {
		this.mtype = mtype;
	}

	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = len;
	}

	public BigInteger getPos() {
		return pos;
	}

	public void setPos(BigInteger pos) {
		this.pos = pos;
	}

	public int getPrtype() {
		return prtype;
	}

	public void setPrtype(int prtype) {
		this.prtype = prtype;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigInteger getTableId() {
		return tableId;
	}

	public void setTableId(BigInteger tableId) {
		this.tableId = tableId;
	}

}