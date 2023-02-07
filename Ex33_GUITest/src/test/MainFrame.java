package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class MainFrame {


	
	public MainFrame() {
		
		User1_Thread ut1 = new User1_Thread();
		User2_Thread ut2 = new User2_Thread();
		
		ut1.start();
		ut2.start();
	}
	public static void main(String[] args) {
		try {
			DatagramSocket socket = new DatagramSocket();
			
//			byte[] bytes = msg.getBytes();
//			InetAddress addr = InetAddress.getByName("localhost"); 
//			DatagramPacket packet = new DatagramPacket(bytes, bytes.length, addr, 10003); 
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
				String msg = user1.tf.getText();
				user1.ta.setText(msg);
				
				
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
				user2.tf.getText();
				
			}
		});
	}
}