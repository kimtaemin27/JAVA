package sec07.exam02;

public class Car4Example {

	public static void main(String[] args) {
		
		Car4 myCar = new Car4();
		
		// 잘못된 속도 변경
		myCar.setSpeed(-50);
		
		System.out.println("now speed : " +myCar.getSpeed());
		
		// 올바른 속도 변경
		myCar.setSpeed(60);
		
		// 멈춤
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("now speed : " + myCar.getSpeed());

	}

}
