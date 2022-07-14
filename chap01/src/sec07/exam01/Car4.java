package sec07.exam01;

public class Car4 {
	
	// 필드
	String company = "현대 자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자
	Car4() {
		
	}
	
	Car4(String model) {
		this(model, "은색", 250);
	}
	
	Car4(String model, String color) {
		this(model, color, 250);
	}
	
	// 아래 호출
	
	Car4(String model, String color, int maxSpeed) {
		// 공통 실행 코드 시작
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		// 공통 실행 코드 끝
	}

}
