
package iMobile.socket;

import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer
{
	public void ServerSocketNet()
	{
		try
		{
			ServerSocket serverSocket = new ServerSocket(4700);
			while (true)
			{
				Socket socket = serverSocket.accept();
				new SocketServerThread(socket);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		SocketServer server = new SocketServer();
		server.ServerSocketNet();
	}
}
