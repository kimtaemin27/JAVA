package sec08.exam01;

public class Cellphone {
	
	// 필드
	String model;
	String color;
	
	// 생성자
	
	// 메소드
	void powerOn() {System.out.println("power On"); }
	void powerOff() {System.out.println("power Off"); }
	void bell() {System.out.println("ringing"); }
	void sendVoice(String message) {System.out.println("i'm : " +message); }
	void receiveVoice(String message) {System.out.println("other : " + message); }
	void hangUp() {System.out.println("tell off"); }

}
