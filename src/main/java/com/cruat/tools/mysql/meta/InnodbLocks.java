package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import java.math.BigInteger;

@Entity
@Table(name = "INNODB_LOCKS")
public class InnodbLocks {
	@Column(name = "LOCK_ID")
	String lockId;

	@Column(name = "LOCK_DATA")
	String lockData;

	@Column(name = "LOCK_MODE")
	String lockMode;

	@Column(name = "LOCK_PAGE")
	BigInteger lockPage;

	@Column(name = "LOCK_REC")
	BigInteger lockRec;

	@Column(name = "LOCK_TYPE")
	String lockType;

	@Column(name = "LOCK_TRX_ID")
	String lockTrxId;

	@Column(name = "LOCK_TABLE")
	String lockTable;

	@Column(name = "LOCK_SPACE")
	BigInteger lockSpace;

	@Column(name = "LOCK_INDEX")
	String lockIndex;

	public String getLockId() {
		return lockId;
	}

	public void setLockId(String lockId) {
		this.lockId = lockId;
	}

	public String getLockData() {
		return lockData;
	}

	public void setLockData(String lockData) {
		this.lockData = lockData;
	}

	public String getLockMode() {
		return lockMode;
	}

	public void setLockMode(String lockMode) {
		this.lockMode = lockMode;
	}

	public BigInteger getLockPage() {
		return lockPage;
	}

	public void setLockPage(BigInteger lockPage) {
		this.lockPage = lockPage;
	}

	public BigInteger getLockRec() {
		return lockRec;
	}

	public void setLockRec(BigInteger lockRec) {
		this.lockRec = lockRec;
	}

	public String getLockType() {
		return lockType;
	}

	public void setLockType(String lockType) {
		this.lockType = lockType;
	}

	public String getLockTrxId() {
		return lockTrxId;
	}

	public void setLockTrxId(String lockTrxId) {
		this.lockTrxId = lockTrxId;
	}

	public String getLockTable() {
		return lockTable;
	}

	public void setLockTable(String lockTable) {
		this.lockTable = lockTable;
	}

	public BigInteger getLockSpace() {
		return lockSpace;
	}

	public void setLockSpace(BigInteger lockSpace) {
		this.lockSpace = lockSpace;
	}

	public String getLockIndex() {
		return lockIndex;
	}

	public void setLockIndex(String lockIndex) {
		this.lockIndex = lockIndex;
	}

}