package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;

@Entity
@Table(name = "INNODB_CMP_PER_INDEX")
public class InnodbCmpPerIndex {
	@Column(name = "DATABASE_NAME")
	String databaseName;

	@Column(name = "INDEX_NAME")
	String indexName;

	@Column(name = "COMPRESS_OPS_OK")
	int compressOpsOk;

	@Column(name = "UNCOMPRESS_OPS")
	int uncompressOps;

	@Column(name = "COMPRESS_TIME")
	int compressTime;

	@Column(name = "COMPRESS_OPS")
	int compressOps;

	@Column(name = "UNCOMPRESS_TIME")
	int uncompressTime;

	@Column(name = "TABLE_NAME")
	String tableName;

	public String getDatabaseName() {
		return databaseName;
	}

	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}

	public String getIndexName() {
		return indexName;
	}

	public void setIndexName(String indexName) {
		this.indexName = indexName;
	}

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

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

}