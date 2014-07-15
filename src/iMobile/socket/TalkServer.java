
package iMobile.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TalkServer extends Thread
{
	public static void main(String args[])
	{
		try
		{
			ServerSocket server = null;
			try
			{
				server = new ServerSocket(4700);
				// ����һ��ServerSocket�ڶ˿�4700����ͻ�����
			}
			catch (Exception e)
			{
				System.out.println("can not listen to:" + e);
				// ���?��ӡ������Ϣ
			}
			Socket socket = null;
			try
			{
				socket = server.accept();
				// ʹ��accept()����ȴ�ͻ������пͻ�
				// �����������һ��Socket���󣬲�����ִ��
			}
			catch (Exception e)
			{
				System.out.println("Error." + e);
				// ���?��ӡ������Ϣ
			}
			BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// ��Socket����õ�����������������Ӧ��BufferedReader����
			PrintWriter os = new PrintWriter(socket.getOutputStream());
			// ��Socket����õ��������������PrintWriter����
			//BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
			// ��ϵͳ��׼�����豸����BufferedReader����
			System.out.println("�ͻ��˷�������������:" + is.readLine());
			// �ڱ�׼����ϴ�ӡ�ӿͻ��˶�����ַ�
			
			// �ӱ�׼�������һ�ַ�
			//while (true)
			//{
				// �����ַ�Ϊ "bye"����ֹͣѭ��
				os.println("���Ƿ��������ص�һ���ַ�");
				//os.println(line);
				// ��ͻ���������ַ�
				os.flush();
				// ˢ���������ʹClient�����յ����ַ�
				//System.out.println("Server:" + line);
				// ��ϵͳ��׼����ϴ�ӡ������ַ�
				System.out.println("Client:" + is.readLine());
				// ��Client����һ�ַ�����ӡ����׼�����
				//line = sin.readLine();
				// ��ϵͳ��׼�������һ�ַ�
			//} // ����ѭ��
			os.close(); // �ر�Socket�����
			is.close(); // �ر�Socket������
			socket.close(); // �ر�Socket
			server.close(); // �ر�ServerSocket
		}
		catch (Exception e)
		{
			System.out.println("Error:" + e);
			// ���?��ӡ������Ϣ
		}
	}
}
