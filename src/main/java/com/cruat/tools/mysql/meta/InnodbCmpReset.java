package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;

@Entity
@Table(name = "INNODB_CMP_RESET")
public class InnodbCmpReset {
	@Column(name = "COMPRESS_OPS_OK")
	int compressOpsOk;

	@Column(name = "UNCOMPRESS_OPS")
	int uncompressOps;

	@Column(name = "COMPRESS_TIME")
	int compressTime;

	@Column(name = "PAGE_SIZE")
	int pageSize;

	@Column(name = "COMPRESS_OPS")
	int compressOps;

	@Column(name = "UNCOMPRESS_TIME")
	int uncompressTime;

	public int getCompressOpsOk() {
		return compressOpsOk;
	}

	public void setCompressOpsOk(int compressOpsOk) {
		this.compressOpsOk = compressOpsOk;
	}

	public int getUncompressOps() {
		return uncompressOps;
	}

	public void setUncompressOps(int uncompressOps) {
		this.uncompressOps = uncompressOps;
	}

	public int getCompressTime() {
		return compressTime;
	}

	public void setCompressTime(int compressTime) {
		this.compressTime = compressTime;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getCompressOps() {
		return compressOps;
	}

	public void setCompressOps(int compressOps) {
		this.compressOps = compressOps;
	}

	public int getUncompressTime() {
		return uncompressTime;
	}

	public void setUncompressTime(int uncompressTime) {
		this.uncompressTime = uncompressTime;
	}

}