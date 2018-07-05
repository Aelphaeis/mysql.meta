package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import java.math.BigInteger;

@Entity
@Table(name = "PARAMETERS")
public class Parameters {
	@Column(name = "DTD_IDENTIFIER")
	String dtdIdentifier;

	@Column(name = "NUMERIC_PRECISION")
	BigInteger numericPrecision;

	@Column(name = "CHARACTER_SET_NAME")
	String characterSetName;

	@Column(name = "DATA_TYPE")
	String dataType;

	@Column(name = "ROUTINE_TYPE")
	String routineType;

	@Column(name = "PARAMETER_NAME")
	String parameterName;

	@Column(name = "SPECIFIC_CATALOG")
	String specificCatalog;

	@Column(name = "ORDINAL_POSITION")
	int ordinalPosition;

	@Column(name = "DATETIME_PRECISION")
	BigInteger datetimePrecision;

	@Column(name = "CHARACTER_OCTET_LENGTH")
	int characterOctetLength;

	@Column(name = "PARAMETER_MODE")
	String parameterMode;

	@Column(name = "CHARACTER_MAXIMUM_LENGTH")
	int characterMaximumLength;

	@Column(name = "SPECIFIC_SCHEMA")
	String specificSchema;

	@Column(name = "SPECIFIC_NAME")
	String specificName;

	@Column(name = "NUMERIC_SCALE")
	int numericScale;

	@Column(name = "COLLATION_NAME")
	String collationName;

	public String getDtdIdentifier() {
		return dtdIdentifier;
	}

	public void setDtdIdentifier(String dtdIdentifier) {
		this.dtdIdentifier = dtdIdentifier;
	}

	public BigInteger getNumericPrecision() {
		return numericPrecision;
	}

	public void setNumericPrecision(BigInteger numericPrecision) {
		this.numericPrecision = numericPrecision;
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

	public String getRoutineType() {
		return routineType;
	}

	public void setRoutineType(String routineType) {
		this.routineType = routineType;
	}

	public String getParameterName() {
		return parameterName;
	}

	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}

	public String getSpecificCatalog() {
		return specificCatalog;
	}

	public void setSpecificCatalog(String specificCatalog) {
		this.specificCatalog = specificCatalog;
	}

	public int getOrdinalPosition() {
		return ordinalPosition;
	}

	public void setOrdinalPosition(int ordinalPosition) {
		this.ordinalPosition = ordinalPosition;
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

	public String getParameterMode() {
		return parameterMode;
	}

	public void setParameterMode(String parameterMode) {
		this.parameterMode = parameterMode;
	}

	public int getCharacterMaximumLength() {
		return characterMaximumLength;
	}

	public void setCharacterMaximumLength(int characterMaximumLength) {
		this.characterMaximumLength = characterMaximumLength;
	}

	public String getSpecificSchema() {
		return specificSchema;
	}

	public void setSpecificSchema(String specificSchema) {
		this.specificSchema = specificSchema;
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

	public String getCollationName() {
		return collationName;
	}

	public void setCollationName(String collationName) {
		this.collationName = collationName;
	}

}