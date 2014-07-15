package iMobile.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "AppModuleType")
public class AppModuleType implements Serializable
{	
	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "type_code")
	private String typeCode;
	
	@Column(name = "type_name")
	private String typeName;
	
	@Column(name = "type_des")
	private String typeDes;
	
	@Column(name = "is_need_appr")
	private Integer isNeedAppr;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getTypeDes() {
		return typeDes;
	}

	public void setTypeDes(String typeDes) {
		this.typeDes = typeDes;
	}

	public Integer getIsNeedAppr() {
		return isNeedAppr;
	}

	public void setIsNeedAppr(Integer isNeedAppr) {
		this.isNeedAppr = isNeedAppr;
	}
	
	
	
}
