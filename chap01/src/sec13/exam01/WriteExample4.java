package sec13.exam01;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample4 {
	public static void main(String [] args) throws Exception {
		
		// 문자 기반 파일 출력 스트림 생성
		Writer writer = new FileWriter("C:/Users/kimta/Desktop/eclipse/test7.db");
		
		char a = 'A';
		char b = 'B';
		char c = 'C';
		
		// 한 문자씩 출력
		writer.write(a);
		writer.write(b);
		writer.write(c);
		
		// 출력 버퍼에 잔류하는 모든 문자를 출력
		writer.flush();
		// 출력 스트림 닫기
		writer.close();
		
	}
}
