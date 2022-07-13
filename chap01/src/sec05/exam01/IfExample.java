package sec05.exam01;

public class IfExample {

	public static void main(String[] args) {
		
		int score = 93;
		
		if (score >= 90) {
			System.out.println("90보다 큼");
			System.out.println("A 등급");
		}
		
		// 조건식이 true 일때 실행할 문장이 하나면  { } 중괄호 생략 가능
		if (score <90) 
			System.out.println("90보다 작음");
			System.out.println("B 등급");
		

	}

}
