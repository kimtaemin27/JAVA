package sec13.exam01;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample7 {
	public static void main(String [] args) throws Exception {
		
		// 문자 기반 파일 출력 스트림 생성
		Writer writer = new FileWriter("C:/Users/kimta/Desktop/eclipse/test10.db");
		
		String str = "ABC";
		
		// 문자열 전체를 출력
		writer.write(str);
		
		// 출력 버퍼에 잔류하는 모든 문자를 출력
		writer.flush();
		// 출력 스트림을 닫음
		writer.close();
		
	}
}
