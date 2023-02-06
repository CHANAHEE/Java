package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SecondClient {

	public static void main(String[] args) {
		
		String serverIP = "localhost";
		
		try {
			Socket socket = new Socket(serverIP, 10001);
			System.out.println("SecondClient 접속 완료!");
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader reader = new BufferedReader(isr);
			
			while(true) {
				String result = reader.readLine();
				if(result == null) break;
				System.out.println(result);
			}
			reader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
