package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import java.math.BigInteger;

@Entity
@Table(name = "INNODB_SYS_FIELDS")
public class InnodbSysFields {
	@Column(name = "POS")
	int pos;

	@Column(name = "NAME")
	String name;

	@Column(name = "INDEX_ID")
	BigInteger indexId;

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigInteger getIndexId() {
		return indexId;
	}

	public void setIndexId(BigInteger indexId) {
		this.indexId = indexId;
	}

}