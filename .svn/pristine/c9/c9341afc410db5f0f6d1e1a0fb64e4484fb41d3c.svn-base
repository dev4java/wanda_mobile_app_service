
package iMobile.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "TB_SYSUSER")
public class SysUser implements Serializable
{
	/**
     * 
     */
	private static final long	serialVersionUID	= -6548270095708873642L;
	
	@Id
	@Column(name = "id")
	private Long				id;
	
	@Column(name = "username")
	@Pattern(regexp = "w{6,30}")
	private String				username;
	
	@Column(name = "password")
	private String				password;
	
	// @Column(name = "name")
	private String				name;
	
	// @Column(name = "telephone")
	private String				telephone;
	
	// @Column(name = "mobile")
	private String				mobile;
	
	// @Column(name = "qq")
	private String				qq;
	
	// @Column(name = "email")
	private String				email;
	
	// @Column(name = "status")
	private Integer				status				= 0;
	
	@Column(name = "ctime")
	@Temporal(TemporalType.TIMESTAMP)
	private Date				createTime			= new Date();
	
	// @Column(name = "role_id")
	private Long				roleId;
	
	// @Column(name = "login_ip")
	private String				loginIp;
	
	// @Column(name = "login_time")
	private Date				loginTime;
	
	// @Column(name = "order_no")
	private Integer				orderNo				= 0;
	
	// @Column(name = "is_del")
	private Integer				isDel				= 0;
	
	// @Column(name = "is_online")
	private Integer				isOnline			= 0;
	
	public Long getId()
	{
		return id;
	}
	
	public void setId(Long id)
	{
		this.id = id;
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getTelephone()
	{
		return telephone;
	}
	
	public void setTelephone(String telephone)
	{
		this.telephone = telephone;
	}
	
	public String getMobile()
	{
		return mobile;
	}
	
	public void setMobile(String mobile)
	{
		this.mobile = mobile;
	}
	
	public String getQq()
	{
		return qq;
	}
	
	public void setQq(String qq)
	{
		this.qq = qq;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public Integer getStatus()
	{
		return status;
	}
	
	public void setStatus(Integer status)
	{
		this.status = status;
	}
	
	public Date getCreateTime()
	{
		return createTime;
	}
	
	public void setCreateTime(Date createTime)
	{
		this.createTime = createTime;
	}
	
	public Long getRoleId()
	{
		return roleId;
	}
	
	public void setRoleId(Long roleId)
	{
		this.roleId = roleId;
	}
	
	public String getLoginIp()
	{
		return loginIp;
	}
	
	public void setLoginIp(String loginIp)
	{
		this.loginIp = loginIp;
	}
	
	public Date getLoginTime()
	{
		return loginTime;
	}
	
	public void setLoginTime(Date loginTime)
	{
		
		this.loginTime = loginTime;
	}
	
	public Integer getOrderNo()
	{
		return orderNo;
	}
	
	public void setOrderNo(Integer orderNo)
	{
		this.orderNo = orderNo;
	}
	
	public Integer getIsDel()
	{
		return isDel;
	}
	
	public void setIsDel(Integer isDel)
	{
		this.isDel = isDel;
	}
	
	public Integer getIsOnline()
	{
		return isOnline;
	}
	
	public void setIsOnline(Integer isOnline)
	{
		this.isOnline = isOnline;
	}
	
	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}
}
