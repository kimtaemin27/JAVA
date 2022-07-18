package sec11.exam01;

public class StringSubstringExample {

	public static void main(String[] args) {
		
		String ssn = "121212-1212121";
		
		String firstNum = ssn.substring(0,6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
		
	}

}
