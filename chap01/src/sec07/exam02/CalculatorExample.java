package sec07.exam02;

public class CalculatorExample {

	public static void main(String[] args) {
		
		Calculator myCalcu = new Calculator();
		
		// 정사각형의 넓이 구하기
		double result1 = myCalcu.areaRectangle(10);
		
		// 직사각형의 넓이 구하기
		double result2 = myCalcu.areaReactangle(10, 20);
		
		// 결과
		System.out.println("정사각형의 넓이 : " +result1);
		System.out.println("직사각형의 넓이 : "  +result2);

	}

}
