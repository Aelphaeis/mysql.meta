package com.cruat.tools.mysql.meta;

import javax.persistence.Table;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.Column;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "TABLES")
@IdClass(Tables.TablesId.class)
public class Tables  {
	@Column(name = "MAX_DATA_LENGTH") 
	BigInteger maxDataLength;

	@Column(name = "AVG_ROW_LENGTH")
	BigInteger avgRowLength;

	@Column(name = "DATA_LENGTH")
	BigInteger dataLength;

	@Column(name = "AUTO_INCREMENT")
	BigInteger autoIncrement;

	@Column(name = "TABLE_COMMENT")
	String tableComment;

	@Column(name = "DATA_FREE")
	BigInteger dataFree;

	@Column(name = "UPDATE_TIME")
	Date updateTime;

	@Column(name = "VERSION")
	BigInteger version;

	@Id
	@Column(name = "TABLE_SCHEMA")
	String tableSchema;

	@Id
	@Column(name = "TABLE_NAME")
	String tableName;

	@Column(name = "CREATE_OPTIONS")
	String createOptions;

	@Column(name = "TABLE_TYPE")
	String tableType;

	@Column(name = "INDEX_LENGTH")
	BigInteger indexLength;

	@Column(name = "CHECK_TIME")
	Date checkTime;

	@Column(name = "ENGINE")
	String engine;

	@Column(name = "CREATE_TIME")
	Date createTime;

	@Column(name = "ROW_FORMAT")
	String rowFormat;

	@Column(name = "CHECKSUM")
	BigInteger checksum;

	@Column(name = "TABLE_CATALOG")
	String tableCatalog;

	@Column(name = "TABLE_COLLATION")
	String tableCollation;

	@Column(name = "TABLE_ROWS")
	BigInteger tableRows;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name = "TABLE_SCHEMA", referencedColumnName = "TABLE_SCHEMA"),
		@JoinColumn(name = "TABLE_NAME", referencedColumnName = "TABLE_NAME"),
	})
	List<Columns> columns;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name = "TABLE_SCHEMA", referencedColumnName = "TABLE_SCHEMA"),
		@JoinColumn(name = "TABLE_NAME", referencedColumnName = "TABLE_NAME"),
	})
	List<KeyColumnUsage> keyColumnUsage;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name = "REFERENCED_TABLE_SCHEMA", referencedColumnName = "TABLE_SCHEMA"),
		@JoinColumn(name = "REFERENCED_TABLE_NAME", referencedColumnName = "TABLE_NAME"),
	})
	List<KeyColumnUsage> referencingKeyColumnUsage;

	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name = "TABLE_SCHEMA", referencedColumnName = "TABLE_SCHEMA"),
		@JoinColumn(name = "TABLE_NAME", referencedColumnName = "TABLE_NAME"),
	})
	List<Statistics> statistics;

	
	public static class TablesId implements Serializable{
		private static final long serialVersionUID = 1L;
		String tableSchema;
		String tableName;
	}

	
	public BigInteger getMaxDataLength() {
		return maxDataLength;
	}

	public void setMaxDataLength(BigInteger maxDataLength) {
		this.maxDataLength = maxDataLength;
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

	public BigInteger getAutoIncrement() {
		return autoIncrement;
	}

	public void setAutoIncrement(BigInteger autoIncrement) {
		this.autoIncrement = autoIncrement;
	}

	public String getTableComment() {
		return tableComment;
	}

	public void setTableComment(String tableComment) {
		this.tableComment = tableComment;
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

	public String getCreateOptions() {
		return createOptions;
	}

	public void setCreateOptions(String createOptions) {
		this.createOptions = createOptions;
	}

	public String getTableType() {
		return tableType;
	}

	public void setTableType(String tableType) {
		this.tableType = tableType;
	}

	public BigInteger getIndexLength() {
		return indexLength;
	}

	public void setIndexLength(BigInteger indexLength) {
		this.indexLength = indexLength;
	}

	public Date getCheckTime() {
		return checkTime;
	}

	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getRowFormat() {
		return rowFormat;
	}

	public void setRowFormat(String rowFormat) {
		this.rowFormat = rowFormat;
	}

	public BigInteger getChecksum() {
		return checksum;
	}

	public void setChecksum(BigInteger checksum) {
		this.checksum = checksum;
	}

	public String getTableCatalog() {
		return tableCatalog;
	}

	public void setTableCatalog(String tableCatalog) {
		this.tableCatalog = tableCatalog;
	}

	public String getTableCollation() {
		return tableCollation;
	}

	public void setTableCollation(String tableCollation) {
		this.tableCollation = tableCollation;
	}

	public BigInteger getTableRows() {
		return tableRows;
	}

	public void setTableRows(BigInteger tableRows) {
		this.tableRows = tableRows;
	}

	public List<Columns> getColumns() {
		return columns;
	}

	public void setColumns(List<Columns> columns) {
		this.columns = columns;
	}

	public List<KeyColumnUsage> getKeyColumnUsage() {
		return keyColumnUsage;
	}

	public void setKeyColumnUsage(List<KeyColumnUsage> keyColumnUsage) {
		this.keyColumnUsage = keyColumnUsage;
	}

	public List<KeyColumnUsage> getReferencingKeyColumnUsage() {
		return referencingKeyColumnUsage;
	}

	public void setReferencingKeyColumnUsage(
			List<KeyColumnUsage> referencingKeyColumnUsage) {
		this.referencingKeyColumnUsage = referencingKeyColumnUsage;
	}

	public List<Statistics> getStatistics() {
		return statistics;
	}

	public void setStatistics(List<Statistics> statistics) {
		this.statistics = statistics;
	}
}