package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import java.math.BigInteger;

@Entity
@Table(name = "INNODB_SYS_VIRTUAL")
public class InnodbSysVirtual {
	@Column(name = "POS")
	int pos;

	@Column(name = "TABLE_ID")
	BigInteger tableId;

	@Column(name = "BASE_POS")
	int basePos;

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public BigInteger getTableId() {
		return tableId;
	}

	public void setTableId(BigInteger tableId) {
		this.tableId = tableId;
	}

	public int getBasePos() {
		return basePos;
	}

	public void setBasePos(int basePos) {
		this.basePos = basePos;
	}

}