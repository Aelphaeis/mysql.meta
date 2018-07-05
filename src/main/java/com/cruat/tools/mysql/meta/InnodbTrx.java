package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "INNODB_TRX")
public class InnodbTrx {
	@Column(name = "TRX_AUTOCOMMIT_NON_LOCKING")
	int trxAutocommitNonLocking;

	@Column(name = "TRX_IS_READ_ONLY")
	int trxIsReadOnly;

	@Column(name = "TRX_ADAPTIVE_HASH_TIMEOUT")
	BigInteger trxAdaptiveHashTimeout;

	@Column(name = "TRX_ADAPTIVE_HASH_LATCHED")
	int trxAdaptiveHashLatched;

	@Column(name = "TRX_ROWS_LOCKED")
	BigInteger trxRowsLocked;

	@Column(name = "TRX_STATE")
	String trxState;

	@Column(name = "TRX_ROWS_MODIFIED")
	BigInteger trxRowsModified;

	@Column(name = "TRX_ISOLATION_LEVEL")
	String trxIsolationLevel;

	@Column(name = "TRX_ID")
	String trxId;

	@Column(name = "TRX_QUERY")
	String trxQuery;

	@Column(name = "TRX_TABLES_LOCKED")
	BigInteger trxTablesLocked;

	@Column(name = "TRX_REQUESTED_LOCK_ID")
	String trxRequestedLockId;

	@Column(name = "TRX_LAST_FOREIGN_KEY_ERROR")
	String trxLastForeignKeyError;

	@Column(name = "TRX_STARTED")
	Date trxStarted;

	@Column(name = "TRX_CONCURRENCY_TICKETS")
	BigInteger trxConcurrencyTickets;

	@Column(name = "TRX_MYSQL_THREAD_ID")
	BigInteger trxMysqlThreadId;

	@Column(name = "TRX_WEIGHT")
	BigInteger trxWeight;

	@Column(name = "TRX_LOCK_MEMORY_BYTES")
	BigInteger trxLockMemoryBytes;

	@Column(name = "TRX_FOREIGN_KEY_CHECKS")
	int trxForeignKeyChecks;

	@Column(name = "TRX_WAIT_STARTED")
	Date trxWaitStarted;

	@Column(name = "TRX_UNIQUE_CHECKS")
	int trxUniqueChecks;

	@Column(name = "TRX_TABLES_IN_USE")
	BigInteger trxTablesInUse;

	@Column(name = "TRX_LOCK_STRUCTS")
	BigInteger trxLockStructs;

	@Column(name = "TRX_OPERATION_STATE")
	String trxOperationState;

	public int getTrxAutocommitNonLocking() {
		return trxAutocommitNonLocking;
	}

	public void setTrxAutocommitNonLocking(int trxAutocommitNonLocking) {
		this.trxAutocommitNonLocking = trxAutocommitNonLocking;
	}

	public int getTrxIsReadOnly() {
		return trxIsReadOnly;
	}

	public void setTrxIsReadOnly(int trxIsReadOnly) {
		this.trxIsReadOnly = trxIsReadOnly;
	}

	public BigInteger getTrxAdaptiveHashTimeout() {
		return trxAdaptiveHashTimeout;
	}

	public void setTrxAdaptiveHashTimeout(BigInteger trxAdaptiveHashTimeout) {
		this.trxAdaptiveHashTimeout = trxAdaptiveHashTimeout;
	}

	public int getTrxAdaptiveHashLatched() {
		return trxAdaptiveHashLatched;
	}

	public void setTrxAdaptiveHashLatched(int trxAdaptiveHashLatched) {
		this.trxAdaptiveHashLatched = trxAdaptiveHashLatched;
	}

	public BigInteger getTrxRowsLocked() {
		return trxRowsLocked;
	}

	public void setTrxRowsLocked(BigInteger trxRowsLocked) {
		this.trxRowsLocked = trxRowsLocked;
	}

	public String getTrxState() {
		return trxState;
	}

