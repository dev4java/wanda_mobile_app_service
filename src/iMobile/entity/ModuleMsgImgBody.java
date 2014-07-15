package iMobile.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "ModulePushMsg")
public class ModuleMsgImgBody implements Serializable
{	
	@Id
	@Column(name = "id")
	private  Long id;
	
	@Column(name = "msg_code")
	private String msgCode;
	
	@Column(name = "mg_type")
	private Integer mgType;
	
	@Column(name = "text")
	private String text;
	
	@Column(name = "img_path")
	private String imgPath;
	
	@Column(name = "web_url")
	private String webUrl;
	
	@Column(name = "order_no")
	private Integer orderNo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMsgCode() {
		return msgCode;
	}

	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
	}

	public Integer getMgType() {
		return mgType;
	}

	public void setMgType(Integer mgType) {
		this.mgType = mgType;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public String getWebUrl() {
		return webUrl;
	}

	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}

	public Integer getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}

	
	
	
	
}
