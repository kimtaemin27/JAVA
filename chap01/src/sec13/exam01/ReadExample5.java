package sec13.exam01;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample5 {

	public static void main(String[] args) throws Exception{
		
		// 문자 기반 파일 입력 스트림 생성
		Reader reader = new FileReader("C:/Users/kimta/Desktop/eclipse/test8.db");
		
		// 길이 100 인 배열 생성
		char [] buffer = new char[100];
		
		while(true) {
			// 배열 길이만큼 읽기
			int readCharNum = reader.read(buffer);
			// 파일 끝에 도달했을 경우
			if(readCharNum == -1) break;
			// 읽은 문자 수만큼 반복하면서 배열에 저장된 문자를 출력
			for(int i=0; i<readCharNum; i++) {
				System.out.println(buffer[i]);
			}
		}
		
		reader.close();

	}

}
