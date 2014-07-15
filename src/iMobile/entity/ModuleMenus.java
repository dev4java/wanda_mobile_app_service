package iMobile.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "ModuleMenus")
public class ModuleMenus implements Serializable
{	
	@Id
	@Column(name = "id")
	private  Long id;
	
	@Column(name = "service_res_id")
	private Integer serviceResId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "type")
	private Integer type;
	
	@Column(name = "url")
	private String url;
	
	@Column(name = "content")
	private String content;
	
	@Column(name = "pid")
	private Integer pId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getServiceResId() {
		return serviceResId;
	}

	public void setServiceResId(Integer serviceResId) {
		this.serviceResId = serviceResId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}
	
	
	
}
