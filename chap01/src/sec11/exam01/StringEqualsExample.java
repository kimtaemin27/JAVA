package sec11.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {
		
		String strVar1 = new String("java");
		String strVar2 = "java";
		
		if(strVar1 == strVar2) {
			System.out.println("smae String 객체");
		} else {
			System.out.println("other String 객체");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("ssmae String");
		} else {
			System.out.println("other String");
		}

	}

}
