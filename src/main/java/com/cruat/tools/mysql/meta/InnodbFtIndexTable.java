package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import java.math.BigInteger;

@Entity
@Table(name = "INNODB_FT_INDEX_TABLE")
public class InnodbFtIndexTable {
	@Column(name = "DOC_ID")
	BigInteger docId;

	@Column(name = "FIRST_DOC_ID")
	BigInteger firstDocId;

	@Column(name = "DOC_COUNT")
	BigInteger docCount;

	@Column(name = "POSITION")
	BigInteger position;

	@Column(name = "LAST_DOC_ID")
	BigInteger lastDocId;

	@Column(name = "WORD")
	String word;

	public BigInteger getDocId() {
		return docId;
	}

	public void setDocId(BigInteger docId) {
		this.docId = docId;
	}

	public BigInteger getFirstDocId() {
		return firstDocId;
	}

	public void setFirstDocId(BigInteger firstDocId) {
		this.firstDocId = firstDocId;
	}

	public BigInteger getDocCount() {
		return docCount;
	}

	public void setDocCount(BigInteger docCount) {
		this.docCount = docCount;
	}

	public BigInteger getPosition() {
		return position;
	}

	public void setPosition(BigInteger position) {
		this.position = position;
	}

	public BigInteger getLastDocId() {
		return lastDocId;
	}

	public void setLastDocId(BigInteger lastDocId) {
		this.lastDocId = lastDocId;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

}