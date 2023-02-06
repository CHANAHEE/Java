import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOTest {

	public static void main(String[] args) {
		
		// 1_ 파일 복사 프로그램 제작해보자
		// HDD 의 D 드라이브에 있는 하나의 폴더에 들어있는 문서(aaa.txt) 를 읽어서 가져온다음에 D 드라이브에 있는 copy 폴더에 bbb.txt 로 저장해주자.
		// 2_ 원본 파일의 경로와 파일명, 확장자까지 정해보자. 파일경로는 String 으로도 저장 가능!
		String srcPath = "D:/files/aaa.txt";
		
		// 3_ 원본파일과 연결하는 무지개 로드(InputStream) 생성
		try {
			FileInputStream fis = new FileInputStream(srcPath);
			
			// 4_ 읽어들인 파일의 데이터를 곧바로 다른 파일에 내보내기 위해 
			// 새로 만들어질 파일의 저장 경로부터 만들기 
			File path = new File("D:/copy");
			if(!path.isDirectory()) path.mkdir();
			
			// 5_ 저장될 경로와 파일명 확장자 를 결합!
			File dstFile = new File(path,"bbb.txt");
			
			// 6_ 위에 만들어진 파일에 저장하기 위해 연결하는 OutputStream 을 만들자!
			FileOutputStream fos = new FileOutputStream(dstFile);
			
			// 7_ 원본파일인 aaa.txt 에서 데이터를 1바이트씩 반복적으로 읽어오면서
			// 바로바로 목적지 파일인 bbb.txt 파일에 1바이트씩 내보내자.(저장)
			// 출력을 하는게 아니기 때문에 통배열로 받는것은 비효율적.
			
			while(true) {
				byte b =(byte) fis.read();
				if(b == -1) break;
				
				fos.write(b);
			}
			
			// 8_ 스트림을 통해 write() 할때.. 찌꺼기가 남을 수 있으니 ..
			fos.flush();
			
			// 9_ 복사 끝났으니까.. 닫아주자
			fos.close();
			fis.close();
			
			System.out.println("파일 복사 완료!");
		} catch (FileNotFoundException e) {
			System.out.println("불러올 파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("복사중에 오류가 발생했습니다.");
		}
	}

}
