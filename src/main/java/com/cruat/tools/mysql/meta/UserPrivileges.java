package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;

@Entity
@Table(name = "USER_PRIVILEGES")
public class UserPrivileges {
	@Column(name = "IS_GRANTABLE")
	String isGrantable;

	@Column(name = "GRANTEE")
	String grantee;

	@Column(name = "TABLE_CATALOG")
	String tableCatalog;

	@Column(name = "PRIVILEGE_TYPE")
	String privilegeType;

	public String getIsGrantable() {
		return isGrantable;
	}

	public void setIsGrantable(String isGrantable) {
		this.isGrantable = isGrantable;
	}

	public String getGrantee() {
		return grantee;
	}

	public void setGrantee(String grantee) {
		this.grantee = grantee;
	}

	public String getTableCatalog() {
		return tableCatalog;
	}

	public void setTableCatalog(String tableCatalog) {
		this.tableCatalog = tableCatalog;
	}

	public String getPrivilegeType() {
		return privilegeType;
	}

	public void setPrivilegeType(String privilegeType) {
		this.privilegeType = privilegeType;
	}

}