package sec05.exam01;

public class SwitchExample {

	public static void main(String[] args) {
		
		// +1 은 번호를 하나 뽑는다는 의미
		int num = (int)(Math.random() * 6) +1;
		
		switch(num) {
		case 1:
			System.out.println("1번");
			break;
		case 2:
			System.out.println("2번");
			break;
		case 3:
			System.out.println("3번");
			break;
		case 4:
			System.out.println("4번");
			break;
		case 5:
			System.out.println("5번");
			break;
		case 6:
			System.out.println("6번");
			break;
		}

	}

}
