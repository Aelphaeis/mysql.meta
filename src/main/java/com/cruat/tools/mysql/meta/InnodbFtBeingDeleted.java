package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import java.math.BigInteger;

@Entity
@Table(name = "INNODB_FT_BEING_DELETED")
public class InnodbFtBeingDeleted {
	@Column(name = "DOC_ID")
	BigInteger docId;

	public BigInteger getDocId() {
		return docId;
	}

	public void setDocId(BigInteger docId) {
		this.docId = docId;
	}

}