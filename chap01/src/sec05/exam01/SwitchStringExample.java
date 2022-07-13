package sec05.exam01;

public class SwitchStringExample {

	public static void main(String[] args) {
		
		String position = "에이";
		
		switch(position) {
		case "에이" :
			System.out.println("A");
			break;
		case "비" :
			System.out.println("B");
			break;
		default :
			System.out.println("C");
		}

	}

}
