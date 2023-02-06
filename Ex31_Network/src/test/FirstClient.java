package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class FirstClient  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String serverIP = "localhost";
		
		try {
			Socket socket = new Socket(serverIP, 10001);
			System.out.println("FirstClient 접속 완료");
			
			OutputStream os = socket.getOutputStream();
			PrintWriter writer = new PrintWriter(os);
			
			
			Scanner scan = new Scanner(System.in);
			
			while(true) {
				System.out.println("데이터 입력 : ");
				String msg = scan.nextLine();
				if(msg.equalsIgnoreCase("exit")) break;
				
				writer.println(msg);
				writer.flush();

			}
			
			writer.close();

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
