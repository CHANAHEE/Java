package test;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class User2 extends JFrame{

	JPanel panel1,panel2;
	JTextArea ta;
	JLabel label;
	JTextField tf;
	JButton btn;
	
	public User2() {
		setSize(300,450);
		setLocationRelativeTo(rootPane);
<<<<<<< HEAD
		setTitle("채팅 프로그램");
=======
		setTitle("채팅 프로그램 user2");
>>>>>>> a20f01f229b41e6208414e417a548dbcb53c79eb
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		panel1 = new JPanel();
		panel1.setLayout(new BorderLayout());
		tf = new JTextField();
		btn = new JButton("확인");
		panel1.add(tf,BorderLayout.CENTER);
		panel1.add(btn,BorderLayout.EAST);
		add(panel1,BorderLayout.SOUTH);
		
		
		panel2 = new JPanel();
<<<<<<< HEAD
		label = new JLabel();
		panel2.add(label);
=======
		ta = new JTextArea();
		panel2.add(ta);
>>>>>>> a20f01f229b41e6208414e417a548dbcb53c79eb
		add(panel2,BorderLayout.CENTER);
		
		setVisible(true);
	}

}
