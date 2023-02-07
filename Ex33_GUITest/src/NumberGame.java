import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NumberGame extends JFrame{
	// 2_
	JLabel label;
	JButton btn;
	JTextField tf;
	
	int com; // 5_ 컴퓨터가 만들 랜덤한 숫자값 저장 변수 
	// 1_
	public NumberGame() {
		// 6_ 컴퓨터의 랜덤 값 
		Random rand = new Random();
		com = rand.nextInt(50) + 1;
		
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("숫자 맞히기 게임");
		setLocationRelativeTo(rootPane);
		
		label = new JLabel("1~50 중 랜덤한 숫자를 맞춰보세요");
		// 3_
		label.setHorizontalAlignment(JLabel.CENTER);
		
		
		btn = new JButton("확\t인");
		tf = new JTextField();
		tf.setHorizontalAlignment(JTextField.CENTER);
		// 4_
		
		
		add(label,BorderLayout.NORTH);
		add(btn,BorderLayout.CENTER);
		add(tf,BorderLayout.SOUTH);
		
		setVisible(true);
		
		// 7_ 버튼이 클릭 되었을 때 즉, 클릭되는 액션이 발동할 때 TextField(tf) 에 써있는 숫자를 읽어와서
		// 정답 숫자와 비교.
		
		ActionListener li = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 8_ TextField 에 써있는 숫자를 가져오기
				
				int result = Integer.valueOf(tf.getText());
				
				
				// 9_ 읽어온 숫자와 정답값 비교
				if(com > result) label.setText("UP");
				else if(com < result) label.setText("DOWN");
				else label.setText("정답!");
				
			}
		};
		btn.addActionListener(li);
	}
	public static void main(String[] args) {
		new NumberGame();
		
	}

}
