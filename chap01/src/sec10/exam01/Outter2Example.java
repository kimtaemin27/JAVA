package sec10.exam01;

public class Outter2Example {

	public static void main(String[] args) {
		
		Outter2 outter = new Outter2();
		
		Outter2.Nested nested = outter.new Nested();
		nested.print();
	}

}
