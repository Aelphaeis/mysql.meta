package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import java.math.BigInteger;

@Entity
@Table(name = "COLLATIONS")
public class Collations {
	@Column(name = "IS_COMPILED")
	String isCompiled;

	@Column(name = "IS_DEFAULT")
	String isDefault;

	@Column(name = "SORTLEN")
	BigInteger sortlen;

	@Column(name = "CHARACTER_SET_NAME")
	String characterSetName;

	@Column(name = "ID")
	BigInteger id;

	@Column(name = "COLLATION_NAME")
	String collationName;

	public String getIsCompiled() {
		return isCompiled;
	}

	public void setIsCompiled(String isCompiled) {
		this.isCompiled = isCompiled;
	}

	public String getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(String isDefault) {
		this.isDefault = isDefault;
	}

	public BigInteger getSortlen() {
		return sortlen;
	}

	public void setSortlen(BigInteger sortlen) {
		this.sortlen = sortlen;
	}

	public String getCharacterSetName() {
		return characterSetName;
	}

	public void setCharacterSetName(String characterSetName) {
		this.characterSetName = characterSetName;
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getCollationName() {
		return collationName;
	}

	public void setCollationName(String collationName) {
		this.collationName = collationName;
	}

}