package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import java.math.BigInteger;

@Entity
@Table(name = "TABLESPACES")
public class Tablespaces {
	@Column(name = "EXTENT_SIZE")
	BigInteger extentSize;

	@Column(name = "TABLESPACE_TYPE")
	String tablespaceType;

	@Column(name = "LOGFILE_GROUP_NAME")
	String logfileGroupName;

	@Column(name = "NODEGROUP_ID")
	BigInteger nodegroupId;

	@Column(name = "ENGINE")
	String engine;

	@Column(name = "AUTOEXTEND_SIZE")
	BigInteger autoextendSize;

	@Column(name = "MAXIMUM_SIZE")
	BigInteger maximumSize;

	@Column(name = "TABLESPACE_COMMENT")
	String tablespaceComment;

	@Column(name = "TABLESPACE_NAME")
	String tablespaceName;

	public BigInteger getExtentSize() {
		return extentSize;
	}

	public void setExtentSize(BigInteger extentSize) {
		this.extentSize = extentSize;
	}

	public String getTablespaceType() {
		return tablespaceType;
	}

	public void setTablespaceType(String tablespaceType) {
		this.tablespaceType = tablespaceType;
	}

	public String getLogfileGroupName() {
		return logfileGroupName;
	}

	public void setLogfileGroupName(String logfileGroupName) {
		this.logfileGroupName = logfileGroupName;
	}

	public BigInteger getNodegroupId() {
		return nodegroupId;
	}

	public void setNodegroupId(BigInteger nodegroupId) {
		this.nodegroupId = nodegroupId;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public BigInteger getAutoextendSize() {
		return autoextendSize;
	}

	public void setAutoextendSize(BigInteger autoextendSize) {
		this.autoextendSize = autoextendSize;
	}

	public BigInteger getMaximumSize() {
		return maximumSize;
	}

	public void setMaximumSize(BigInteger maximumSize) {
		this.maximumSize = maximumSize;
	}

	public String getTablespaceComment() {
		return tablespaceComment;
	}

	public void setTablespaceComment(String tablespaceComment) {
		this.tablespaceComment = tablespaceComment;
	}

	public String getTablespaceName() {
		return tablespaceName;
	}

	public void setTablespaceName(String tablespaceName) {
		this.tablespaceName = tablespaceName;
	}

}