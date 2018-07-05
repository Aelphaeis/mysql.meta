package com.cruat.tools.mysql.meta;

import javax.persistence.Table;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Column;

import java.io.Serializable;
import java.math.BigInteger;

@Entity
@Table(name = "KEY_COLUMN_USAGE")
@IdClass(value=KeyColumnUsage.KeyColumnUsageId.class)
public class KeyColumnUsage {
	@Column(name = "REFERENCED_TABLE_SCHEMA")
	String referencedTableSchema;

	@Column(name = "REFERENCED_TABLE_NAME")
	String referencedTableName;

	@Column(name = "REFERENCED_COLUMN_NAME")
	String referencedColumnName;

	@Column(name = "CONSTRAINT_SCHEMA")
	String constraintSchema;

	@Column(name = "TABLE_CATALOG")
	String tableCatalog;

	@Column(name = "POSITION_IN_UNIQUE_CONSTRAINT")
	BigInteger positionInUniqueConstraint;

	@Id
	@Column(name = "CONSTRAINT_NAME")
	String constraintName;

	@Column(name = "ORDINAL_POSITION")
	BigInteger ordinalPosition;

	@Column(name = "CONSTRAINT_CATALOG")
	String constraintCatalog;

	@Id
	@Column(name = "TABLE_SCHEMA")
	String tableSchema;

	@Id
	@Column(name = "TABLE_NAME")
	String tableName;

	@Column(name = "COLUMN_NAME")
	String columnName;

	public static class KeyColumnUsageId implements Serializable {
		private static final long serialVersionUID = 1L;
		String tableSchema;
		String tableName;
		String constraintName;
	}
	
	public String getReferencedTableSchema() {
		return referencedTableSchema;
	}

	public void setReferencedTableSchema(String referencedTableSchema) {
		this.referencedTableSchema = referencedTableSchema;
	}

	public String getReferencedTableName() {
		return referencedTableName;
	}

	public void setReferencedTableName(String referencedTableName) {
		this.referencedTableName = referencedTableName;
	}

	public String getReferencedColumnName() {
		return referencedColumnName;
	}

	public void setReferencedColumnName(String referencedColumnName) {
		this.referencedColumnName = referencedColumnName;
	}

	public String getConstraintSchema() {
		return constraintSchema;
	}

	public void setConstraintSchema(String constraintSchema) {
		this.constraintSchema = constraintSchema;
	}

	public String getTableCatalog() {
		return tableCatalog;
	}

	public void setTableCatalog(String tableCatalog) {
		this.tableCatalog = tableCatalog;
	}

	public BigInteger getPositionInUniqueConstraint() {
		return positionInUniqueConstraint;
	}

	public void setPositionInUniqueConstraint(BigInteger positionInUniqueConstraint) {
		this.positionInUniqueConstraint = positionInUniqueConstraint;
	}

	public String getConstraintName() {
		return constraintName;
	}

	public void setConstraintName(String constraintName) {
		this.constraintName = constraintName;
	}

	public BigInteger getOrdinalPosition() {
		return ordinalPosition;
	}

	public void setOrdinalPosition(BigInteger ordinalPosition) {
		this.ordinalPosition = ordinalPosition;
	}

	public String getConstraintCatalog() {
		return constraintCatalog;
	}

	public void setConstraintCatalog(String constraintCatalog) {
		this.constraintCatalog = constraintCatalog;
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

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

}