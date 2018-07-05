package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;

@Entity
@Table(name = "VIEWS")
public class Views {
	@Column(name = "DEFINER")
	String definer;

	@Column(name = "VIEW_DEFINITION")
	String viewDefinition;

	@Column(name = "IS_UPDATABLE")
	String isUpdatable;

	@Column(name = "SECURITY_TYPE")
	String securityType;

	@Column(name = "CHECK_OPTION")
	String checkOption;

	@Column(name = "TABLE_CATALOG")
	String tableCatalog;

	@Column(name = "COLLATION_CONNECTION")
	String collationConnection;

	@Column(name = "TABLE_SCHEMA")
	String tableSchema;

	@Column(name = "TABLE_NAME")
	String tableName;

	@Column(name = "CHARACTER_SET_CLIENT")
	String characterSetClient;

	public String getDefiner() {
		return definer;
	}

	public void setDefiner(String definer) {
		this.definer = definer;
	}

	public String getViewDefinition() {
		return viewDefinition;
	}

	public void setViewDefinition(String viewDefinition) {
		this.viewDefinition = viewDefinition;
	}

	public String getIsUpdatable() {
		return isUpdatable;
	}

	public void setIsUpdatable(String isUpdatable) {
		this.isUpdatable = isUpdatable;
	}

	public String getSecurityType() {
		return securityType;
	}

	public void setSecurityType(String securityType) {
		this.securityType = securityType;
	}

	public String getCheckOption() {
		return checkOption;
	}

	public void setCheckOption(String checkOption) {
		this.checkOption = checkOption;
	}

	public String getTableCatalog() {
		return tableCatalog;
	}

	public void setTableCatalog(String tableCatalog) {
		this.tableCatalog = tableCatalog;
	}

	public String getCollationConnection() {
		return collationConnection;
	}

	public void setCollationConnection(String collationConnection) {
		this.collationConnection = collationConnection;
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

	public String getCharacterSetClient() {
		return characterSetClient;
	}

	public void setCharacterSetClient(String characterSetClient) {
		this.characterSetClient = characterSetClient;
	}

}