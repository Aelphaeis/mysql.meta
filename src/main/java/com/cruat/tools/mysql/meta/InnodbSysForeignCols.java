package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;

@Entity
@Table(name = "INNODB_SYS_FOREIGN_COLS")
public class InnodbSysForeignCols {
	@Column(name = "FOR_COL_NAME")
	String forColName;

	@Column(name = "POS")
	int pos;

	@Column(name = "REF_COL_NAME")
	String refColName;

	@Column(name = "ID")
	String id;

	public String getForColName() {
		return forColName;
	}

	public void setForColName(String forColName) {
		this.forColName = forColName;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public String getRefColName() {
		return refColName;
	}

	public void setRefColName(String refColName) {
		this.refColName = refColName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}