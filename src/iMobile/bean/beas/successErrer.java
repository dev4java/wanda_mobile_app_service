package iMobile.bean.beas;






import javax.persistence.Entity;


@Entity
public class successErrer
{	
	
	
	private int	status;
	
	private String	msg;

	
	
	public successErrer(int status, String msg)
	{	
		this.status = status;
		this.msg = msg;
	}



	public int getStatus() {
		return status;
	}



	public void setStatus(int status) {
		this.status = status;
	}



	public String getMsg() {
		return msg;
	}



	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	

	
	
	
}
