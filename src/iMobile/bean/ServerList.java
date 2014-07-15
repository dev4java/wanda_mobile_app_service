package iMobile.bean;

import java.io.Serializable;

import javax.persistence.Entity;
@SuppressWarnings("serial")
@Entity
public class ServerList implements Serializable
{	
	
	
	public   ServerList(){};
	
	
	public   ServerList(String id,String iconurl,String serviceresid,String servicename,String briefintro,Long lastmsgtime,int count){
		
		this.id = id;
		this.iconurl = iconurl;
		this.serviceresid = serviceresid;
		this.servicename = servicename;
		this.briefintro = briefintro;
		this.lastmsgtime = lastmsgtime;
		this.count = count;
	}
	private String id;
	private String iconurl;
	private String serviceresid;
	private String servicename;
	private String briefintro;
	private Long lastmsgtime;
	private int count;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIconurl() {
		return iconurl;
	}
	public void setIconurl(String iconurl) {
		this.iconurl = iconurl;
	}
	public String getServiceresid() {
		return serviceresid;
	}
	public void setServiceresid(String serviceresid) {
		this.serviceresid = serviceresid;
	}
	public String getServicename() {
		return servicename;
	}
	public void setServicename(String servicename) {
		this.servicename = servicename;
	}
	public String getBriefintro() {
		return briefintro;
	}
	public void setBriefintro(String briefintro) {
		this.briefintro = briefintro;
	}
	public Long getLastmsgtime() {
		return lastmsgtime;
	}
	public void setLastmsgtime(Long lastmsgtime) {
		this.lastmsgtime = lastmsgtime;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
}
