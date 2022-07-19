package sec13.exam01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample3 {

	public static void main(String[] args) throws Exception{
		
		// 데이터 도착지를 설정해주는 바이트 기반 출력 스트림 생성
		OutputStream os = new FileOutputStream("C:/Users/kimta/Desktop/eclipse/test3.db");
		
		byte [] array = {10, 20, 30, 40, 50};
		
		// 배열의 1번 인덱스 부터 3개를 출력
		os.write(array, 1, 3);
		
		// 출력 버퍼에 잔류하는 모든 바이트를 출력
		os.flush();
		// 출력 스트림을 닫음
		os.close();

	}

}
