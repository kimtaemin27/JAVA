package sec05.exam01;

public class IfDiceExample {

	public static void main(String[] args) {
		
		int num = (int)(Math.random() * 6) + 1;
		
		if (num == 1) {
			System.out.println("1 번");
		} else if(num == 2) {
			System.out.println("2 번");
		} else if(num == 3) {
			System.out.println("3 번");
		} else if(num == 4) {
			System.out.println("4 번");
		} else if(num == 5) {
			System.out.println("5 번");
		} else {
			System.out.println("6 번");
		}

	}

}
