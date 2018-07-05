package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import java.util.Date;
import java.math.BigInteger;

@Entity
@Table(name = "TRIGGERS")
public class Triggers {
	@Column(name = "DEFINER")
	String definer;

	@Column(name = "EVENT_OBJECT_CATALOG")
	String eventObjectCatalog;

	@Column(name = "TRIGGER_CATALOG")
	String triggerCatalog;

	@Column(name = "TRIGGER_NAME")
	String triggerName;

	@Column(name = "CREATED")
	Date created;

	@Column(name = "DATABASE_COLLATION")
	String databaseCollation;

	@Column(name = "ACTION_REFERENCE_OLD_ROW")
	String actionReferenceOldRow;

	@Column(name = "SQL_MODE")
	String sqlMode;

	@Column(name = "EVENT_OBJECT_SCHEMA")
	String eventObjectSchema;

	@Column(name = "ACTION_REFERENCE_NEW_TABLE")
	String actionReferenceNewTable;

	@Column(name = "ACTION_REFERENCE_NEW_ROW")
	String actionReferenceNewRow;

	@Column(name = "ACTION_ORIENTATION")
	String actionOrientation;

	@Column(name = "ACTION_CONDITION")
	String actionCondition;

	@Column(name = "ACTION_REFERENCE_OLD_TABLE")
	String actionReferenceOldTable;

	@Column(name = "EVENT_OBJECT_TABLE")
	String eventObjectTable;

	@Column(name = "TRIGGER_SCHEMA")
	String triggerSchema;

	@Column(name = "ACTION_ORDER")
	BigInteger actionOrder;

	@Column(name = "ACTION_TIMING")
	String actionTiming;

	@Column(name = "ACTION_STATEMENT")
	String actionStatement;

	@Column(name = "COLLATION_CONNECTION")
	String collationConnection;

	@Column(name = "EVENT_MANIPULATION")
	String eventManipulation;

	@Column(name = "CHARACTER_SET_CLIENT")
	String characterSetClient;

	public String getDefiner() {
		return definer;
	}

	public void setDefiner(String definer) {
		this.definer = definer;
	}

	public String getEventObjectCatalog() {
		return eventObjectCatalog;
	}

	public void setEventObjectCatalog(String eventObjectCatalog) {
		this.eventObjectCatalog = eventObjectCatalog;
	}

	public String getTriggerCatalog() {
		return triggerCatalog;
	}

	public void setTriggerCatalog(String triggerCatalog) {
		this.triggerCatalog = triggerCatalog;
	}

	public String getTriggerName() {
		return triggerName;
	}

	public void setTriggerName(String triggerName) {
		this.triggerName = triggerName;
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

	public String getActionReferenceOldRow() {
		return actionReferenceOldRow;
	}

	public void setActionReferenceOldRow(String actionReferenceOldRow) {
		this.actionReferenceOldRow = actionReferenceOldRow;
	}

	public String getSqlMode() {
		return sqlMode;
	}

	public void setSqlMode(String sqlMode) {
		this.sqlMode = sqlMode;
	}

	public String getEventObjectSchema() {
		return eventObjectSchema;
	}

	public void setEventObjectSchema(String eventObjectSchema) {
		this.eventObjectSchema = eventObjectSchema;
	}

	public String getActionReferenceNewTable() {
		return actionReferenceNewTable;
	}

	public void setActionReferenceNewTable(String actionReferenceNewTable) {
		this.actionReferenceNewTable = actionReferenceNewTable;
	}

	public String getActionReferenceNewRow() {
		return actionReferenceNewRow;
	}

	public void setActionReferenceNewRow(String actionReferenceNewRow) {
		this.actionReferenceNewRow = actionReferenceNewRow;
	}

	public String getActionOrientation() {
		return actionOrientation;
	}

	public void setActionOrientation(String actionOrientation) {
		this.actionOrientation = actionOrientation;
	}

	public String getActionCondition() {
		return actionCondition;
	}

	public void setActionCondition(String actionCondition) {
		this.actionCondition = actionCondition;
	}

	public String getActionReferenceOldTable() {
		return actionReferenceOldTable;
	}

	public void setActionReferenceOldTable(String actionReferenceOldTable) {
		this.actionReferenceOldTable = actionReferenceOldTable;
	}

	public String getEventObjectTable() {
		return eventObjectTable;
	}

	public void setEventObjectTable(String eventObjectTable) {
		this.eventObjectTable = eventObjectTable;
	}

	public String getTriggerSchema() {
		return triggerSchema;
	}

	public void setTriggerSchema(String triggerSchema) {
		this.triggerSchema = triggerSchema;
	}

	public BigInteger getActionOrder() {
		return actionOrder;
	}

	public void setActionOrder(BigInteger actionOrder) {
		this.actionOrder = actionOrder;
	}

	public String getActionTiming() {
		return actionTiming;
	}

	public void setActionTiming(String actionTiming) {
		this.actionTiming = actionTiming;
	}

	public String getActionStatement() {
		return actionStatement;
	}

	public void setActionStatement(String actionStatement) {
		this.actionStatement = actionStatement;
	}

	public String getCollationConnection() {
		return collationConnection;
	}

	public void setCollationConnection(String collationConnection) {
		this.collationConnection = collationConnection;
	}

	public String getEventManipulation() {
		return eventManipulation;
	}

	public void setEventManipulation(String eventManipulation) {
		this.eventManipulation = eventManipulation;
	}

	public String getCharacterSetClient() {
		return characterSetClient;
	}

	public void setCharacterSetClient(String characterSetClient) {
		this.characterSetClient = characterSetClient;
	}

}