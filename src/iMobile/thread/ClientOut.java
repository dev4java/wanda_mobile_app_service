
package iMobile.thread;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClientOut extends Thread
{
	
	public static Map<Long, List<String>>	TEST_BR_STRRING	= new HashMap<Long, List<String>>();
	
	private Socket							socket;
	
	private BufferedReader					br;
	
	private PrintWriter						pw;
	
	private Long							rm;
	
	public ClientOut(Socket socket, BufferedReader br, PrintWriter pw, Long rm)
	{
		this.br = br;
		this.pw = pw;
		this.rm = rm;
		this.socket = socket;
		this.start();
	}
	
	public void run()
	{
		try
		{
			String inStr = null;
			List<String> list = new ArrayList<String>();
			while (true)
			{
				try
				{
					inStr = br.readLine();
					if ("exit".equals(inStr))
					{
						list.add(inStr);
						pw.close();
						br.close();
						break;
					}
					else if (null != inStr)
					{
						list.add(inStr);
					}
					TEST_BR_STRRING.put(rm, list);
				}
				catch (Exception e)
				{
					pw = null;
					br = null;
					throw new RuntimeException(e);
				}
			}
			socket.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
