package sec13.exam01;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample4 {

	public static void main(String[] args) throws Exception{
		
		// 문자 기반 파일 입력 스트림 생성
		Reader reader = new FileReader("C:/Users/kimta/Desktop/eclipse/test7.db");
		
		while(true) {
			// 한 문자씩 읽기
			int data = reader.read();
			// 문자 끝에 도달했을 경우
			if(data == -1) break;
			System.out.println((char)data);
		}
		
		// 입력 스트림을 닫음
		reader.close();

	}

}
