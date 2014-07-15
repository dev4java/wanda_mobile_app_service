package iMobile.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "appclient")
public class appclient implements Serializable
{	
	@Id
	@Column(name = "id")
	private  String id;
	
	@Column(name = "lastversion")
	private String lastversion;
	
	@Column(name = "changelog")
	private String changelog;
	
	@Column(name = "url")
	private String url;
	
	@Column(name = "platform")
	private Integer platform;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLastversion() {
		return lastversion;
	}

	public void setLastversion(String lastversion) {
		this.lastversion = lastversion;
	}

	public String getChangelog() {
		return changelog;
	}

	public void setChangelog(String changelog) {
		this.changelog = changelog;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getPlatform() {
		return platform;
	}

	public void setPlatform(Integer platform) {
		this.platform = platform;
	}
	
	
	
}
