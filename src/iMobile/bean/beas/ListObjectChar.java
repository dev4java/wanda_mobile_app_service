
package iMobile.bean.beas;


import javax.persistence.Entity;

@Entity
public class ListObjectChar
{

	private int	status;
	
	private String	msg;
	
	
	private Object	data;
	
	
	

	
	public ListObjectChar(){}
	
	public ListObjectChar(int status, String msg)
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





	public Object getData() {
		return data;
	}





	public void setData(Object data) {
		this.data = data;
	}

	
	

	
	
	
	
	
	
}
