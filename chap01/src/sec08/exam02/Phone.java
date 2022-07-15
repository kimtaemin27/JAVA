package sec08.exam02;

public abstract class Phone {
	
	// 필드
	public String owner;
	
	// 생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	// 메소드
	public void turnOn() {
		System.out.println("turn on");
	}
	
	public void turnOff() {
		System.out.println("turn off");
	}

}
