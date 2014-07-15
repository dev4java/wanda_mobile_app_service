package iMobile.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "FAQ")
public class FAQ implements Serializable
{	
	@Id
	@Column(name = "id")
	private  Long id;
	
	@Column(name = "faq_class")
	private String faqClass;
	
	@Column(name = "problem")
	private String problem;
	
	@Column(name = "solve")
	private String solve;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFaqClass() {
		return faqClass;
	}

	public void setFaqClass(String faqClass) {
		this.faqClass = faqClass;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public String getSolve() {
		return solve;
	}

	public void setSolve(String solve) {
		this.solve = solve;
	}

	
	
	

	
	
}
