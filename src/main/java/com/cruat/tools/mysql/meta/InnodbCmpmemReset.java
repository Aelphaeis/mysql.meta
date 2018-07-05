package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import java.math.BigInteger;

@Entity
@Table(name = "INNODB_CMPMEM_RESET")
public class InnodbCmpmemReset {
	@Column(name = "RELOCATION_OPS")
	BigInteger relocationOps;

	@Column(name = "PAGES_FREE")
	int pagesFree;

	@Column(name = "BUFFER_POOL_INSTANCE")
	int bufferPoolInstance;

	@Column(name = "PAGE_SIZE")
	int pageSize;

	@Column(name = "PAGES_USED")
	int pagesUsed;

	@Column(name = "RELOCATION_TIME")
	int relocationTime;

	public BigInteger getRelocationOps() {
		return relocationOps;
	}

	public void setRelocationOps(BigInteger relocationOps) {
		this.relocationOps = relocationOps;
	}

	public int getPagesFree() {
		return pagesFree;
	}

	public void setPagesFree(int pagesFree) {
		this.pagesFree = pagesFree;
	}

	public int getBufferPoolInstance() {
		return bufferPoolInstance;
	}

	public void setBufferPoolInstance(int bufferPoolInstance) {
		this.bufferPoolInstance = bufferPoolInstance;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPagesUsed() {
		return pagesUsed;
	}

	public void setPagesUsed(int pagesUsed) {
		this.pagesUsed = pagesUsed;
	}

	public int getRelocationTime() {
		return relocationTime;
	}

	public void setRelocationTime(int relocationTime) {
		this.relocationTime = relocationTime;
	}

}