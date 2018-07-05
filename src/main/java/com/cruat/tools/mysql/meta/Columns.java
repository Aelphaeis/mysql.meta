package com.cruat.tools.mysql.meta;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "COLUMNS")
@IdClass(Columns.ColumnsId.class)
public class Columns {
	@Column(name = "NUMERIC_PRECISION")
	BigInteger numericPrecision;

	@Column(name = "PRIVILEGES")
	String privileges;

	@Column(name = "COLUMN_DEFAULT")
	String columnDefault;

	@Column(name = "CHARACTER_SET_NAME")
	String characterSetName;

	@Column(name = "DATA_TYPE")
	String dataType;

	@Column(name = "GENERATION_EXPRESSION")
	String generationExpression;

	@Column(name = "COLUMN_COMMENT")
	String columnComment;

	@Column(name = "ORDINAL_POSITION")
	BigInteger ordinalPosition;

	@Id
	@Column(name = "TABLE_SCHEMA")
	String tableSchema;

	@Column(name = "DATETIME_PRECISION")
	BigInteger datetimePrecision;

	@Id
	@Column(name = "TABLE_NAME")
	String tableName;

	@Column(name = "CHARACTER_OCTET_LENGTH")
	BigInteger characterOctetLength;

	@Column(name = "COLUMN_TYPE")
	String columnType;

	@Column(name = "IS_NULLABLE")
	String isNullable;

	@Column(name = "EXTRA")
	String extra;

	@Column(name = "CHARACTER_MAXIMUM_LENGTH")
	BigInteger characterMaximumLength;

	@Column(name = "TABLE_CATALOG")
	String tableCatalog;

	@Column(name = "COLUMN_KEY")
	String columnKey;

	@Column(name = "NUMERIC_SCALE")
	BigInteger numericScale;

	@Id
	@Column(name = "COLUMN_NAME")
	String columnName;

	@Column(name = "COLLATION_NAME")
	String collationName;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "TABLE_SCHEMA", referencedColumnName = "TABLE_SCHEMA"),
			@JoinColumn(name = "TABLE_NAME", referencedColumnName = "TABLE_NAME"),
			@JoinColumn(name = "COLUMN_NAME", referencedColumnName = "COLUMN_NAME")})
	List<Statistics> statistics;

	public static class ColumnsId implements Serializable {
		private static final long serialVersionUID = 1L;
		String tableSchema;
		String tableName;
		String columnName;
	}

	public BigInteger getNumericPrecision() {
		return numericPrecision;
	}

	public void setNumericPrecision(BigInteger numericPrecision) {
		this.numericPrecision = numericPrecision;
	}

	public String getPrivileges() {
		return privileges;
	}

	public void setPrivileges(String privileges) {
		this.privileges = privileges;
	}

	public String getColumnDefault() {
		return columnDefault;
	}

	public void setColumnDefault(String columnDefault) {
		this.columnDefault = columnDefault;
	}

	public String getCharacterSetName() {
		return characterSetName;
	}

	public void setCharacterSetName(String characterSetName) {
		this.characterSetName = characterSetName;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getGenerationExpression() {
		return generationExpression;
	}

	public void setGenerationExpression(String generationExpression) {
		this.generationExpression = generationExpression;
	}

	public String getColumnComment() {
		return columnComment;
	}

	public void setColumnComment(String columnComment) {
		this.columnComment = columnComment;
	}

	public BigInteger getOrdinalPosition() {
		return ordinalPosition;
	}

	public void setOrdinalPosition(BigInteger ordinalPosition) {
		this.ordinalPosition = ordinalPosition;
	}

	public String getTableSchema() {
		return tableSchema;
	}

	public void setTableSchema(String tableSchema) {
		this.tableSchema = tableSchema;
	}

	public BigInteger getDatetimePrecision() {
		return datetimePrecision;
	}

	public void setDatetimePrecision(BigInteger datetimePrecision) {
		this.datetimePrecision = datetimePrecision;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public BigInteger getCharacterOctetLength() {
		return characterOctetLength;
	}

	public void setCharacterOctetLength(BigInteger characterOctetLength) {
		this.characterOctetLength = characterOctetLength;
	}

	public String getColumnType() {
		return columnType;
	}

	public void setColumnType(String columnType) {
		this.columnType = columnType;
	}

	public String getIsNullable() {
		return isNullable;
	}

	public void setIsNullable(String isNullable) {
		this.isNullable = isNullable;
	}

	public String getExtra() {
		return extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}

	public BigInteger getCharacterMaximumLength() {
		return characterMaximumLength;
	}

	public void setCharacterMaximumLength(BigInteger characterMaximumLength) {
		this.characterMaximumLength = characterMaximumLength;
	}

	public String getTableCatalog() {
		return tableCatalog;
	}

	public void setTableCatalog(String tableCatalog) {
		this.tableCatalog = tableCatalog;
	}

	public String getColumnKey() {
		return columnKey;
	}

	public void setColumnKey(String columnKey) {
		this.columnKey = columnKey;
	}

	public BigInteger getNumericScale() {
		return numericScale;
	}

	public void setNumericScale(BigInteger numericScale) {
		this.numericScale = numericScale;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getCollationName() {
		return collationName;
	}

	public void setCollationName(String collationName) {
		this.collationName = collationName;
	}

	public List<Statistics> getStatistics() {
		return statistics;
	}

	public void setStatistics(List<Statistics> statistics) {
		this.statistics = statistics;
	}
}