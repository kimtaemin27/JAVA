package sec10.exam01;

public class Anonymous2Example {

	public static void main(String[] args) {
		
		Anonymous2 anony = new Anonymous2();
		
		// 익명 객체 필드 사용
		anony.field.turnOn();
		
		// 익명 객체 로컬 변수 사용
		anony.method1();
		
		// 익명 객체 매개값 사용
		anony.method2(
				new RemoteControl() {

					@Override
					public void turnOn() {
						System.out.println("trun on smart Tv");
					}

					@Override
					public void turnOff() {
						System.out.println("trun off smart Tv");
					}
					
				}
				);
	}

}
