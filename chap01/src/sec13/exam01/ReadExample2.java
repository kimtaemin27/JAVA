package sec13.exam01;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {

	public static void main(String[] args) throws Exception{
		
		// 바이트 기반 파일 입력 스트림 생성
		InputStream is = new FileInputStream("C:/Users/kimta/Desktop/eclipse/test2.db");
		
		// 길이 100인 배열 생성
		byte [] buffer = new byte[100];
		while(true) {
			
			// 배열 길이만큼 일기
			int readByteNum = is.read(buffer);
			
			// 파일 끝에 도달했을 경우
			if(readByteNum == -1) break;
			
			// 읽은 바이트 수만큼 반복하면서 배열에 저장된 바이트를 출력
			for(int i=0; i<readByteNum; i++) {
				System.out.println(buffer[i]);
			}
			
		}
		
		// 입력 스트림 닫기
		is.close();

	}

}
