package sec13.exam01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) throws Exception{
		
		// 데이터 도착지를 설정해주는 바이트 기반 출력 스트림 생성
		OutputStream os = new FileOutputStream("C:/Users/kimta/Desktop/eclipse/test1.db");
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		// 1 byte 씩 출력
		os.write(a);
		os.write(b);
		os.write(c);
		
		// 출력 버퍼에 잔류하는 모든 바이트를 출력
		os.flush();
		// 출력 스트림을 닫음
		os.close();

	}

}