	public void setTrxState(String trxState) {
		this.trxState = trxState;
	}

	public BigInteger getTrxRowsModified() {
		return trxRowsModified;
	}

	public void setTrxRowsModified(BigInteger trxRowsModified) {
		this.trxRowsModified = trxRowsModified;
	}

	public String getTrxIsolationLevel() {
		return trxIsolationLevel;
	}

	public void setTrxIsolationLevel(String trxIsolationLevel) {
		this.trxIsolationLevel = trxIsolationLevel;
	}

	public String getTrxId() {
		return trxId;
	}

	public void setTrxId(String trxId) {
		this.trxId = trxId;
	}

	public String getTrxQuery() {
		return trxQuery;
	}

	public void setTrxQuery(String trxQuery) {
		this.trxQuery = trxQuery;
	}

	public BigInteger getTrxTablesLocked() {
		return trxTablesLocked;
	}

	public void setTrxTablesLocked(BigInteger trxTablesLocked) {
		this.trxTablesLocked = trxTablesLocked;
	}

	public String getTrxRequestedLockId() {
		return trxRequestedLockId;
	}

	public void setTrxRequestedLockId(String trxRequestedLockId) {
		this.trxRequestedLockId = trxRequestedLockId;
	}

	public String getTrxLastForeignKeyError() {
		return trxLastForeignKeyError;
	}

	public void setTrxLastForeignKeyError(String trxLastForeignKeyError) {
		this.trxLastForeignKeyError = trxLastForeignKeyError;
	}

	public Date getTrxStarted() {
		return trxStarted;
	}

	public void setTrxStarted(Date trxStarted) {
		this.trxStarted = trxStarted;
	}

	public BigInteger getTrxConcurrencyTickets() {
		return trxConcurrencyTickets;
	}

	public void setTrxConcurrencyTickets(BigInteger trxConcurrencyTickets) {
		this.trxConcurrencyTickets = trxConcurrencyTickets;
	}

	public BigInteger getTrxMysqlThreadId() {
		return trxMysqlThreadId;
	}

	public void setTrxMysqlThreadId(BigInteger trxMysqlThreadId) {
		this.trxMysqlThreadId = trxMysqlThreadId;
	}

	public BigInteger getTrxWeight() {
		return trxWeight;
	}

	public void setTrxWeight(BigInteger trxWeight) {
		this.trxWeight = trxWeight;
	}

	public BigInteger getTrxLockMemoryBytes() {
		return trxLockMemoryBytes;
	}

	public void setTrxLockMemoryBytes(BigInteger trxLockMemoryBytes) {
		this.trxLockMemoryBytes = trxLockMemoryBytes;
	}

	public int getTrxForeignKeyChecks() {
		return trxForeignKeyChecks;
	}

	public void setTrxForeignKeyChecks(int trxForeignKeyChecks) {
		this.trxForeignKeyChecks = trxForeignKeyChecks;
	}

	public Date getTrxWaitStarted() {
		return trxWaitStarted;
	}

	public void setTrxWaitStarted(Date trxWaitStarted) {
		this.trxWaitStarted = trxWaitStarted;
	}

	public int getTrxUniqueChecks() {
		return trxUniqueChecks;
	}

	public void setTrxUniqueChecks(int trxUniqueChecks) {
		this.trxUniqueChecks = trxUniqueChecks;
	}

	public BigInteger getTrxTablesInUse() {
		return trxTablesInUse;
	}

	public void setTrxTablesInUse(BigInteger trxTablesInUse) {
		this.trxTablesInUse = trxTablesInUse;
	}

	public BigInteger getTrxLockStructs() {
		return trxLockStructs;
	}

	public void setTrxLockStructs(BigInteger trxLockStructs) {
		this.trxLockStructs = trxLockStructs;
	}

	public String getTrxOperationState() {
		return trxOperationState;
	}

	public void setTrxOperationState(String trxOperationState) {
		this.trxOperationState = trxOperationState;
	}

}