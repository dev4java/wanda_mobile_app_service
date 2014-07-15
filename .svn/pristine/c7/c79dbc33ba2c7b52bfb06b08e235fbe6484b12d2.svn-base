package iMobile.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "ApprDetail")
public class ApprDetail implements Serializable
{	
	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "appr_code")
	private String apprCode;
	
	@Column(name = "employee_code")
	private String employeeCode;
	
	@Column(name = "is_pass")
	private Integer isPass;
	
	@Column(name = "remark")
	private String remark;

	
	@Column(name = "appr_time")
	private Date apprTime;


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


	public String getApprCode() {
		return apprCode;
	}


	public void setApprCode(String apprCode) {
		this.apprCode = apprCode;
	}


	public String getEmployeeCode() {
		return employeeCode;
	}


	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}


	public Integer getIsPass() {
		return isPass;
	}


	public void setIsPass(Integer isPass) {
		this.isPass = isPass;
	}


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
	}


	public Date getApprTime() {
		return apprTime;
	}


	public void setApprTime(Date apprTime) {
		this.apprTime = apprTime;
	}

	
}
