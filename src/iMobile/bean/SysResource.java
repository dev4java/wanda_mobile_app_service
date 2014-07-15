
package iMobile.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_SYSRESOURCE")
@SequenceGenerator(name = "SEQ_SYSRESOURCE", sequenceName = "SEQ_SYSRESOURCE", allocationSize = 1)
public class SysResource implements Serializable
{
	/**
	 * 
	 */
	private static final long	serialVersionUID	= -2370829705893649845L;
	
	@Id
	@Column(name = "id")
	private Long				id;
	
	@Column(name = "pid")
	private Long				pid;
	
	@Column(name = "name")
	private String				name;
	
	@Column(name = "description")
	private String				description;
	
	@Column(name = "is_sys")
	private Integer				isSys				= 0;
	
	@Column(name = "is_enable")
	private Integer				isEnable			= 0;
	
	@Column(name = "type")
	private Integer				type				= 0;
	
	@Column(name = "url")
	private String				url;
	
	@Column(name = "method")
	private String				method;
	
	@Column(name = "is_show")
	private Integer				isShow				= 0;
	
	@Column(name = "order_no")
	private Integer				orderNo				= 0;
	
	@Column(name = "is_del")
	private Integer				isDel				= 0;
	
	public Long getId()
	{
		return id;
	}
	
	public void setId(Long id)
	{
		this.id = id;
	}
	
	public Long getPid()
	{
		return pid;
	}
	
	public void setPid(Long pid)
	{
		this.pid = pid;
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
	
	public Integer getType()
	{
		return type;
	}
	
	public void setType(Integer type)
	{
		this.type = type;
	}
	
	public String getUrl()
	{
		return url;
	}
	
	public void setUrl(String url)
	{
		this.url = url;
	}
	
	public String getMethod()
	{
		return method;
	}
	
	public void setMethod(String method)
	{
		this.method = method;
	}
	
	public Integer getIsShow()
	{
		return isShow;
	}
	
	public void setIsShow(Integer isShow)
	{
		this.isShow = isShow;
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
	
	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}
	
}
