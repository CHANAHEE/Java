import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
		// 1_ GUI 프로그래밍
		// 자바언어에서 GUI 개발을 위해 미리 설계된 클래스들의 묶음 API 를 제공함.
		
		// 1. AWT
		// 2. Swing -> 요걸 사용하자
		// 3. JavaFX - 별도 프로그램 설치 필요
		
		// 2_ GUI 맛보기로 Swing API 사용
		
		// 2_1 최상위 컨테이터 생성
		JFrame frame = new JFrame("카카오톡");
		frame.setSize(500, 400);
		
		// 2_7 기본적으로 JFrame 은 BorderLayout 이라는 배치관리자가 설정되어 있음.
		// 가장 쉬운 레이아웃매니저인 FlowLayout 으로 변경.
		frame.setLayout(new FlowLayout());
		
		// 2_4 컴포넌트 추가하기
		JButton b1 = new JButton("버튼");
		JButton b2 = new JButton("추가하기");
		
		b1.setSize(80, 80);
		
		// 2_5 컨테이너에 추가하기
		// 2_6 배치관리자(LayoutManager) 사용해보기
		frame.add(b1,FlowLayout.LEADING);
		frame.add(b2,FlowLayout.LEFT);
		
		
		// 2_8 JLabel 사용해보기 - 글씨를 보여주는 목적의 컴포넌트
JLabel label = new JLabel("This is Label");
frame.add(label);
		
		// 2_9 JTextField - 사용자가 글씨를 입력할 수 있도록 하는 컴포넌트 
JTextField text = new JTextField(20);
frame.add(text);
		
		// 2_10 이미지 - 이미지용 컴포넌트가 존재하지 않음.
		// JLabel 에 아이콘을 보여주는 기능이 있음. 이를 활용하자.
		// 이미지 아이콘 객체 생성
		ImageIcon ic = new ImageIcon("image/ms14.png");
		
		// 2_12 이미지 아이콘의 이미지 사이즈 리사이징
		// 이미지 아이콘안에서 실제 이미지를 가지고 있는 Image 객체 뽑아오기 파일입출력에서 스트림을 통해 데이터를 전달했듯, 이미지도 비슷한 방식인데,
		// Image 객체가 그 역할을 대신해준다. 
		
		// 2_13 원본은 변경이 불가하니 scale 이 가능한 복사본 image 객체를 만들어야 한다. 그리고 그 객체를 label 에 넣어주자.
		Image im = ic.getImage();
		// 2_14 뽑아온 이미지 객체를 기반으로 사이즈가 조절된 새로운 이미지 객체생성
Image cpIm = im.getScaledInstance(128, 128, Image.SCALE_SMOOTH);
ImageIcon cpIc = new ImageIcon(cpIm);

// 2_11 이미지아이콘은 컴포넌트가 아니다! 그래서 화면에 보여주려면 JLabel 을 활용해야한다!
JLabel img = new JLabel();
img.setIcon(cpIc);
frame.add(img);
		
		// 2_3 기본적으로 JFrame 의 x 버튼을 눌러서 창을 닫아도, 프래그램이 종료되지않는다.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(300, 200);
		
		// Jframe 에게 물어보자. ON ~ 했을 때!
		// 2_2 최상위 컨테이너를 화면에 보이자
		frame.setVisible(true);
	}

}
