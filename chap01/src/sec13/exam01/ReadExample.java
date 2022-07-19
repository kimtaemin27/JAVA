package sec13.exam01;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) throws Exception{
		
		// 바이트 기반 파일 입력 스트림 생성
		InputStream is = new FileInputStream("C:/Users/kimta/Desktop/eclipse/test1.db");
		
		while(true) {
			// 1byte 씩 읽기
			int data = is.read();
			// 파일 끝에 도달했을 경우
			if(data == -1) break;
			System.out.println(data);
			
		}
		
		// 입력 스트림 닫기
		is.close();

	}

}
