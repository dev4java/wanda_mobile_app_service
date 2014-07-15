package iMobile.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "ReportDevDemo")
public class ReportDevDemo implements Serializable
{	
	@Id
	@Column(name = "id")
	private  Long id;
	
	@Column(name = "demo_name")
	private String demoName;
	
	@Column(name = "demo_url")
	private String demoUrl;
	
	@Column(name = "demo_desc")
	private String demoDesc;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDemoName() {
		return demoName;
	}

	public void setDemoName(String demoName) {
		this.demoName = demoName;
	}

	public String getDemoUrl() {
		return demoUrl;
	}

	public void setDemoUrl(String demoUrl) {
		this.demoUrl = demoUrl;
	}

	public String getDemoDesc() {
		return demoDesc;
	}

	public void setDemoDesc(String demoDesc) {
		this.demoDesc = demoDesc;
	}

	

	
}
