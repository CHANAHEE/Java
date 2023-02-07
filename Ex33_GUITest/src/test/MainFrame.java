package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
<<<<<<< HEAD
=======
import java.io.IOException;
>>>>>>> a20f01f229b41e6208414e417a548dbcb53c79eb
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
<<<<<<< HEAD
=======
import java.net.UnknownHostException;
>>>>>>> a20f01f229b41e6208414e417a548dbcb53c79eb

public class MainFrame {


	
	public MainFrame() {
		
		User1_Thread ut1 = new User1_Thread();
		User2_Thread ut2 = new User2_Thread();
		
		ut1.start();
		ut2.start();
	}
	public static void main(String[] args) {
<<<<<<< HEAD
		try {
			DatagramSocket socket = new DatagramSocket();
			
//			byte[] bytes = msg.getBytes();
//			InetAddress addr = InetAddress.getByName("localhost"); 
//			DatagramPacket packet = new DatagramPacket(bytes, bytes.length, addr, 10003); 
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
=======

>>>>>>> a20f01f229b41e6208414e417a548dbcb53c79eb
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
<<<<<<< HEAD
				String msg = user1.tf.getText();
				user1.ta.setText(msg);
				
				
=======
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
>>>>>>> a20f01f229b41e6208414e417a548dbcb53c79eb
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
<<<<<<< HEAD
				user2.tf.getText();
				
=======
			
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
>>>>>>> a20f01f229b41e6208414e417a548dbcb53c79eb
			}
		});
	}
}