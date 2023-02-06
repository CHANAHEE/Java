import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutput {

	public static void main(String[] args) {
		
		// 1_ 사용자로 부터 데이터를 입력받아 File 에 저장하는 프로그램
		Scanner scan = new Scanner(System.in);
		System.out.print("저장할 데이터를 입력하세요 : ");
		String data = scan.next();
		data += "\n"; // 16_ 줄바꿈 모드 ㅋ
		File file2 = new File("asdf.txt");
		// 2_ 데이터를 영구적으로 저장할 HDD 는 File 형태로 데이터를 저장함. 
		// 3_ 자 그러면 먼저, File 을 제어하는 클래스부터 객체로 생성해보자.
		File file = new File("aaa.txt"); // 4_ 파일이 저장된 경로(폴더)를 지정하지 않으면 자동으로 현재 프로젝트 폴더에 파일이 저장됨.
		
		// 17_ 내 프로젝트 파일에 저장시키지 말고 다른곳에 저장시켜보자! 즉, 파일 저장 경로를 지정하자!
		file = new File("C:\\Users\\mrhi\\Desktop\\aaa.txt");
		// 18_ 윈도우에서는 역슬래시(\)가 폴더 구분자임. 단, 문자열("") 안에서는 \ 를 특수기호로 처리하기 때문에 2번 써야 \로 인식됨.
		// 19_ 맥 OS 와 리눅스는 경로 구분자로 슬래시(/) 를 사용한다. 단, 윈도우즈는 슬래시도 됨.
		file = new File("kkk/aaa.txt");
		
		// 20_ 폴더가 없으면 자동생성이 안되는데, 다른 사람 컴퓨터에 어떻게 저장시키지?
		// 21_ 프로그램으로 폴더를 만들어보자!
		File path = new File("kkk"); // 22_ . 확장자가 없으면 폴더!
		if(!path.isDirectory()) {
			path.mkdirs(); // 23_ 하위폴더가 있다면 같이 만들어줌. mkdir() 은 하나만 만들어줌. 
		}
		
		// 24_ 내 프로젝트 폴더가 아니라, HDD 의 특정 파티션 영역을 사용할 수 있다.
		path = new File("D:/files/kkk");
		if(!path.isDirectory()) {
			path.mkdirs();
		}
		
		// 25_ 만들어진 폴더와 파일명을 결합하자.
		file = new File(path,"date.txt");
		
		
		// 5_ 파일 객체가 관리하는 경로의 파일에, 위에서 만든 aaa.txt 에 데이터를 보내기 위해서 무지개로드(Stream) 을 생성하자!
		// Stream 중에서 내보내는 방향의 OutputStream 을 사용해보자.
		
		// 6_  그 중에서도 파일 전용으로 설계된 FileOutputStream 을 사용하자. 즉 FileOutputStream 클래스로 객체를 생성해보자!
		
		try {
			// 7_ 만일 파일이 없다면, 자동으로 만들어준다! 있다면 그 파일을 열기만 함. 단, 폴더는 자동생성하지 않음. 즉, 경로에 없는 파일이름이 들어가면 에러!!
			// FileOutputStream fos = new FileOutputStream(file); // 14_ 기본 덮어쓰기 모드
			FileOutputStream fos = new FileOutputStream(file,true); // 15_ append 모드
			//fos.write(65); // 8_ 유니코드 번호를 전달 : 'A' 문자
			// 9_ 지금한 행위가 , 스트림을 통해 데이터를 내보내는 작업을 함.(파일 저장) 또한 다른 글자를 저장하면 덮어쓰기가 실행됨.
			// 10_ 그런데 가급적이면 Stream 버퍼에 찌꺼기가 남아있을수 있으니 비우도록 해주자. 안전하게 사용하려면 write 와 flush 를 한세트처럼 생각해주자.
			
			// 12_ String 을 byte 배열로 바꿔서, 문자열 데이터 보내기
			byte[] bytes = data.getBytes(); // 13_ String -> byte[]
			
			fos.write(bytes);
			fos.flush();
			
			// 11_ 언제나 스트림 작업이 끝나면 스트림 연결을 닫는 작업을 요청하자! 
			fos.close();
			
			fos = new FileOutputStream(file2);
					
			System.out.println("파일 저장 성공!");
		} catch (FileNotFoundException e) {
			System.out.println("저장될 경로가 존재하지 않습니다...");
		} catch (IOException e) {
			System.out.println("쓰기작업 중 오류가 발생했습니다...");
		} 
		

	}

}
