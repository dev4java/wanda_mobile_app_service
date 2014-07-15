package iMobile.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "UserDeviceInfo")
public class UserDeviceInfo implements Serializable
{	
	@Id
	@Column(name = "id")
	private  Long id;
	
	@Column(name = "VID")
	private String vId;
	
	@Column(name = "device_udid")
	private String deviceUdid;
	
	@Column(name = "device_type")
	private Integer deviceType;
	
	@Column(name = "app_version")
	private String appVersion;
	
	@Column(name = "last_login_date")
	private Date lastLoginDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getvId() {
		return vId;
	}

	public void setvId(String vId) {
		this.vId = vId;
	}

	public String getDeviceUdid() {
		return deviceUdid;
	}

	public void setDeviceUdid(String deviceUdid) {
		this.deviceUdid = deviceUdid;
	}

	public Integer getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(Integer deviceType) {
		this.deviceType = deviceType;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	
	
	
}
