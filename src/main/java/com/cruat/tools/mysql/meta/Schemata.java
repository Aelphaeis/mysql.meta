package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;

@Entity
@Table(name = "SCHEMATA")
public class Schemata {
	@Column(name = "CATALOG_NAME")
	String catalogName;

	@Column(name = "DEFAULT_COLLATION_NAME")
	String defaultCollationName;

	@Column(name = "SQL_PATH")
	String sqlPath;

	@Column(name = "DEFAULT_CHARACTER_SET_NAME")
	String defaultCharacterSetName;

	@Column(name = "SCHEMA_NAME")
	String schemaName;

	public String getCatalogName() {
		return catalogName;
	}

	public void setCatalogName(String catalogName) {
		this.catalogName = catalogName;
	}

	public String getDefaultCollationName() {
		return defaultCollationName;
	}

	public void setDefaultCollationName(String defaultCollationName) {
		this.defaultCollationName = defaultCollationName;
	}

	public String getSqlPath() {
		return sqlPath;
	}

	public void setSqlPath(String sqlPath) {
		this.sqlPath = sqlPath;
	}

	public String getDefaultCharacterSetName() {
		return defaultCharacterSetName;
	}

	public void setDefaultCharacterSetName(String defaultCharacterSetName) {
		this.defaultCharacterSetName = defaultCharacterSetName;
	}

	public String getSchemaName() {
		return schemaName;
	}

	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
	}

}