import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientTest2 {

	public static void main(String[] args) {
		String serverIP = "localhost";
		
		try {
			Socket socket = new Socket(serverIP, 10001);
			System.out.println("서버와 연결이 되었습니다.");
			
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader reader = new BufferedReader(isr);
			// gg 
			while(true) {
				String msg = reader.readLine();
				if(msg == null) break;
				System.out.println(msg);
			}
			
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
