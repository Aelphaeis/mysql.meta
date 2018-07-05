package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "PARTITIONS")
public class Partitions {
	@Column(name = "PARTITION_EXPRESSION")
	String partitionExpression;

	@Column(name = "MAX_DATA_LENGTH")
	BigInteger maxDataLength;

	@Column(name = "SUBPARTITION_ORDINAL_POSITION")
	BigInteger subpartitionOrdinalPosition;

	@Column(name = "TABLE_SCHEMA")
	String tableSchema;

	@Column(name = "SUBPARTITION_NAME")
	String subpartitionName;

	@Column(name = "PARTITION_ORDINAL_POSITION")
	BigInteger partitionOrdinalPosition;

	@Column(name = "NODEGROUP")
	String nodegroup;

	@Column(name = "TABLE_NAME")
	String tableName;

	@Column(name = "INDEX_LENGTH")
	BigInteger indexLength;

	@Column(name = "PARTITION_COMMENT")
	String partitionComment;

	@Column(name = "CHECKSUM")
	BigInteger checksum;

	@Column(name = "TABLESPACE_NAME")
	String tablespaceName;

	@Column(name = "AVG_ROW_LENGTH")
	BigInteger avgRowLength;

	@Column(name = "DATA_LENGTH")
	BigInteger dataLength;

	@Column(name = "SUBPARTITION_METHOD")
	String subpartitionMethod;

	@Column(name = "DATA_FREE")
	BigInteger dataFree;

	@Column(name = "UPDATE_TIME")
	Date updateTime;

	@Column(name = "PARTITION_METHOD")
	String partitionMethod;

	@Column(name = "SUBPARTITION_EXPRESSION")
	String subpartitionExpression;

	@Column(name = "PARTITION_NAME")
	String partitionName;

	@Column(name = "CHECK_TIME")
	Date checkTime;

	@Column(name = "CREATE_TIME")
	Date createTime;

	@Column(name = "TABLE_CATALOG")
	String tableCatalog;

	@Column(name = "PARTITION_DESCRIPTION")
	String partitionDescription;

	@Column(name = "TABLE_ROWS")
	BigInteger tableRows;

	public String getPartitionExpression() {
		return partitionExpression;
	}

	public void setPartitionExpression(String partitionExpression) {
		this.partitionExpression = partitionExpression;
	}

	public BigInteger getMaxDataLength() {
		return maxDataLength;
	}

	public void setMaxDataLength(BigInteger maxDataLength) {
		this.maxDataLength = maxDataLength;
	}

	public BigInteger getSubpartitionOrdinalPosition() {
		return subpartitionOrdinalPosition;
	}

	public void setSubpartitionOrdinalPosition(BigInteger subpartitionOrdinalPosition) {
		this.subpartitionOrdinalPosition = subpartitionOrdinalPosition;
	}

	public String getTableSchema() {
		return tableSchema;
	}

	public void setTableSchema(String tableSchema) {
		this.tableSchema = tableSchema;
	}

	public String getSubpartitionName() {
		return subpartitionName;
	}

	public void setSubpartitionName(String subpartitionName) {
		this.subpartitionName = subpartitionName;
	}

	public BigInteger getPartitionOrdinalPosition() {
		return partitionOrdinalPosition;
	}

	public void setPartitionOrdinalPosition(BigInteger partitionOrdinalPosition) {
		this.partitionOrdinalPosition = partitionOrdinalPosition;
	}

	public String getNodegroup() {
		return nodegroup;
	}

	public void setNodegroup(String nodegroup) {
		this.nodegroup = nodegroup;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public BigInteger getIndexLength() {
		return indexLength;
	}

	public void setIndexLength(BigInteger indexLength) {
		this.indexLength = indexLength;
	}

	public String getPartitionComment() {
		return partitionComment;
	}

	public void setPartitionComment(String partitionComment) {
		this.partitionComment = partitionComment;
	}

	public BigInteger getChecksum() {
		return checksum;
	}

	public void setChecksum(BigInteger checksum) {
		this.checksum = checksum;
	}

	public String getTablespaceName() {
		return tablespaceName;
	}

	public void setTablespaceName(String tablespaceName) {
		this.tablespaceName = tablespaceName;
	}

	public BigInteger getAvgRowLength() {
		return avgRowLength;
	}

	public void setAvgRowLength(BigInteger avgRowLength) {
		this.avgRowLength = avgRowLength;
	}

	public BigInteger getDataLength() {
		return dataLength;
	}

	public void setDataLength(BigInteger dataLength) {
		this.dataLength = dataLength;
	}

	public String getSubpartitionMethod() {
		return subpartitionMethod;
	}

	public void setSubpartitionMethod(String subpartitionMethod) {
		this.subpartitionMethod = subpartitionMethod;
	}

	public BigInteger getDataFree() {
		return dataFree;
	}

	public void setDataFree(BigInteger dataFree) {
		this.dataFree = dataFree;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getPartitionMethod() {
		return partitionMethod;
	}

	public void setPartitionMethod(String partitionMethod) {
		this.partitionMethod = partitionMethod;
	}

	public String getSubpartitionExpression() {
		return subpartitionExpression;
	}

	public void setSubpartitionExpression(String subpartitionExpression) {
		this.subpartitionExpression = subpartitionExpression;
	}

	public String getPartitionName() {
		return partitionName;
	}

	public void setPartitionName(String partitionName) {
		this.partitionName = partitionName;
	}

	public Date getCheckTime() {
		return checkTime;
	}

	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getTableCatalog() {
		return tableCatalog;
	}

	public void setTableCatalog(String tableCatalog) {
		this.tableCatalog = tableCatalog;
	}

	public String getPartitionDescription() {
		return partitionDescription;
	}

	public void setPartitionDescription(String partitionDescription) {
		this.partitionDescription = partitionDescription;
	}

	public BigInteger getTableRows() {
		return tableRows;
	}

	public void setTableRows(BigInteger tableRows) {
		this.tableRows = tableRows;
	}

}