import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ButtonEventTest extends JFrame {
	
	// 12_ 프레임이 보여줄 컴포넌트들의 "참조변수" 는 클래스안에 어디서든 인식할 수 있도록 멤버변수로 만들어놓을것을 권장함!!!
	
	JLabel label;// 13_ 제발 참조변수만 만들어~~
	JButton btn;
	
	JButton btn2;
	JLabel imgLabel;
	
	int btnFlag = 1;
	int imgFlag = 1;
	// 2_ 생성자 메소드로 초기값 설정
	public ButtonEventTest() {
		setSize(500,500);
		setTitle("버튼 클릭 이벤트 처리");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(rootPane);
		
		// 3_ 간단하게 옆으로 배치되도록 배치관리자를 변경해보자
		setLayout(new FlowLayout());
		
		// 4_ 버튼을 클릭하여 Label 의 글씨를 변경해보자!
		btn = new JButton("버튼");
		label = new JLabel("Hello Java");
		
		// 5_ frame 에 붙이기
		add(btn);
		add(label);
		
		// 6_ 버튼(btn)이 클릭되는 것을 듣는 리스너객체를 생성하자 그리고 버튼에 달아보자.
		// 6_1 리스너 객체 생성
		// ActionListener listener = new ActionListener(); // 인터페이스는 곧바로 객체생성이 불가능!
		// 7_ 인터페이스의 추상메소드를 구현하는 별도의 클래스를 설계하여 이를 객체로 생성해야 한다.
		// 10_ 객체로 생성 그리고 버튼에 붙여주자.
		ClickListener clickListener = new ClickListener();
		
		// 6_2 버튼에 리스너 붙이기
		btn.addActionListener(clickListener);
		
		
		
		// 버튼 2 클릭시에 이미지 변경 해보기 
		btn2 = new JButton("이미지 바꾸기");
		imgLabel = new JLabel();
		ImageIcon ic = new ImageIcon("image/ms14.png");
		Image img = ic.getImage();
		Image img2 = img.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		ImageIcon ic2 = new ImageIcon(img2);
		imgLabel .setIcon(ic2);
		
		add(imgLabel);
		add(btn2);
		
		// 13_ 버튼2가 클릭되는 이벤트액션을 듣는 리스너객체 생성 - 버튼 1과 다른동작을 해야한다.
		
		// 14_ 인터페이스를 구현한 별도의 클래스를 또 만들려니 짜증... 그러니 ActionListener 객체를 생성하면서 추상메소드를 구현해버리면..??
		// 15_ 객체를 생성하면서 클래스를 설계하는 문법 : 익명 클래스 
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("익명클래스 객체 clicked");
				
				// 16_ 이미지 변경 - 사이즈조절하면서 줄여쓰자
				if(imgFlag == 1) {
					Image img = new ImageIcon("image/ms21.png").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH); // 메소드 체이닝 기법!
					imgLabel.setIcon(new ImageIcon(img));
					imgFlag = 0;
				} else {
					Image img = new ImageIcon("image/ms14.png").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH); // 메소드 체이닝 기법!
					imgLabel.setIcon(new ImageIcon(img));
					imgFlag = 1;
				}
			}
		};
		btn2.addActionListener(listener);
		
		setVisible(true);
	}
	
	// 8_ ActionListner 인터페이스의 추상메소드를 구현하는 클래스 설계 : inner class (아우터클래스의 멤버들을 제것인양!) 
class ClickListener implements ActionListener{

	// 9_ 이 리스너객체가 감시하는 컴포넌트에 (클릭)이벤트가 발동하면 자동으로 실행되는 메소드 : 콜백메소드 (호출이 거꾸로.. 원래는 함수콜을 우리가 해야하는데, 콜백메서드는 어떠한 이벤트가 일어나서 운영체제가 메소드를 호출하는 메소드)
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Clicked!!!");
		//  11_ JLabel 글씨 변경해보기
		
		if(btnFlag == 1) {
			label.setText("Hello Android"); 
			btnFlag *= -1;
		} else {
			label.setText("Hello Java");
			btnFlag *= -1;
		}

	}
	
}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ButtonEventTest(); // 1_JFrame 능력을 가진 클래스를 객체로 생성
	}

}
