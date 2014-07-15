package iMobile.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "ReportDevHelp")
public class ReportDevHelp implements Serializable
{	
	@Id
	@Column(name = "id")
	private  Long id;
	
	@Column(name = "dev_problem")
	private String devProblem;
	
	@Column(name = "dev_solve")
	private String devSolve;
	
	@Column(name = "dev_example")
	private String devExample;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDevProblem() {
		return devProblem;
	}

	public void setDevProblem(String devProblem) {
		this.devProblem = devProblem;
	}

	public String getDevSolve() {
		return devSolve;
	}

	public void setDevSolve(String devSolve) {
		this.devSolve = devSolve;
	}

	public String getDevExample() {
		return devExample;
	}

	public void setDevExample(String devExample) {
		this.devExample = devExample;
	}

	
	
	
}
