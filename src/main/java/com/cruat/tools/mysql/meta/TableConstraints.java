package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;

@Entity
@Table(name = "TABLE_CONSTRAINTS")
public class TableConstraints {
	@Column(name = "CONSTRAINT_TYPE")
	String constraintType;

	@Column(name = "CONSTRAINT_SCHEMA")
	String constraintSchema;

	@Column(name = "CONSTRAINT_NAME")
	String constraintName;

	@Column(name = "CONSTRAINT_CATALOG")
	String constraintCatalog;

	@Column(name = "TABLE_SCHEMA")
	String tableSchema;

	@Column(name = "TABLE_NAME")
	String tableName;

	public String getConstraintType() {
		return constraintType;
	}

	public void setConstraintType(String constraintType) {
		this.constraintType = constraintType;
	}

	public String getConstraintSchema() {
		return constraintSchema;
	}

	public void setConstraintSchema(String constraintSchema) {
		this.constraintSchema = constraintSchema;
	}

	public String getConstraintName() {
		return constraintName;
	}

	public void setConstraintName(String constraintName) {
		this.constraintName = constraintName;
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

}