package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;

@Entity
@Table(name = "COLLATION_CHARACTER_SET_APPLICABILITY")
public class CollationCharacterSetApplicability {
	@Column(name = "CHARACTER_SET_NAME")
	String characterSetName;

	@Column(name = "COLLATION_NAME")
	String collationName;

	public String getCharacterSetName() {
		return characterSetName;
	}

	public void setCharacterSetName(String characterSetName) {
		this.characterSetName = characterSetName;
	}

	public String getCollationName() {
		return collationName;
	}

	public void setCollationName(String collationName) {
		this.collationName = collationName;
	}

}