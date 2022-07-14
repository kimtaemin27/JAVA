package sec07.exam01;

public class Car5Example {

	public static void main(String[] args) {
		
		Car5 myCar = new Car5();
		
		// Car5  의 setGas() 메소드 호출
		myCar.setGas(5);
		
		// Car의 isLeftGas() 메소드 호출
		boolean gasState = myCar.isLeftGas();
		
		if(gasState) {
			System.out.println("run now");
			// Car5 의 run ( ) 메소드 호출
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("full gas");
		} else {
			System.out.println("need gas");
		}

	}

}
