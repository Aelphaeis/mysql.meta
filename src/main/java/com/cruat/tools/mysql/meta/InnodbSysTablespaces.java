package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import java.math.BigInteger;

@Entity
@Table(name = "INNODB_SYS_TABLESPACES")
public class InnodbSysTablespaces {
	@Column(name = "ZIP_PAGE_SIZE")
	int zipPageSize;

	@Column(name = "ALLOCATED_SIZE")
	BigInteger allocatedSize;

	@Column(name = "FLAG")
	int flag;

	@Column(name = "SPACE_TYPE")
	String spaceType;

	@Column(name = "FILE_SIZE")
	BigInteger fileSize;

	@Column(name = "ROW_FORMAT")
	String rowFormat;

	@Column(name = "NAME")
	String name;

	@Column(name = "PAGE_SIZE")
	int pageSize;

	@Column(name = "SPACE")
	int space;

	@Column(name = "FILE_FORMAT")
	String fileFormat;

	@Column(name = "FS_BLOCK_SIZE")
	int fsBlockSize;

	public int getZipPageSize() {
		return zipPageSize;
	}

	public void setZipPageSize(int zipPageSize) {
		this.zipPageSize = zipPageSize;
	}

	public BigInteger getAllocatedSize() {
		return allocatedSize;
	}

	public void setAllocatedSize(BigInteger allocatedSize) {
		this.allocatedSize = allocatedSize;
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

	public BigInteger getFileSize() {
		return fileSize;
	}

	public void setFileSize(BigInteger fileSize) {
		this.fileSize = fileSize;
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

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
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

	public int getFsBlockSize() {
		return fsBlockSize;
	}

	public void setFsBlockSize(int fsBlockSize) {
		this.fsBlockSize = fsBlockSize;
	}

}