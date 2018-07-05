package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import java.math.BigInteger;

@Entity
@Table(name = "INNODB_SYS_INDEXES")
public class InnodbSysIndexes {
	@Column(name = "N_FIELDS")
	int nFields;

	@Column(name = "PAGE_NO")
	int pageNo;

	@Column(name = "NAME")
	String name;

	@Column(name = "INDEX_ID")
	BigInteger indexId;

	@Column(name = "TABLE_ID")
	BigInteger tableId;

	@Column(name = "TYPE")
	int type;

	@Column(name = "SPACE")
	int space;

	@Column(name = "MERGE_THRESHOLD")
	int mergeThreshold;

	public int getNFields() {
		return nFields;
	}

	public void setNFields(int nFields) {
		this.nFields = nFields;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigInteger getIndexId() {
		return indexId;
	}

	public void setIndexId(BigInteger indexId) {
		this.indexId = indexId;
	}

	public BigInteger getTableId() {
		return tableId;
	}

	public void setTableId(BigInteger tableId) {
		this.tableId = tableId;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getSpace() {
		return space;
	}

	public void setSpace(int space) {
		this.space = space;
	}

	public int getMergeThreshold() {
		return mergeThreshold;
	}

	public void setMergeThreshold(int mergeThreshold) {
		this.mergeThreshold = mergeThreshold;
	}

}