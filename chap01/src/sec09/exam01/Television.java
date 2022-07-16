package sec09.exam01;

public class Television implements RemoteControl {
	
	// 필드
	private int volume;
	
	// turnOn( ) 추상 메소드의 실체 메소드
	@Override
	public void turnOn() {
		System.out.println("turn on");
	}

	// turnOff( ) 추상 메소드의 실체 메소드
	@Override
	public void turnOff() {
		System.out.println("turn of");
	}

	// setVolume( ) 추상 메소드의 실체 메소드
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("now volume : " + this.volume);
	}

}
