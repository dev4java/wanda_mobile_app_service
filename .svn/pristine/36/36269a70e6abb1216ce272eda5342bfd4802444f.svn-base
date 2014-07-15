
package iMobile.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketClient extends Thread
{
	public SocketClient()
	{
		this.start();
	}
	
	public void run()
	{
		try
		{
			Socket s = new Socket("127.0.0.1", 4700);
			// ���ڻ�ȡ����˴���������Ϣ
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			// ���Ϳͻ���׼���������Ϣ
			PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
			
			pw.println("............");
			
			String inStr = null;
			while (true)
			{
				try
				{
					inStr = br.readLine();
					if ("exit".equals(inStr))
					{
						pw.close();
						br.close();
						break;
					}
					else if (null != inStr)
					{
						System.out.println(inStr);
					}
				}
				catch (Exception e)
				{
					pw = null;
					br = null;
					throw new RuntimeException(e);
				}
			}
			s.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void main(String[] args)
	{
		new SocketClient();
	}
}
