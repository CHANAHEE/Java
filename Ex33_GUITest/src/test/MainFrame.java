package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class MainFrame {


	
	public MainFrame() {
		
		User1_Thread ut1 = new User1_Thread();
		User2_Thread ut2 = new User2_Thread();
		
		ut1.start();
		ut2.start();
	}
	public static void main(String[] args) {

		new MainFrame();
		
	}

}

class User1_Thread extends Thread {
	
	
	@Override
	public void run() {
		
		User1 user1 = new User1();
		
		user1.btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// User1 메시지 보내기 
				String sendingMsg = user1.tf.getText();
				System.out.println(sendingMsg);
				user1.ta.setText(sendingMsg);
	
				
				// User1 메시지 띄우기
//				Messenger msgObj2 = new Messenger();
//				String receivingMsg = msgObj2.receiveMsg();
//				user1.ta.setText(receivingMsg);
				
				
				try {
					DatagramSocket socket = new DatagramSocket();
					
					byte[] bytes = sendingMsg.getBytes();
					InetAddress addr = InetAddress.getByName("localhost"); 
					DatagramPacket packet = new DatagramPacket(bytes, bytes.length, addr, 10003); 
					
					socket.send(packet);
					System.out.println("메시지 전송 완료");
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
		});
		
	}
}

class User2_Thread extends Thread {
	@Override
	public void run() {
		User2 user2 = new User2();
		
		user2.btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				// User2 메시지 띄우기
				
				
				
				// User2 메시지 보내기
//				String sendingMsg = user2.tf.getText();
//				user2.ta.setText(sendingMsg);
//				Messenger msgObj2 = new Messenger();
//				msgObj2.sendMsg(sendingMsg);
				System.out.println("메시지 기다리는 중 . . .");
				try {
					DatagramSocket socket = new DatagramSocket(10003);
					byte[] buf = new byte[1024];
					
					DatagramPacket packet = new DatagramPacket(buf, buf.length);
					socket.receive(packet);
					
					String msg = new String(buf);
					user2.ta.setText(msg);
				} catch (SocketException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
	}
}