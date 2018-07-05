package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;

@Entity
@Table(name = "REFERENTIAL_CONSTRAINTS")
public class ReferentialConstraints {
	@Column(name = "REFERENCED_TABLE_NAME")
	String referencedTableName;

	@Column(name = "UNIQUE_CONSTRAINT_SCHEMA")
	String uniqueConstraintSchema;

	@Column(name = "CONSTRAINT_SCHEMA")
	String constraintSchema;

	@Column(name = "MATCH_OPTION")
	String matchOption;

	@Column(name = "UNIQUE_CONSTRAINT_CATALOG")
	String uniqueConstraintCatalog;

	@Column(name = "UNIQUE_CONSTRAINT_NAME")
	String uniqueConstraintName;

	@Column(name = "CONSTRAINT_NAME")
	String constraintName;

	@Column(name = "DELETE_RULE")
	String deleteRule;

	@Column(name = "CONSTRAINT_CATALOG")
	String constraintCatalog;

	@Column(name = "UPDATE_RULE")
	String updateRule;

	@Column(name = "TABLE_NAME")
	String tableName;

	public String getReferencedTableName() {
		return referencedTableName;
	}

	public void setReferencedTableName(String referencedTableName) {
		this.referencedTableName = referencedTableName;
	}

	public String getUniqueConstraintSchema() {
		return uniqueConstraintSchema;
	}

	public void setUniqueConstraintSchema(String uniqueConstraintSchema) {
		this.uniqueConstraintSchema = uniqueConstraintSchema;
	}

	public String getConstraintSchema() {
		return constraintSchema;
	}

	public void setConstraintSchema(String constraintSchema) {
		this.constraintSchema = constraintSchema;
	}

	public String getMatchOption() {
		return matchOption;
	}

	public void setMatchOption(String matchOption) {
		this.matchOption = matchOption;
	}

	public String getUniqueConstraintCatalog() {
		return uniqueConstraintCatalog;
	}

	public void setUniqueConstraintCatalog(String uniqueConstraintCatalog) {
		this.uniqueConstraintCatalog = uniqueConstraintCatalog;
	}

	public String getUniqueConstraintName() {
		return uniqueConstraintName;
	}

	public void setUniqueConstraintName(String uniqueConstraintName) {
		this.uniqueConstraintName = uniqueConstraintName;
	}

	public String getConstraintName() {
		return constraintName;
	}

	public void setConstraintName(String constraintName) {
		this.constraintName = constraintName;
	}

	public String getDeleteRule() {
		return deleteRule;
	}

	public void setDeleteRule(String deleteRule) {
		this.deleteRule = deleteRule;
	}

	public String getConstraintCatalog() {
		return constraintCatalog;
	}

	public void setConstraintCatalog(String constraintCatalog) {
		this.constraintCatalog = constraintCatalog;
	}

	public String getUpdateRule() {
		return updateRule;
	}

	public void setUpdateRule(String updateRule) {
		this.updateRule = updateRule;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

}