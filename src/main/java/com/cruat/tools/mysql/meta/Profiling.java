package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import java.math.BigDecimal;

@Entity
@Table(name = "PROFILING")
public class Profiling {
	@Column(name = "BLOCK_OPS_IN")
	int blockOpsIn;

	@Column(name = "CPU_SYSTEM")
	BigDecimal cpuSystem;

	@Column(name = "PAGE_FAULTS_MINOR")
	int pageFaultsMinor;

	@Column(name = "CONTEXT_VOLUNTARY")
	int contextVoluntary;

	@Column(name = "MESSAGES_SENT")
	int messagesSent;

	@Column(name = "PAGE_FAULTS_MAJOR")
	int pageFaultsMajor;

	@Column(name = "SWAPS")
	int swaps;

	@Column(name = "SOURCE_FILE")
	String sourceFile;

	@Column(name = "QUERY_ID")
	int queryId;

	@Column(name = "DURATION")
	BigDecimal duration;

	@Column(name = "SOURCE_LINE")
	int sourceLine;

	@Column(name = "CPU_USER")
	BigDecimal cpuUser;

	@Column(name = "MESSAGES_RECEIVED")
	int messagesReceived;

	@Column(name = "CONTEXT_INVOLUNTARY")
	int contextInvoluntary;

	@Column(name = "SOURCE_FUNCTION")
	String sourceFunction;

	@Column(name = "STATE")
	String state;

	@Column(name = "BLOCK_OPS_OUT")
	int blockOpsOut;

	@Column(name = "SEQ")
	int seq;

	public int getBlockOpsIn() {
		return blockOpsIn;
	}

	public void setBlockOpsIn(int blockOpsIn) {
		this.blockOpsIn = blockOpsIn;
	}

	public BigDecimal getCpuSystem() {
		return cpuSystem;
	}

	public void setCpuSystem(BigDecimal cpuSystem) {
		this.cpuSystem = cpuSystem;
	}

	public int getPageFaultsMinor() {
		return pageFaultsMinor;
	}

	public void setPageFaultsMinor(int pageFaultsMinor) {
		this.pageFaultsMinor = pageFaultsMinor;
	}

	public int getContextVoluntary() {
		return contextVoluntary;
	}

	public void setContextVoluntary(int contextVoluntary) {
		this.contextVoluntary = contextVoluntary;
	}

	public int getMessagesSent() {
		return messagesSent;
	}

	public void setMessagesSent(int messagesSent) {
		this.messagesSent = messagesSent;
	}

	public int getPageFaultsMajor() {
		return pageFaultsMajor;
	}

	public void setPageFaultsMajor(int pageFaultsMajor) {
		this.pageFaultsMajor = pageFaultsMajor;
	}

	public int getSwaps() {
		return swaps;
	}

	public void setSwaps(int swaps) {
		this.swaps = swaps;
	}

	public String getSourceFile() {
		return sourceFile;
	}

	public void setSourceFile(String sourceFile) {
		this.sourceFile = sourceFile;
	}

	public int getQueryId() {
		return queryId;
	}

	public void setQueryId(int queryId) {
		this.queryId = queryId;
	}

	public BigDecimal getDuration() {
		return duration;
	}

	public void setDuration(BigDecimal duration) {
		this.duration = duration;
	}

	public int getSourceLine() {
		return sourceLine;
	}

	public void setSourceLine(int sourceLine) {
		this.sourceLine = sourceLine;
	}

	public BigDecimal getCpuUser() {
		return cpuUser;
	}

	public void setCpuUser(BigDecimal cpuUser) {
		this.cpuUser = cpuUser;
	}

	public int getMessagesReceived() {
		return messagesReceived;
	}

	public void setMessagesReceived(int messagesReceived) {
		this.messagesReceived = messagesReceived;
	}

	public int getContextInvoluntary() {
		return contextInvoluntary;
	}

	public void setContextInvoluntary(int contextInvoluntary) {
		this.contextInvoluntary = contextInvoluntary;
	}

	public String getSourceFunction() {
		return sourceFunction;
	}

	public void setSourceFunction(String sourceFunction) {
		this.sourceFunction = sourceFunction;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getBlockOpsOut() {
		return blockOpsOut;
	}

	public void setBlockOpsOut(int blockOpsOut) {
		this.blockOpsOut = blockOpsOut;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

}