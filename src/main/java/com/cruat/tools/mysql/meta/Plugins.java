package com.cruat.tools.mysql.meta;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;

@Entity
@Table(name = "PLUGINS")
public class Plugins {
	@Column(name = "PLUGIN_VERSION")
	String pluginVersion;

	@Column(name = "PLUGIN_LIBRARY")
	String pluginLibrary;

	@Column(name = "PLUGIN_TYPE")
	String pluginType;

	@Column(name = "LOAD_OPTION")
	String loadOption;

	@Column(name = "PLUGIN_NAME")
	String pluginName;

	@Column(name = "PLUGIN_LIBRARY_VERSION")
	String pluginLibraryVersion;

	@Column(name = "PLUGIN_AUTHOR")
	String pluginAuthor;

	@Column(name = "PLUGIN_DESCRIPTION")
	String pluginDescription;

	@Column(name = "PLUGIN_TYPE_VERSION")
	String pluginTypeVersion;

	@Column(name = "PLUGIN_LICENSE")
	String pluginLicense;

	@Column(name = "PLUGIN_STATUS")
	String pluginStatus;

	public String getPluginVersion() {
		return pluginVersion;
	}

	public void setPluginVersion(String pluginVersion) {
		this.pluginVersion = pluginVersion;
	}

	public String getPluginLibrary() {
		return pluginLibrary;
	}

	public void setPluginLibrary(String pluginLibrary) {
		this.pluginLibrary = pluginLibrary;
	}

	public String getPluginType() {
		return pluginType;
	}

	public void setPluginType(String pluginType) {
		this.pluginType = pluginType;
	}

	public String getLoadOption() {
		return loadOption;
	}

	public void setLoadOption(String loadOption) {
		this.loadOption = loadOption;
	}

	public String getPluginName() {
		return pluginName;
	}

	public void setPluginName(String pluginName) {
		this.pluginName = pluginName;
	}

	public String getPluginLibraryVersion() {
		return pluginLibraryVersion;
	}

	public void setPluginLibraryVersion(String pluginLibraryVersion) {
		this.pluginLibraryVersion = pluginLibraryVersion;
	}

	public String getPluginAuthor() {
		return pluginAuthor;
	}

	public void setPluginAuthor(String pluginAuthor) {
		this.pluginAuthor = pluginAuthor;
	}

	public String getPluginDescription() {
		return pluginDescription;
	}

	public void setPluginDescription(String pluginDescription) {
		this.pluginDescription = pluginDescription;
	}

	public String getPluginTypeVersion() {
		return pluginTypeVersion;
	}

	public void setPluginTypeVersion(String pluginTypeVersion) {
		this.pluginTypeVersion = pluginTypeVersion;
	}

	public String getPluginLicense() {
		return pluginLicense;
	}

	public void setPluginLicense(String pluginLicense) {
		this.pluginLicense = pluginLicense;
	}

	public String getPluginStatus() {
		return pluginStatus;
	}

	public void setPluginStatus(String pluginStatus) {
		this.pluginStatus = pluginStatus;
	}

}