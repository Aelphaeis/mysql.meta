package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;

@Entity
@Table(name = "OPTIMIZER_TRACE")
public class OptimizerTrace {
	@Column(name = "TRACE")
	String trace;

	@Column(name = "INSUFFICIENT_PRIVILEGES")
	int insufficientPrivileges;

	@Column(name = "QUERY")
	String query;

	@Column(name = "MISSING_BYTES_BEYOND_MAX_MEM_SIZE")
	int missingBytesBeyondMaxMemSize;

	public String getTrace() {
		return trace;
	}

	public void setTrace(String trace) {
		this.trace = trace;
	}

	public int getInsufficientPrivileges() {
		return insufficientPrivileges;
	}

	public void setInsufficientPrivileges(int insufficientPrivileges) {
		this.insufficientPrivileges = insufficientPrivileges;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public int getMissingBytesBeyondMaxMemSize() {
		return missingBytesBeyondMaxMemSize;
	}

	public void setMissingBytesBeyondMaxMemSize(int missingBytesBeyondMaxMemSize) {
		this.missingBytesBeyondMaxMemSize = missingBytesBeyondMaxMemSize;
	}

}