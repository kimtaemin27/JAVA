package sec13.exam01;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample6 {

	public static void main(String[] args) throws Exception {

		// 문자 기반 파일 입력 스트림 생성
		Reader reader = new FileReader("C:/Users/kimta/Desktop/eclipse/test9.db");

		// 길이 5 인 배열 생성
		char[] buffer = new char[5];

		// 입력 스트림으로 3개의 문자에 읽고 2번 인덱스 부터 3개 각각 저장
		int readCharNum = reader.read(buffer, 2, 3);
		// 읽은 문자가 있다면
		if (readCharNum != -1) {
			// 읽은 문자 수만큼 반복하면서 배열에 저장된 문자를 출력
			for (int i = 0; i < buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}

		reader.close();

	}

}
