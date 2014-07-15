
package iMobile.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
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
@Table(name = "TB_SYSROLE")
@SequenceGenerator(name = "SEQ_SYSROLE", sequenceName = "SEQ_SYSROLE", allocationSize = 1)
public class SysRole implements Serializable
{
	
	/**
	 * 
	 */
	private static final long			serialVersionUID	= -2371938388929798408L;
	
	@Id
	@Column(name = "id")
	private Long						id;
	
	@Column(name = "name")
	private String						name;
	
	@Column(name = "description")
	private String						description;
	
	@Column(name = "is_sys")
	private Integer						isSys				= 0;
	
	@Column(name = "is_enable")
	private Integer						isEnable			= 0;
	
	@Column(name = "order_no")
	private Integer						orderNo				= 0;
	
	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY, targetEntity = SysAuthority.class)
	@JoinTable(name = "TB_SYS_ROLE_AUH", joinColumns = { @JoinColumn(name = "ROLE_ID", nullable = false) }, inverseJoinColumns = { @JoinColumn(name = "AUH_ID", nullable = false) })
	private Collection<SysAuthority>	authorities			= new ArrayList<SysAuthority>();
																								
	@Column(name = "is_del")
	private Integer						isDel				= 0;
	
	@Column(name = "is_Boss")
	private Integer						isBoss				= 0;
	
	@Column(name = "is_work_order_operator")
	private Integer						isWorkOrderOperator	= 0;
	
	@Column(name = "is_rep_sell")
	private Integer						isRepSell			= 0;
	
	@Column(name = "professional")
	private Integer						professional;
	
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
	
	public Collection<SysAuthority> getAuthorities()
	{
		return authorities;
	}
	
	public void setAuthorities(Collection<SysAuthority> authorities)
	{
		this.authorities = authorities;
	}
	
	public Integer getIsDel()
	{
		return isDel;
	}
	
	public void setIsDel(Integer isDel)
	{
		this.isDel = isDel;
	}
	
	public Integer getIsBoss()
	{
		return isBoss;
	}
	
	public void setIsBoss(Integer isBoss)
	{
		this.isBoss = isBoss;
	}
	
	public Integer getIsWorkOrderOperator()
	{
		return isWorkOrderOperator;
	}
	
	public void setIsWorkOrderOperator(Integer isWorkOrderOperator)
	{
		this.isWorkOrderOperator = isWorkOrderOperator;
	}
	
	public Integer getIsRepSell()
	{
		return isRepSell;
	}
	
	public void setIsRepSell(Integer isRepSell)
	{
		this.isRepSell = isRepSell;
	}
	
	public Integer getProfessional()
	{
		return professional;
	}
	
	public void setProfessional(Integer professional)
	{
		this.professional = professional;
	}
	
}
