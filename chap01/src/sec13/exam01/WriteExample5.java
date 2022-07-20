package sec13.exam01;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample5 {
	public static void main(String [] args) throws Exception {
		
		// 문자 기반 파일 출력 스트림 생성
		Writer writer = new FileWriter("C:/Users/kimta/Desktop/eclipse/test8.db");
		
		char [] array = {'A', 'B', 'C'};
		
		// 배열의 모든 문자를 출력
		writer.write(array);
		
		// 출력 버퍼에 잔류하는 모든 문자를 출력
		writer.flush();
		// 출력 스트림을 닫음
		writer.close();
		
	}
}
