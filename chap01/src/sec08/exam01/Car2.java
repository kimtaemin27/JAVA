package sec08.exam01;

public class Car2 {

	// 필드
	Tire frontLeftTire = new Tire("FrontLeft", 6);
	Tire frontRightTire = new Tire("FrontRight", 2);
	Tire backLeftTire = new Tire("backLeft", 3);
	Tire backRightTire = new Tire("backRinht", 4);

	// 생성자

	// 메소드
	int run() {
		System.out.println("[car run]");
		if(frontLeftTire.roll()==false) {
			stop();
			return 1;
		}
		if(frontRightTire.roll()==false) {
			stop();
			return 2;
		}
		if(backLeftTire.roll()==false) {
			stop();
			return 3;
		}
		if(backRightTire.roll()==false) {
			stop();
			return 4;
		}
		return 0;
	}

	void stop() {
		System.out.println("[car stop]");
	}

}
