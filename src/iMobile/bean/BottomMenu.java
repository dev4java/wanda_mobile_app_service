package iMobile.bean;

import java.io.Serializable;

import javax.persistence.Entity;
@SuppressWarnings("serial")
@Entity
public class BottomMenu  implements Serializable
{	
	
	
	public   BottomMenu(){};
	
	public   BottomMenu(String id,String serviceresid,int type,String name,String content,String url,Object submenus){
		
		this.id = id;
		this.serviceresid = serviceresid;
		this.type = type;
		this.name = name;
		this.content = content;
		this.url = url;
		this.submenus = submenus;
		
		
	}
	
	private String id;
	private String serviceresid;
	private int type;
	private String name;
	private String content;
	private String url;
	private Object submenus;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getServiceresid() {
		return serviceresid;
	}
	public void setServiceresid(String serviceresid) {
		this.serviceresid = serviceresid;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Object getSubmenus() {
		return submenus;
	}
	public void setSubmenus(Object submenus) {
		this.submenus = submenus;
	}
	
	
}
