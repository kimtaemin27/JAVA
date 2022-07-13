package sec05.exam01;

public class SwitchNoBreakExample {

	public static void main(String[] args) {

		// 8 부터 11 사이의 정수 가져오기
		int time = (int)(Math.random() * 4) + 8;
		System.out.println("[ 현재시각 : " + time + " 시 ]");
		
		switch(time) {
		case 8 :
			System.out.println("8 시");
		case 9 :
			System.out.println("9 시");
		case 10 :
			System.out.println("10 시");
		default :
			System.out.println("11 시");
		}

	}

}
