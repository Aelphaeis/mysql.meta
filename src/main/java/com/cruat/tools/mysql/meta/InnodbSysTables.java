package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import java.math.BigInteger;

@Entity
@Table(name = "INNODB_SYS_TABLES")
public class InnodbSysTables {
	@Column(name = "ZIP_PAGE_SIZE")
	int zipPageSize;

	@Column(name = "FLAG")
	int flag;

	@Column(name = "SPACE_TYPE")
	String spaceType;

	@Column(name = "ROW_FORMAT")
	String rowFormat;

	@Column(name = "NAME")
	String name;

	@Column(name = "TABLE_ID")
	BigInteger tableId;

	@Column(name = "SPACE")
	int space;

	@Column(name = "FILE_FORMAT")
	String fileFormat;

	@Column(name = "N_COLS")
	int nCols;

	public int getZipPageSize() {
		return zipPageSize;
	}

	public void setZipPageSize(int zipPageSize) {
		this.zipPageSize = zipPageSize;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public String getSpaceType() {
		return spaceType;
	}

	public void setSpaceType(String spaceType) {
		this.spaceType = spaceType;
	}

	public String getRowFormat() {
		return rowFormat;
	}

	public void setRowFormat(String rowFormat) {
		this.rowFormat = rowFormat;
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

	public int getSpace() {
		return space;
	}

	public void setSpace(int space) {
		this.space = space;
	}

	public String getFileFormat() {
		return fileFormat;
	}

	public void setFileFormat(String fileFormat) {
		this.fileFormat = fileFormat;
	}

	public int getNCols() {
		return nCols;
	}

	public void setNCols(int nCols) {
		this.nCols = nCols;
	}

}