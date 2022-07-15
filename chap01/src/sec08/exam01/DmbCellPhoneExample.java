package sec08.exam01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		
		// DmbCellPhone 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("Java" , "black" , 10);
		
		// CellPhone 클래스로부터 상속받은 필드
		System.out.println("model : " +dmbCellPhone.model);
		System.out.println("color : " + dmbCellPhone.color);
		
		// dmbCellPhone 클래스의 필드
		System.out.println("channel : " + dmbCellPhone.channel);
		
		// CellPhone 클래스로 부터 상속받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("How are you");
		dmbCellPhone.receiveVoice("Hi i'm taemin kim");
		dmbCellPhone.sendVoice("ah nice to meet you");
		dmbCellPhone.hangUp();
		
		// DmbCellPhone 클래스의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();

	}

}
