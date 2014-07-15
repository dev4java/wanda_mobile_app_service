package iMobile.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "AuthUser")
public class AuthUser implements Serializable
{	
	@Id
	@Column(name = "id")
	private  Long id;
	
	@Column(name = "rtxId")
	private String rtxId;
	
	@Column(name = "module_code")
	private String moduleCode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRtxId() {
		return rtxId;
	}

	public void setRtxId(String rtxId) {
		this.rtxId = rtxId;
	}

	public String getModuleCode() {
		return moduleCode;
	}

	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}
	
	
	
	
}
