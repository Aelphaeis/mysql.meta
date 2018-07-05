package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import java.math.BigInteger;

@Entity
@Table(name = "CHARACTER_SETS")
public class CharacterSets {
	@Column(name = "CHARACTER_SET_NAME")
	String characterSetName;

	@Column(name = "DEFAULT_COLLATE_NAME")
	String defaultCollateName;

	@Column(name = "DESCRIPTION")
	String description;

	@Column(name = "MAXLEN")
	BigInteger maxlen;

	public String getCharacterSetName() {
		return characterSetName;
	}

	public void setCharacterSetName(String characterSetName) {
		this.characterSetName = characterSetName;
	}

	public String getDefaultCollateName() {
		return defaultCollateName;
	}

	public void setDefaultCollateName(String defaultCollateName) {
		this.defaultCollateName = defaultCollateName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigInteger getMaxlen() {
		return maxlen;
	}

	public void setMaxlen(BigInteger maxlen) {
		this.maxlen = maxlen;
	}

}