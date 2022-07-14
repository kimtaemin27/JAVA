package sec07.exam01;

public class Car3 {
	
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	
	// 생성자 1
	Car3(){
		
	}
	
	// 생성자 2
	Car3(String model) {
		this.model = model;
	}
	
	// 생성자 3
	Car3(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	// 생성자 4
	Car3(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
