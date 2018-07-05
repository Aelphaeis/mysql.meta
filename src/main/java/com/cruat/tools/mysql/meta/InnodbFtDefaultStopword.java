package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;

@Entity
@Table(name = "INNODB_FT_DEFAULT_STOPWORD")
public class InnodbFtDefaultStopword {
	@Column(name = "VALUE")
	String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}