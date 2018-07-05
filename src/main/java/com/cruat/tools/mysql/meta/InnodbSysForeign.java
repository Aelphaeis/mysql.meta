package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;

@Entity
@Table(name = "INNODB_SYS_FOREIGN")
public class InnodbSysForeign {
	@Column(name = "FOR_NAME")
	String forName;

	@Column(name = "ID")
	String id;

	@Column(name = "REF_NAME")
	String refName;

	@Column(name = "TYPE")
	int type;

	@Column(name = "N_COLS")
	int nCols;

	public String getForName() {
		return forName;
	}

	public void setForName(String forName) {
		this.forName = forName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRefName() {
		return refName;
	}

	public void setRefName(String refName) {
		this.refName = refName;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getNCols() {
		return nCols;
	}

	public void setNCols(int nCols) {
		this.nCols = nCols;
	}

}