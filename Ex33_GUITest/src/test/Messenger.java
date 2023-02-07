package test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Messenger {
	
	
	public void sendMsg(String msg) {
		try {
			DatagramSocket socket = new DatagramSocket();
			
			byte[] bytes = msg.getBytes();
			InetAddress addr = InetAddress.getByName("localhost"); 
			DatagramPacket packet = new DatagramPacket(bytes, bytes.length, addr, 10003); 
			
			socket.send(packet);
		} catch (SocketException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public String receiveMsg() {
		try {
			DatagramSocket socket = new DatagramSocket(10003);
			byte[] buf = new byte[1024];
			
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			socket.receive(packet);
			
			String msg = new String(buf);
			return msg;
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
