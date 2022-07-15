package sec08.exam01;

public class Car2Example {

	public static void main(String[] args) {
		
		Car2 car = new Car2();
		
		for (int i =1; i<5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("FrontLeft HankookTire로 교체");
				car.frontLeftTire = new HankookTire("FrontLeft", 15);
				break;
			case 2:
				System.out.println("FrontRight KumhoTire로 교체");
				car.frontRightTire = new KumhoTire("FrontRight", 13);
				break;
			case 3:
				System.out.println("BackLeft HankookTire로 교체");
				car.backLeftTire = new HankookTire("BackLeft", 14);
				break;
			case 4:
				System.out.println("BackRight KumhoTire로 교체");
				car.backRightTire = new KumhoTire("BackRight", 17);
				break;
			}
			System.out.println("--------------------------------");
		}

	}

}
