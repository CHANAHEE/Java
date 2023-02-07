package test;

import java.awt.BorderLayout;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class User1 extends JFrame{

	JPanel panel1,panel2;
	JTextArea ta;
	JLabel label;
	JTextField tf;
	JButton btn;
	
	
	public User1() {
		setSize(300,450);
		setLocationRelativeTo(rootPane);
		setTitle("채팅 프로그램 user1");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		panel1 = new JPanel();
		panel1.setLayout(new BorderLayout());
		tf = new JTextField();
		btn = new JButton("확인");
		panel1.add(tf,BorderLayout.CENTER);
		panel1.add(btn,BorderLayout.EAST);
		add(panel1,BorderLayout.SOUTH);
		
		
		panel2 = new JPanel();
		ta = new JTextArea();
		panel2.add(ta);
		add(panel2,BorderLayout.CENTER);
		
		
		setVisible(true);
	}
	
}
