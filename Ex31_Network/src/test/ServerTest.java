package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket serverSocket = new ServerSocket(10001);
			
			System.out.println("클라이언트 접속 대기중 . . .");
			
			Socket socketFirst = serverSocket.accept(); // FirstClient 접속
			Socket socketSecond = serverSocket.accept(); // SecondClient 접속
			
			System.out.println("클라이언트 접속 완료!");
			
			InputStream is = socketFirst.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader reader = new BufferedReader(isr);
			
			OutputStream os = socketSecond.getOutputStream();
			PrintWriter writer = new PrintWriter(os);
			
			while(true) {
				String msg = reader.readLine();
				if(msg == null) break;

				writer.println(msg);
				writer.flush();
			}
			reader.close();
			writer.close();
			//ThreadWrite tw = new ThreadWrite(socketFirst,socketSecond);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
//
//class ThreadWrite extends Thread {
//	Socket socketFirst;
//	Socket socketSecond;
//	
//	public ThreadWrite(Socket socketFirst,Socket socketSecond) {
//		// TODO Auto-generated constructor stub
//		this.socketFirst = socketFirst;
//		this.socketSecond = socketSecond;
//	}
//	@Override
//	public void run() {
//		try {
//			OutputStream os = socketFirst.getOutputStream();
//			PrintWriter writer = new PrintWriter(os);
//			
//			Scanner scan = new Scanner(System.in);
//			
//			while(true) {
//				String msg = scan.nextLine(); 
//				writer.print(msg);
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//}