import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 2번
public class FileInputTest {

	public static void main(String[] args) {
		// 1_ 읽어올 파일의 파일명을 관리하는 객체 생성
		File file = new File("aaa.txt");
		
		// 2_ 파일과 연결될 무지개 로드(Stream) 만들자!
		// 3_ 그중에서 File 전용이며 데이터를 읽어오는 스트림 : FileInputStream
		
		try {
			// 4_ 해당파일이 없으면 Exception 발생!
			FileInputStream fis = new FileInputStream(file);
			
//			// 5_ 스트림을 통해 파일에서 데이터를 읽어오자!
//			byte b = (byte)fis.read(); // 6_ 파일에서 1바이트만 읽어온다... 반복문이 필요!
//			while(b != -1) { // 7_ read() 특성상 읽을 데이터가 없으면 -1 을 반환.
//				System.out.print((char)b);
//				b = (byte)fis.read(); // 8_ 자동으로 다음 한 바이트를 읽어옴. read() 는 한번 읽어오면 커서가 자동으로 넘어간다! 
//			}
//			System.out.println();
			
			// 9_ 위 방식대로 하면 아스키에 없는 문자들은 이상하게 출력된다. 주석처리하고 다시 만들어보자.
			// 10_ 한글은 2바이트, 받아오는건 1바이트씩 이라서 한글이 깨지니까, 1바이트씩 읽어오지 말고 바이트 배열 덩어리로 한방에 읽어오자.
			// 11_ 스트림으로 읽어온 바이트 배열 덩어리를 저장한 빈 배열이 준비되어 있어야 함.
			byte[] bytes = new byte[1024];
			fis.read(bytes); // 12_ 요 bytes 배열안에 데이터를 넣어준다.
			
			// 13_ byte[] 배열을 String 객체로 변환하자
			String s = new String(bytes);
			System.out.println(s);

			System.out.println("파일 로드가 완료되었습니다.");
			
			fis.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("읽어올 파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("읽기 도중 문제가 발생했습니다.");
		}
		
		
		
	}
}
