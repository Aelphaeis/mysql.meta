package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "ROUTINES")
public class Routines {
	@Column(name = "DTD_IDENTIFIER")
	String dtdIdentifier;

	@Column(name = "DEFINER")
	String definer;

	@Column(name = "SQL_PATH")
	String sqlPath;

	@Column(name = "DATABASE_COLLATION")
	String databaseCollation;

	@Column(name = "ROUTINE_TYPE")
	String routineType;

	@Column(name = "SQL_MODE")
	String sqlMode;

	@Column(name = "DATETIME_PRECISION")
	BigInteger datetimePrecision;

	@Column(name = "CHARACTER_OCTET_LENGTH")
	int characterOctetLength;

	@Column(name = "IS_DETERMINISTIC")
	String isDeterministic;

	@Column(name = "EXTERNAL_LANGUAGE")
	String externalLanguage;

	@Column(name = "ROUTINE_BODY")
	String routineBody;

	@Column(name = "EXTERNAL_NAME")
	String externalName;

	@Column(name = "LAST_ALTERED")
	Date lastAltered;

	@Column(name = "ROUTINE_COMMENT")
	String routineComment;

	@Column(name = "COLLATION_CONNECTION")
	String collationConnection;

	@Column(name = "SQL_DATA_ACCESS")
	String sqlDataAccess;

	@Column(name = "ROUTINE_SCHEMA")
	String routineSchema;

	@Column(name = "COLLATION_NAME")
	String collationName;

	@Column(name = "NUMERIC_PRECISION")
	BigInteger numericPrecision;

	@Column(name = "ROUTINE_DEFINITION")
	String routineDefinition;

	@Column(name = "CHARACTER_SET_NAME")
	String characterSetName;

	@Column(name = "CREATED")
	Date created;

	@Column(name = "DATA_TYPE")
	String dataType;

	@Column(name = "PARAMETER_STYLE")
	String parameterStyle;

	@Column(name = "ROUTINE_CATALOG")
	String routineCatalog;

	@Column(name = "SECURITY_TYPE")
	String securityType;

	@Column(name = "ROUTINE_NAME")
	String routineName;

	@Column(name = "CHARACTER_MAXIMUM_LENGTH")
	int characterMaximumLength;

	@Column(name = "SPECIFIC_NAME")
	String specificName;

	@Column(name = "NUMERIC_SCALE")
	int numericScale;

	@Column(name = "CHARACTER_SET_CLIENT")
	String characterSetClient;

	public String getDtdIdentifier() {
		return dtdIdentifier;
	}

	public void setDtdIdentifier(String dtdIdentifier) {
		this.dtdIdentifier = dtdIdentifier;
	}

	public String getDefiner() {
		return definer;
	}

	public void setDefiner(String definer) {
		this.definer = definer;
	}

	public String getSqlPath() {
		return sqlPath;
	}

	public void setSqlPath(String sqlPath) {
		this.sqlPath = sqlPath;
	}

	public String getDatabaseCollation() {
		return databaseCollation;
	}

	public void setDatabaseCollation(String databaseCollation) {
		this.databaseCollation = databaseCollation;
	}

	public String getRoutineType() {
		return routineType;
	}

	public void setRoutineType(String routineType) {
		this.routineType = routineType;
	}

	public String getSqlMode() {
		return sqlMode;
	}

	public void setSqlMode(String sqlMode) {
		this.sqlMode = sqlMode;
	}

	public BigInteger getDatetimePrecision() {
		return datetimePrecision;
	}

	public void setDatetimePrecision(BigInteger datetimePrecision) {
		this.datetimePrecision = datetimePrecision;
	}

	public int getCharacterOctetLength() {
		return characterOctetLength;
	}

	public void setCharacterOctetLength(int characterOctetLength) {
		this.characterOctetLength = characterOctetLength;
	}

	public String getIsDeterministic() {
		return isDeterministic;
	}

	public void setIsDeterministic(String isDeterministic) {
		this.isDeterministic = isDeterministic;
	}

	public String getExternalLanguage() {
		return externalLanguage;
	}

	public void setExternalLanguage(String externalLanguage) {
		this.externalLanguage = externalLanguage;
	}

	public String getRoutineBody() {
		return routineBody;
	}

	public void setRoutineBody(String routineBody) {
		this.routineBody = routineBody;
	}

	public String getExternalName() {
		return externalName;
	}

	public void setExternalName(String externalName) {
		this.externalName = externalName;
	}

	public Date getLastAltered() {
		return lastAltered;
	}

	public void setLastAltered(Date lastAltered) {
		this.lastAltered = lastAltered;
	}

	public String getRoutineComment() {
		return routineComment;
	}

	public void setRoutineComment(String routineComment) {
		this.routineComment = routineComment;
	}

	public String getCollationConnection() {
		return collationConnection;
	}

	public void setCollationConnection(String collationConnection) {
		this.collationConnection = collationConnection;
	}

	public String getSqlDataAccess() {
		return sqlDataAccess;
	}

	public void setSqlDataAccess(String sqlDataAccess) {
		this.sqlDataAccess = sqlDataAccess;
	}

	public String getRoutineSchema() {
		return routineSchema;
	}

	public void setRoutineSchema(String routineSchema) {
		this.routineSchema = routineSchema;
	}

	public String getCollationName() {
		return collationName;
	}

	public void setCollationName(String collationName) {
		this.collationName = collationName;
	}

	public BigInteger getNumericPrecision() {
		return numericPrecision;
	}

	public void setNumericPrecision(BigInteger numericPrecision) {
		this.numericPrecision = numericPrecision;
	}

	public String getRoutineDefinition() {
		return routineDefinition;
	}

	public void setRoutineDefinition(String routineDefinition) {
		this.routineDefinition = routineDefinition;
	}

	public String getCharacterSetName() {
		return characterSetName;
	}

	public void setCharacterSetName(String characterSetName) {
		this.characterSetName = characterSetName;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getParameterStyle() {
		return parameterStyle;
	}

	public void setParameterStyle(String parameterStyle) {
		this.parameterStyle = parameterStyle;
	}

	public String getRoutineCatalog() {
		return routineCatalog;
	}

	public void setRoutineCatalog(String routineCatalog) {
		this.routineCatalog = routineCatalog;
	}

	public String getSecurityType() {
		return securityType;
	}

	public void setSecurityType(String securityType) {
		this.securityType = securityType;
	}

	public String getRoutineName() {
		return routineName;
	}

	public void setRoutineName(String routineName) {
		this.routineName = routineName;
	}

	public int getCharacterMaximumLength() {
		return characterMaximumLength;
	}

	public void setCharacterMaximumLength(int characterMaximumLength) {
		this.characterMaximumLength = characterMaximumLength;
	}

	public String getSpecificName() {
		return specificName;
	}

	public void setSpecificName(String specificName) {
		this.specificName = specificName;
	}

	public int getNumericScale() {
		return numericScale;
	}

	public void setNumericScale(int numericScale) {
		this.numericScale = numericScale;
	}

	public String getCharacterSetClient() {
		return characterSetClient;
	}

	public void setCharacterSetClient(String characterSetClient) {
		this.characterSetClient = characterSetClient;
	}

}