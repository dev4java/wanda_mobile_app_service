package iMobile.bean;

import java.io.Serializable;

import javax.persistence.Entity;
@SuppressWarnings("serial")
@Entity
public class FunctionList implements Serializable
{	
	
	
	public   FunctionList(){};
	
	public   FunctionList(String id,String title,String picurl,String url,int urltype,int orderno){
		
		this.id = id;
		this.title = title;
		this.picurl = picurl;
		this.url = url;
		this.urltype = urltype;
		this.orderno = orderno;
	}
	private String id;
	private String title;
	private String picurl;
	private String url;
	private int urltype;
	private int orderno;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPicurl() {
		return picurl;
	}
	public void setPicurl(String picurl) {
		this.picurl = picurl;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getUrltype() {
		return urltype;
	}
	public void setUrltype(int urltype) {
		this.urltype = urltype;
	}
	public int getOrderno() {
		return orderno;
	}
	public void setOrderno(int orderno) {
		this.orderno = orderno;
	}

	
	
}
