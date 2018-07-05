package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;

@Entity
@Table(name = "COLUMN_PRIVILEGES")
public class ColumnPrivileges {
	@Column(name = "IS_GRANTABLE")
	String isGrantable;

	@Column(name = "GRANTEE")
	String grantee;

	@Column(name = "TABLE_CATALOG")
	String tableCatalog;

	@Column(name = "PRIVILEGE_TYPE")
	String privilegeType;

	@Column(name = "TABLE_SCHEMA")
	String tableSchema;

	@Column(name = "TABLE_NAME")
	String tableName;

	@Column(name = "COLUMN_NAME")
	String columnName;

	public String getIsGrantable() {
		return isGrantable;
	}

	public void setIsGrantable(String isGrantable) {
		this.isGrantable = isGrantable;
	}

	public String getGrantee() {
		return grantee;
	}

	public void setGrantee(String grantee) {
		this.grantee = grantee;
	}

	public String getTableCatalog() {
		return tableCatalog;
	}

	public void setTableCatalog(String tableCatalog) {
		this.tableCatalog = tableCatalog;
	}

	public String getPrivilegeType() {
		return privilegeType;
	}

	public void setPrivilegeType(String privilegeType) {
		this.privilegeType = privilegeType;
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