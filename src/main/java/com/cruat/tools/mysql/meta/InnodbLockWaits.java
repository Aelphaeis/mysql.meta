package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;

@Entity
@Table(name = "INNODB_LOCK_WAITS")
public class InnodbLockWaits {
	@Column(name = "REQUESTED_LOCK_ID")
	String requestedLockId;

	@Column(name = "BLOCKING_TRX_ID")
	String blockingTrxId;

	@Column(name = "REQUESTING_TRX_ID")
	String requestingTrxId;

	@Column(name = "BLOCKING_LOCK_ID")
	String blockingLockId;

	public String getRequestedLockId() {
		return requestedLockId;
	}

	public void setRequestedLockId(String requestedLockId) {
		this.requestedLockId = requestedLockId;
	}

	public String getBlockingTrxId() {
		return blockingTrxId;
	}

	public void setBlockingTrxId(String blockingTrxId) {
		this.blockingTrxId = blockingTrxId;
	}

	public String getRequestingTrxId() {
		return requestingTrxId;
	}

	public void setRequestingTrxId(String requestingTrxId) {
		this.requestingTrxId = requestingTrxId;
	}

	public String getBlockingLockId() {
		return blockingLockId;
	}

	public void setBlockingLockId(String blockingLockId) {
		this.blockingLockId = blockingLockId;
	}

}