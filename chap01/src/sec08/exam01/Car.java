package sec08.exam01;

public class Car {
	
	// 필드
	public int speed;
	
	// 메소드 
	public void speedUp() {
		speed += 1;
	}
	
	// final 메소드
	public final void stop() {
		System.out.println("stop car");
		speed = 0;
	}

}
