package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import java.math.BigInteger;

@Entity
@Table(name = "PROCESSLIST")
public class Processlist {
	@Column(name = "HOST")
	String host;

	@Column(name = "ID")
	BigInteger id;

	@Column(name = "TIME")
	int time;

	@Column(name = "STATE")
	String state;

	@Column(name = "USER")
	String user;

	@Column(name = "DB")
	String db;

	@Column(name = "COMMAND")
	String command;

	@Column(name = "INFO")
	String info;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getDb() {
		return db;
	}

	public void setDb(String db) {
		this.db = db;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

}