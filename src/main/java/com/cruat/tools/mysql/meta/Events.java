package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import java.util.Date;
import java.math.BigInteger;

@Entity
@Table(name = "EVENTS")
public class Events {
	@Column(name = "DEFINER")
	String definer;

	@Column(name = "ON_COMPLETION")
	String onCompletion;

	@Column(name = "EVENT_DEFINITION")
	String eventDefinition;

	@Column(name = "CREATED")
	Date created;

	@Column(name = "DATABASE_COLLATION")
	String databaseCollation;

	@Column(name = "SQL_MODE")
	String sqlMode;

	@Column(name = "TIME_ZONE")
	String timeZone;

	@Column(name = "EVENT_BODY")
	String eventBody;

	@Column(name = "EVENT_TYPE")
	String eventType;

	@Column(name = "ORIGINATOR")
	BigInteger originator;

	@Column(name = "EVENT_COMMENT")
	String eventComment;

	@Column(name = "INTERVAL_VALUE")
	String intervalValue;

	@Column(name = "EXECUTE_AT")
	Date executeAt;

	@Column(name = "INTERVAL_FIELD")
	String intervalField;

	@Column(name = "EVENT_SCHEMA")
	String eventSchema;

	@Column(name = "ENDS")
	Date ends;

	@Column(name = "LAST_ALTERED")
	Date lastAltered;

	@Column(name = "EVENT_NAME")
	String eventName;

	@Column(name = "STARTS")
	Date starts;

	@Column(name = "LAST_EXECUTED")
	Date lastExecuted;

	@Column(name = "EVENT_CATALOG")
	String eventCatalog;

	@Column(name = "COLLATION_CONNECTION")
	String collationConnection;

	@Column(name = "STATUS")
	String status;

	@Column(name = "CHARACTER_SET_CLIENT")
	String characterSetClient;

	public String getDefiner() {
		return definer;
	}

	public void setDefiner(String definer) {
		this.definer = definer;
	}

	public String getOnCompletion() {
		return onCompletion;
	}

	public void setOnCompletion(String onCompletion) {
		this.onCompletion = onCompletion;
	}

	public String getEventDefinition() {
		return eventDefinition;
	}

	public void setEventDefinition(String eventDefinition) {
		this.eventDefinition = eventDefinition;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getDatabaseCollation() {
		return databaseCollation;
	}

	public void setDatabaseCollation(String databaseCollation) {
		this.databaseCollation = databaseCollation;
	}

	public String getSqlMode() {
		return sqlMode;
	}

	public void setSqlMode(String sqlMode) {
		this.sqlMode = sqlMode;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public String getEventBody() {
		return eventBody;
	}

	public void setEventBody(String eventBody) {
		this.eventBody = eventBody;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public BigInteger getOriginator() {
		return originator;
	}

	public void setOriginator(BigInteger originator) {
		this.originator = originator;
	}

	public String getEventComment() {
		return eventComment;
	}

	public void setEventComment(String eventComment) {
		this.eventComment = eventComment;
	}

	public String getIntervalValue() {
		return intervalValue;
	}

	public void setIntervalValue(String intervalValue) {
		this.intervalValue = intervalValue;
	}

	public Date getExecuteAt() {
		return executeAt;
	}

	public void setExecuteAt(Date executeAt) {
		this.executeAt = executeAt;
	}

	public String getIntervalField() {
		return intervalField;
	}

	public void setIntervalField(String intervalField) {
		this.intervalField = intervalField;
	}

	public String getEventSchema() {
		return eventSchema;
	}

	public void setEventSchema(String eventSchema) {
		this.eventSchema = eventSchema;
	}

	public Date getEnds() {
		return ends;
	}

	public void setEnds(Date ends) {
		this.ends = ends;
	}

	public Date getLastAltered() {
		return lastAltered;
	}

	public void setLastAltered(Date lastAltered) {
		this.lastAltered = lastAltered;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public Date getStarts() {
		return starts;
	}

	public void setStarts(Date starts) {
		this.starts = starts;
	}

	public Date getLastExecuted() {
		return lastExecuted;
	}

	public void setLastExecuted(Date lastExecuted) {
		this.lastExecuted = lastExecuted;
	}

	public String getEventCatalog() {
		return eventCatalog;
	}

	public void setEventCatalog(String eventCatalog) {
		this.eventCatalog = eventCatalog;
	}

	public String getCollationConnection() {
		return collationConnection;
	}

	public void setCollationConnection(String collationConnection) {
		this.collationConnection = collationConnection;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCharacterSetClient() {
		return characterSetClient;
	}

	public void setCharacterSetClient(String characterSetClient) {
		this.characterSetClient = characterSetClient;
	}

}