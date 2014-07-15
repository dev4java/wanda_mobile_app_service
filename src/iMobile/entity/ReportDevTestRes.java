package iMobile.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "ReportDevTestRes")
public class ReportDevTestRes implements Serializable
{	
	@Id
	@Column(name = "id")
	private  Long id;
	
	@Column(name = "employeeID")
	private String employeeID;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "index_url")
	private String indexUrl;
	
	@Column(name = "description")
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIndex_url() {
		return indexUrl;
	}

	public void setIndex_url(String index_url) {
		this.indexUrl = index_url;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
