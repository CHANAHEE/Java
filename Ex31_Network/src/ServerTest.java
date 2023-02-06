import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class ServerTest {

	public static void main(String[] args) {
		// 1_ 통신을 하려면 일단 IP 주소는 알아야 함.
		// 자바에 IP 주소와 관련된 정보를 가지고 있는 클래스 : InetAddress
		
		// 2_ 본인의 IP주소를 확인하는 방법 , IP 주소는 문자열!
		try {
			System.out.println(InetAddress.getLocalHost().getHostAddress()); // 2_1 내 IP 주소
			System.out.println(InetAddress.getLocalHost().getHostName()); // 2_2 컴퓨터 이름
			System.out.println(InetAddress.getLocalHost()); // 2_3 1,2 동시에 출력 
			System.out.println(InetAddress.getLoopbackAddress().getHostAddress()); // 3_ 루프백 주소. 내 컴퓨터의 대체 Ip 주소같은 개념.
			System.out.println(InetAddress.getLoopbackAddress().getHostName());// 4_ 내 컴퓨터의 도메인 : localhost 
		} catch (UnknownHostException e) {
			System.out.println("호스트를 찾을 수 없습니다.");
		}
		
		
		// 5_ 통신을 구현하기전에 2가지 용어부터 정리하자.
		// 1. IP 주소 : 그 컴퓨터의 고유한 주소(숫자) : 42억개 정도 있음(IPv4)
		// 2. port 번호 : 그 컴퓨터 안에서의 프로그램 고유번호(6만 5천개) - 인터넷을 쓸 수 있는 프로그램은 하나가 아니다. 근데 인터넷은 랜선 하나로 연결~
		// 그니까 랜선으로 인터넷이 오면 포트번호를 통해 어떤 프로그램에게 인터넷을 할당할지 정한다. 근데 0~1024 번까지는 사용하지 않는것을 권장(well-known port)
		// ex) IP - 부산항, 포트번호 - 3번 항구
		
		// 6_ 서버용 프로그램을 작성
		// 6_1 서버소켓부터 만들자
		try {
			ServerSocket serverSocket = new ServerSocket(10001); // port 번호가 필요하다!
			System.out.println("서버소켓 생성");
			
			// 6_2 클라이언트의 접속을 기다리자.
			System.out.println("클라이언트의 접속을 기다리는 중 . . .");
			Socket socket = serverSocket.accept(); // 6_3 여기서 커서(스레드)가 대기함. 언제까지? 클라이언트가 접속 할 때까지. 클라이언트가 접속을 해야 소켓이 전달된다!
			System.out.println("클라이언트 접속 완료!"); // 6_4 이 코드로 넘어왔다는 이야기는 클라이언트가 접속했다는 이야기!
			
			// 9_ 클라이언트로 부터 데이터를 읽어오는 무지개로드(InputStream) 생성하자!
			InputStream is = socket.getInputStream(); // 바이트 스트림
			InputStreamReader isr = new InputStreamReader(is); // 문자 스트림으로 변환
			BufferedReader reader = new BufferedReader(isr); // 보조 문자 스트림 -> 단계를 거쳐서 바로 올려면 charater set 정보를 넘겨주어야 한다. 그래서 그냥 단계를 거쳐가자.
			
			// 10_ 클라이언트의 OutputStream 을 통해 보내온 데이터를 읽어오자.
//			String msg = reader.readLine();
//			System.out.println("받은 메시지 : " + msg);
			
			// 13_ 여기도 여러번 받아오자!
			while(true) {
				String msg = reader.readLine();
				// 14_ readLine() 은 클라이언트의 정보를 기다린다. accept() 가 커서를 기다리는것처럼.
				// 안보내면 보낼때까지 기다리는데, 그러면 null 값은 언제 받아올 수 있느냐? -> 스트림이 끊어졌을때!
				// 클라이언트에서 exit 를 입력하면 msg 에 저장하지 않고 while 문을 끝내고, close() 를 통해 스트림을 닫았다.
				// 그러면 이때 null 값을 받아오게 된다.
				if(msg == null) break;
				System.out.println("받은 메시지 : " + msg);
			}
			// 11_ 스트림 닫기. 
			System.out.println("모든 접속 종료");
			reader.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
