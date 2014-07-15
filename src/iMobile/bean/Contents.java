package iMobile.bean;

import java.io.Serializable;

import javax.persistence.Entity;
@SuppressWarnings("serial")
@Entity
public class Contents implements Serializable
{	
	
	
	
	public   Contents(){};
	
	
	public   Contents(String id,int type,String picurl,String url,String content,Long datetime,String title,String briefintro){
		
		this.id = id;
		this.type = type;
		this.picurl = picurl;
		this.url = url;
		this.content = content;
		this.datetime = datetime;
		this.title = title;
		this.briefintro = briefintro;
		
		
	}
	private String id;
	private int type;
	private String picurl;
	private String url;
	private String content;
	private Long datetime;
	private String title;
	private String briefintro;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Long getDatetime() {
		return datetime;
	}
	public void setDatetime(Long datetime) {
		this.datetime = datetime;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBriefintro() {
		return briefintro;
	}
	public void setBriefintro(String briefintro) {
		this.briefintro = briefintro;
	}
	
	
}
