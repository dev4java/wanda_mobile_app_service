package iMobile.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "t_org")
public class t_org implements Serializable
{	
	@Id
	@Column(name = "MDP_GUID")
	private  String mdpGuid;
	
	@Column(name = "orgID")
	private Integer orgId;
	
	@Column(name = "orgName")
	private String orgName;
	
	@Column(name = "orgCode")
	private String orgCode;
	
	@Column(name = "orgCategory")
	private String orgCategory;
	
	@Column(name = "isRoot")
	private String isRoot;
	
	@Column(name = "officeTel")
	private String officeTel;
	
	@Column(name = "fax")
	private String fax;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "postcode")
	private String postcode;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "web")
	private String web;
	
	@Column(name = "introduction")
	private String introduction;
	
	@Column(name = "remark")
	private String remark;
	
	@Column(name = "operateTime")
	private Date operateTime;
	
	@Column(name = "orgOperator")
	private Double orgOperator;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "validDate")
	private Date validDate;

	public String getMdpGuid() {
		return mdpGuid;
	}

	public void setMdpGuid(String mdpGuid) {
		this.mdpGuid = mdpGuid;
	}

	public Integer getOrgId() {
		return orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getOrgCategory() {
		return orgCategory;
	}

	public void setOrgCategory(String orgCategory) {
		this.orgCategory = orgCategory;
	}

	public String getIsRoot() {
		return isRoot;
	}

	public void setIsRoot(String isRoot) {
		this.isRoot = isRoot;
	}

	public String getOfficeTel() {
		return officeTel;
	}

	public void setOfficeTel(String officeTel) {
		this.officeTel = officeTel;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getOperateTime() {
		return operateTime;
	}

	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}

	public Double getOrgOperator() {
		return orgOperator;
	}

	public void setOrgOperator(Double orgOperator) {
		this.orgOperator = orgOperator;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getValidDate() {
		return validDate;
	}

	public void setValidDate(Date validDate) {
		this.validDate = validDate;
	}
	
	
	
	
	
}
