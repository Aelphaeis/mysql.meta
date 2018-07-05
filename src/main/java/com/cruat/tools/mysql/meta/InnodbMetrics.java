package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "INNODB_METRICS")
public class InnodbMetrics {
	@Column(name = "AVG_COUNT")
	double avgCount;

	@Column(name = "COUNT")
	BigInteger count;

	@Column(name = "SUBSYSTEM")
	String subsystem;

	@Column(name = "MAX_COUNT_RESET")
	BigInteger maxCountReset;

	@Column(name = "TYPE")
	String type;

	@Column(name = "MAX_COUNT")
	BigInteger maxCount;

	@Column(name = "COUNT_RESET")
	BigInteger countReset;

	@Column(name = "TIME_ELAPSED")
	BigInteger timeElapsed;

	@Column(name = "TIME_RESET")
	Date timeReset;

	@Column(name = "TIME_ENABLED")
	Date timeEnabled;

	@Column(name = "NAME")
	String name;

	@Column(name = "TIME_DISABLED")
	Date timeDisabled;

	@Column(name = "MIN_COUNT")
	BigInteger minCount;

	@Column(name = "COMMENT")
	String comment;

	@Column(name = "MIN_COUNT_RESET")
	BigInteger minCountReset;

	@Column(name = "AVG_COUNT_RESET")
	double avgCountReset;

	@Column(name = "STATUS")
	String status;

	public double getAvgCount() {
		return avgCount;
	}

	public void setAvgCount(double avgCount) {
		this.avgCount = avgCount;
	}

	public BigInteger getCount() {
		return count;
	}

	public void setCount(BigInteger count) {
		this.count = count;
	}

	public String getSubsystem() {
		return subsystem;
	}

	public void setSubsystem(String subsystem) {
		this.subsystem = subsystem;
	}

	public BigInteger getMaxCountReset() {
		return maxCountReset;
	}

	public void setMaxCountReset(BigInteger maxCountReset) {
		this.maxCountReset = maxCountReset;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BigInteger getMaxCount() {
		return maxCount;
	}

	public void setMaxCount(BigInteger maxCount) {
		this.maxCount = maxCount;
	}

	public BigInteger getCountReset() {
		return countReset;
	}

	public void setCountReset(BigInteger countReset) {
		this.countReset = countReset;
	}

	public BigInteger getTimeElapsed() {
		return timeElapsed;
	}

	public void setTimeElapsed(BigInteger timeElapsed) {
		this.timeElapsed = timeElapsed;
	}

	public Date getTimeReset() {
		return timeReset;
	}

	public void setTimeReset(Date timeReset) {
		this.timeReset = timeReset;
	}

	public Date getTimeEnabled() {
		return timeEnabled;
	}

	public void setTimeEnabled(Date timeEnabled) {
		this.timeEnabled = timeEnabled;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getTimeDisabled() {
		return timeDisabled;
	}

	public void setTimeDisabled(Date timeDisabled) {
		this.timeDisabled = timeDisabled;
	}

	public BigInteger getMinCount() {
		return minCount;
	}

	public void setMinCount(BigInteger minCount) {
		this.minCount = minCount;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public BigInteger getMinCountReset() {
		return minCountReset;
	}

	public void setMinCountReset(BigInteger minCountReset) {
		this.minCountReset = minCountReset;
	}

	public double getAvgCountReset() {
		return avgCountReset;
	}

	public void setAvgCountReset(double avgCountReset) {
		this.avgCountReset = avgCountReset;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}