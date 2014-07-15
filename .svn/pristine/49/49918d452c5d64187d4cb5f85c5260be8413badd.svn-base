
package iMobile.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_SYSAUTHORITY")
@SequenceGenerator(name = "SEQ_SYSAUTHORITY", sequenceName = "SEQ_SYSAUTHORITY", allocationSize = 1)
public class SysAuthority implements Serializable
{
	/**
	 * 
	 */
	private static final long		serialVersionUID	= 6574732919611735484L;
	
	@Id
	@Column(name = "id")
	private Long					id;
	
	@Column(name = "name")
	private String					name;
	
	@Column(name = "description")
	private String					description;
	
	@Column(name = "is_sys")
	private Integer					isSys				= 0;
	
	@Column(name = "is_enable")
	private Integer					isEnable			= 0;
	
	@Column(name = "order_no")
	private Integer					orderNo				= 0;
	
	@ManyToMany(mappedBy = "authorities")
	private Collection<SysRole>		roles				= new ArrayList<SysRole>();
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "TB_SYS_AUH_RES", joinColumns = { @JoinColumn(name = "AUH_ID", nullable = false) }, inverseJoinColumns = { @JoinColumn(nullable = false, name = "RES_ID") })
	private Collection<SysResource>	resources			= new ArrayList<SysResource>();
	
	@Column(name = "is_del")
	private Integer					isDel				= 0;
	
	public Long getId()
	{
		return id;
	}
	
	public void setId(Long id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public Integer getIsSys()
	{
		return isSys;
	}
	
	public void setIsSys(Integer isSys)
	{
		this.isSys = isSys;
	}
	
	public Integer getIsEnable()
	{
		return isEnable;
	}
	
	public void setIsEnable(Integer isEnable)
	{
		this.isEnable = isEnable;
	}
	
	public Integer getOrderNo()
	{
		return orderNo;
	}
	
	public void setOrderNo(Integer orderNo)
	{
		this.orderNo = orderNo;
	}
	
	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}
	
	public Collection<SysRole> getRoles()
	{
		return roles;
	}
	
	public void setRoles(Collection<SysRole> roles)
	{
		this.roles = roles;
	}
	
	public Collection<SysResource> getResources()
	{
		return resources;
	}
	
	public void setResources(Collection<SysResource> resources)
	{
		this.resources = resources;
	}
	
	public Integer getIsDel()
	{
		return isDel;
	}
	
	public void setIsDel(Integer isDel)
	{
		this.isDel = isDel;
	}
	
}
