package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import java.math.BigInteger;

@Entity
@Table(name = "INNODB_TEMP_TABLE_INFO")
public class InnodbTempTableInfo {
	@Column(name = "NAME")
	String name;

	@Column(name = "TABLE_ID")
	BigInteger tableId;

	@Column(name = "SPACE")
	int space;

	@Column(name = "PER_TABLE_TABLESPACE")
	String perTableTablespace;

	@Column(name = "IS_COMPRESSED")
	String isCompressed;

	@Column(name = "N_COLS")
	int nCols;

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

	public int getSpace() {
		return space;
	}

	public void setSpace(int space) {
		this.space = space;
	}

	public String getPerTableTablespace() {
		return perTableTablespace;
	}

	public void setPerTableTablespace(String perTableTablespace) {
		this.perTableTablespace = perTableTablespace;
	}

	public String getIsCompressed() {
		return isCompressed;
	}

	public void setIsCompressed(String isCompressed) {
		this.isCompressed = isCompressed;
	}

	public int getNCols() {
		return nCols;
	}

	public void setNCols(int nCols) {
		this.nCols = nCols;
	}

}