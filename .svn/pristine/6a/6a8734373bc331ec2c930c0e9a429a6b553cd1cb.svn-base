
package iMobile.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketServerThread extends Thread
{
	
	private Socket	socket;
	
	public SocketServerThread(Socket socket)
	{
		this.socket = socket;
		this.start();
	}
	
	public void run()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
			String str = br.readLine();
			pw.println("������������ӳɹ�");
			System.out.println(str);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
