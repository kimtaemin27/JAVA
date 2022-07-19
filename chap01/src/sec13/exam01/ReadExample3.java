package sec13.exam01;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample3 {

	public static void main(String[] args) throws Exception{
		
		// 바이트 기반 파일 입력 스트림 생성
		InputStream is = new FileInputStream("C:/Users/kimta/Desktop/eclipse/test3.db");
		
		// 길이 100인 배열 생성
		byte [] buffer = new byte[5];
		
		// 입력 스트림으로 부터 3byte를 읽고 buffer[2] buffer[3] buffer[4] 에 각각 저장
		int readByteNum = is.read(buffer, 2, 3);
		
		// 읽은 바이트가 있다면
		if(readByteNum != -1) {
			// 배열 전체를 읽고 출력
			for(int i=0; i<buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		
		// 입력 스트림 닫기
		is.close();

	}

}
