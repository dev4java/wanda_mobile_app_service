package iMobile.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name = "AppContainer")
public class AppContainer  implements Serializable
{	
	
	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "container_code")
	private String containerCode;
	
	@Column(name = "container_name")
	private String containerName;
	
	@Column(name = "container_type")
	private Integer containerType;
	
	@Column(name = "container_state")
	private Integer containerState;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContainerCode() {
		return containerCode;
	}

	public void setContainerCode(String containerCode) {
		this.containerCode = containerCode;
	}

	public String getContainerName() {
		return containerName;
	}

	public void setContainerName(String containerName) {
		this.containerName = containerName;
	}

	public Integer getContainerType() {
		return containerType;
	}

	public void setContainerType(Integer containerType) {
		this.containerType = containerType;
	}

	public Integer getContainerState() {
		return containerState;
	}

	public void setContainerState(Integer containerState) {
		this.containerState = containerState;
	}
	
	
}
