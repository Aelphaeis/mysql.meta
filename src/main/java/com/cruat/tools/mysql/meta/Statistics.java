package com.cruat.tools.mysql.meta;

import javax.persistence.Table;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Column;

import java.io.Serializable;
import java.math.BigInteger;

@Entity
@Table(name = "STATISTICS")
@IdClass(Statistics.StatisticsId.class)
public class Statistics {
	@Column(name = "NULLABLE")
	String nullable;

	@Id
	@Column(name = "INDEX_NAME")
	String indexName;

	@Column(name = "INDEX_SCHEMA")
	String indexSchema;

	@Column(name = "SUB_PART")
	BigInteger subPart;

	@Id
	@Column(name = "TABLE_SCHEMA")
	String tableSchema;

	@Column(name = "CARDINALITY")
	BigInteger cardinality;

	@Id
	@Column(name = "TABLE_NAME")
	String tableName;

	@Column(name = "INDEX_COMMENT")
	String indexComment;

	@Column(name = "INDEX_TYPE")
	String indexType;

	@Id
	@Column(name = "SEQ_IN_INDEX")
	BigInteger seqInIndex;

	@Column(name = "TABLE_CATALOG")
	String tableCatalog;

	@Column(name = "COMMENT")
	String comment;

	@Column(name = "COLLATION")
	String collation;

	@Column(name = "PACKED")
	String packed;

	@Column(name = "NON_UNIQUE")
	BigInteger nonUnique;

	@Column(name = "COLUMN_NAME")
	String columnName;

	public static class StatisticsId implements Serializable {
		private static final long serialVersionUID = 1L;
		String tableSchema;
		String tableName;	
		String indexName;
		BigInteger seqInIndex;
	}
	
	public String getNullable() {
		return nullable;
	}

	public void setNullable(String nullable) {
		this.nullable = nullable;
	}

	public String getIndexName() {
		return indexName;
	}

	public void setIndexName(String indexName) {
		this.indexName = indexName;
	}

	public String getIndexSchema() {
		return indexSchema;
	}

	public void setIndexSchema(String indexSchema) {
		this.indexSchema = indexSchema;
	}

	public BigInteger getSubPart() {
		return subPart;
	}

	public void setSubPart(BigInteger subPart) {
		this.subPart = subPart;
	}

	public String getTableSchema() {
		return tableSchema;
	}

	public void setTableSchema(String tableSchema) {
		this.tableSchema = tableSchema;
	}

	public BigInteger getCardinality() {
		return cardinality;
	}

	public void setCardinality(BigInteger cardinality) {
		this.cardinality = cardinality;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getIndexComment() {
		return indexComment;
	}

	public void setIndexComment(String indexComment) {
		this.indexComment = indexComment;
	}

	public String getIndexType() {
		return indexType;
	}

	public void setIndexType(String indexType) {
		this.indexType = indexType;
	}

	public BigInteger getSeqInIndex() {
		return seqInIndex;
	}

	public void setSeqInIndex(BigInteger seqInIndex) {
		this.seqInIndex = seqInIndex;
	}

	public String getTableCatalog() {
		return tableCatalog;
	}

	public void setTableCatalog(String tableCatalog) {
		this.tableCatalog = tableCatalog;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getCollation() {
		return collation;
	}

	public void setCollation(String collation) {
		this.collation = collation;
	}

	public String getPacked() {
		return packed;
	}

	public void setPacked(String packed) {
		this.packed = packed;
	}

	public BigInteger getNonUnique() {
		return nonUnique;
	}

	public void setNonUnique(BigInteger nonUnique) {
		this.nonUnique = nonUnique;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

}