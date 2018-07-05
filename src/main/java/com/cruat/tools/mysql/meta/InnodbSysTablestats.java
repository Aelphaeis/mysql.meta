package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import java.math.BigInteger;

@Entity
@Table(name = "INNODB_SYS_TABLESTATS")
public class InnodbSysTablestats {
	@Column(name = "OTHER_INDEX_SIZE")
	BigInteger otherIndexSize;

	@Column(name = "REF_COUNT")
	int refCount;

	@Column(name = "NUM_ROWS")
	BigInteger numRows;

	@Column(name = "AUTOINC")
	BigInteger autoinc;

	@Column(name = "MODIFIED_COUNTER")
	BigInteger modifiedCounter;

	@Column(name = "NAME")
	String name;

	@Column(name = "TABLE_ID")
	BigInteger tableId;

	@Column(name = "CLUST_INDEX_SIZE")
	BigInteger clustIndexSize;

	@Column(name = "STATS_INITIALIZED")
	String statsInitialized;

	public BigInteger getOtherIndexSize() {
		return otherIndexSize;
	}

	public void setOtherIndexSize(BigInteger otherIndexSize) {
		this.otherIndexSize = otherIndexSize;
	}

	public int getRefCount() {
		return refCount;
	}

	public void setRefCount(int refCount) {
		this.refCount = refCount;
	}

	public BigInteger getNumRows() {
		return numRows;
	}

	public void setNumRows(BigInteger numRows) {
		this.numRows = numRows;
	}

	public BigInteger getAutoinc() {
		return autoinc;
	}

	public void setAutoinc(BigInteger autoinc) {
		this.autoinc = autoinc;
	}

	public BigInteger getModifiedCounter() {
		return modifiedCounter;
	}

	public void setModifiedCounter(BigInteger modifiedCounter) {
		this.modifiedCounter = modifiedCounter;
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

	public BigInteger getClustIndexSize() {
		return clustIndexSize;
	}

	public void setClustIndexSize(BigInteger clustIndexSize) {
		this.clustIndexSize = clustIndexSize;
	}

	public String getStatsInitialized() {
		return statsInitialized;
	}

	public void setStatsInitialized(String statsInitialized) {
		this.statsInitialized = statsInitialized;
	}

}