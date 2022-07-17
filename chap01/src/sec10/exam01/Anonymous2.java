package sec10.exam01;

public class Anonymous2 {
	
	// 필드 초기값으로 대입
	RemoteControl field = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("trun on");
		}
		
		@Override
		public void turnOff() {
			System.out.println("trun off");
		}
	};
	
	void method1() {
		
		// 로컬 변수값으로 대입
		RemoteControl localVar = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("turn on Audio");
				
			}

			@Override
			public void turnOff() {
				System.out.println("turn off Audio");
			}
			
		};
		
		// 로컬 변수 사용
		localVar.turnOn();

	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
	}

}
