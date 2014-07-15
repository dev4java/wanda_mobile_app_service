package iMobile.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "SysApprover")
public class SysApprover implements Serializable
{	
	@Id
	@Column(name = "id")
	private  Long id;
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "module_type_code")
	private Integer moduleTypeCode;
	
	@Column(name = "employee_code")
	private String employeeCode;
	
	@Column(name = "is_has_next_level")
	private Integer isHasNextLevel;
	
	@Column(name = "level")
	private Integer level;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getModuleTypeCode() {
		return moduleTypeCode;
	}

	public void setModuleTypeCode(Integer moduleTypeCode) {
		this.moduleTypeCode = moduleTypeCode;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public Integer getIsHasNextLevel() {
		return isHasNextLevel;
	}

	public void setIsHasNextLevel(Integer isHasNextLevel) {
		this.isHasNextLevel = isHasNextLevel;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	
	
	
}
