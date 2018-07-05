package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "FILES")
public class Files {
	@Column(name = "RECOVER_TIME")
	BigInteger recoverTime;

	@Column(name = "FULLTEXT_KEYS")
	String fulltextKeys;

	@Column(name = "MAX_DATA_LENGTH")
	BigInteger maxDataLength;

	@Column(name = "FILE_NAME")
	String fileName;

	@Column(name = "UPDATE_COUNT")
	BigInteger updateCount;

	@Column(name = "CREATION_TIME")
	Date creationTime;

	@Column(name = "DELETED_ROWS")
	BigInteger deletedRows;

	@Column(name = "TABLE_SCHEMA")
	String tableSchema;

	@Column(name = "TABLE_NAME")
	String tableName;

	@Column(name = "INDEX_LENGTH")
	BigInteger indexLength;

	@Column(name = "ENGINE")
	String engine;

	@Column(name = "ROW_FORMAT")
	String rowFormat;

	@Column(name = "EXTRA")
	String extra;

	@Column(name = "CHECKSUM")
	BigInteger checksum;

	@Column(name = "LOGFILE_GROUP_NUMBER")
	BigInteger logfileGroupNumber;

	@Column(name = "TABLESPACE_NAME")
	String tablespaceName;

	@Column(name = "EXTENT_SIZE")
	BigInteger extentSize;

	@Column(name = "LAST_ACCESS_TIME")
	Date lastAccessTime;

	@Column(name = "AVG_ROW_LENGTH")
	BigInteger avgRowLength;

	@Column(name = "INITIAL_SIZE")
	BigInteger initialSize;

	@Column(name = "DATA_LENGTH")
	BigInteger dataLength;

	@Column(name = "TOTAL_EXTENTS")
	BigInteger totalExtents;

	@Column(name = "DATA_FREE")
	BigInteger dataFree;

	@Column(name = "UPDATE_TIME")
	Date updateTime;

	@Column(name = "VERSION")
	BigInteger version;

	@Column(name = "FREE_EXTENTS")
	BigInteger freeExtents;

	@Column(name = "LOGFILE_GROUP_NAME")
	String logfileGroupName;

	@Column(name = "CHECK_TIME")
	Date checkTime;

	@Column(name = "CREATE_TIME")
	Date createTime;

	@Column(name = "AUTOEXTEND_SIZE")
	BigInteger autoextendSize;

	@Column(name = "MAXIMUM_SIZE")
	BigInteger maximumSize;

	@Column(name = "TABLE_CATALOG")
	String tableCatalog;

	@Column(name = "TRANSACTION_COUNTER")
	BigInteger transactionCounter;

	@Column(name = "FILE_TYPE")
	String fileType;

	@Column(name = "FILE_ID")
	BigInteger fileId;

	@Column(name = "LAST_UPDATE_TIME")
	Date lastUpdateTime;

	@Column(name = "TABLE_ROWS")
	BigInteger tableRows;

	@Column(name = "STATUS")
	String status;

	public BigInteger getRecoverTime() {
		return recoverTime;
	}

	public void setRecoverTime(BigInteger recoverTime) {
		this.recoverTime = recoverTime;
	}

	public String getFulltextKeys() {
		return fulltextKeys;
	}

	public void setFulltextKeys(String fulltextKeys) {
		this.fulltextKeys = fulltextKeys;
	}

	public BigInteger getMaxDataLength() {
		return maxDataLength;
	}

	public void setMaxDataLength(BigInteger maxDataLength) {
		this.maxDataLength = maxDataLength;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public BigInteger getUpdateCount() {
		return updateCount;
	}

	public void setUpdateCount(BigInteger updateCount) {
		this.updateCount = updateCount;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	public BigInteger getDeletedRows() {
		return deletedRows;
	}

	public void setDeletedRows(BigInteger deletedRows) {
		this.deletedRows = deletedRows;
	}

	public String getTableSchema() {
		return tableSchema;
	}

	public void setTableSchema(String tableSchema) {
		this.tableSchema = tableSchema;
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

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getRowFormat() {
		return rowFormat;
	}

	public void setRowFormat(String rowFormat) {
		this.rowFormat = rowFormat;
	}

	public String getExtra() {
		return extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}

	public BigInteger getChecksum() {
		return checksum;
	}

	public void setChecksum(BigInteger checksum) {
		this.checksum = checksum;
	}

	public BigInteger getLogfileGroupNumber() {
		return logfileGroupNumber;
	}

	public void setLogfileGroupNumber(BigInteger logfileGroupNumber) {
		this.logfileGroupNumber = logfileGroupNumber;
	}

	public String getTablespaceName() {
		return tablespaceName;
	}

	public void setTablespaceName(String tablespaceName) {
		this.tablespaceName = tablespaceName;
	}

	public BigInteger getExtentSize() {
		return extentSize;
	}

	public void setExtentSize(BigInteger extentSize) {
		this.extentSize = extentSize;
	}

	public Date getLastAccessTime() {
		return lastAccessTime;
	}

	public void setLastAccessTime(Date lastAccessTime) {
		this.lastAccessTime = lastAccessTime;
	}

	public BigInteger getAvgRowLength() {
		return avgRowLength;
	}

	public void setAvgRowLength(BigInteger avgRowLength) {
		this.avgRowLength = avgRowLength;
	}

	public BigInteger getInitialSize() {
		return initialSize;
	}

	public void setInitialSize(BigInteger initialSize) {
		this.initialSize = initialSize;
	}

	public BigInteger getDataLength() {
		return dataLength;
	}

	public void setDataLength(BigInteger dataLength) {
		this.dataLength = dataLength;
	}

	public BigInteger getTotalExtents() {
		return totalExtents;
	}

	public void setTotalExtents(BigInteger totalExtents) {
		this.totalExtents = totalExtents;
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

	public BigInteger getVersion() {
		return version;
	}

	public void setVersion(BigInteger version) {
		this.version = version;
	}

	public BigInteger getFreeExtents() {
		return freeExtents;
	}

	public void setFreeExtents(BigInteger freeExtents) {
		this.freeExtents = freeExtents;
	}

	public String getLogfileGroupName() {
		return logfileGroupName;
	}

	public void setLogfileGroupName(String logfileGroupName) {
		this.logfileGroupName = logfileGroupName;
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

	public String getTableCatalog() {
		return tableCatalog;
	}

	public void setTableCatalog(String tableCatalog) {
		this.tableCatalog = tableCatalog;
	}

	public BigInteger getTransactionCounter() {
		return transactionCounter;
	}

	public void setTransactionCounter(BigInteger transactionCounter) {
		this.transactionCounter = transactionCounter;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public BigInteger getFileId() {
		return fileId;
	}

	public void setFileId(BigInteger fileId) {
		this.fileId = fileId;
	}

	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public BigInteger getTableRows() {
		return tableRows;
	}

	public void setTableRows(BigInteger tableRows) {
		this.tableRows = tableRows;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}