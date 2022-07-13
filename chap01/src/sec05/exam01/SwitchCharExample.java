package sec05.exam01;

public class SwitchCharExample {

	public static void main(String[] args) {
		
		char grade = 'B';
		
		switch(grade) {
		case 'A' :
		case 'a' :
			System.out.println(" a or A ");
			break;
		case 'B' :
		case 'b' :
			System.out.println(" b or B ");
			break;
		default : 
			System.out.println("none");
		}

	}

}
