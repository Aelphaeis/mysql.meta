package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;

@Entity
@Table(name = "INNODB_SYS_DATAFILES")
public class InnodbSysDatafiles {
	@Column(name = "PATH")
	String path;

	@Column(name = "SPACE")
	int space;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public int getSpace() {
		return space;
	}

	public void setSpace(int space) {
		this.space = space;
	}

}