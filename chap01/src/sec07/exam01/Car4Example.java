package sec07.exam01;

public class Car4Example {

	public static void main(String[] args) {
		
		Car4 car11 = new Car4();
		System.out.println("car11.company : " + car11.company);
		System.out.println();
		
		Car4 car22 = new Car4("자가용");
		System.out.println("car22.company : " + car22.company);
		System.out.println("car22.model : " + car22.model);
		System.out.println();
		
		Car4 car33 = new Car4("자가용", "빨강");
		System.out.println("car33.company : " + car33.company);
		System.out.println("car33.model : " + car33.model);
		System.out.println("car33.color : " + car33.color);
		System.out.println();
		
		Car4 car44 = new Car4("자가용", "빨강", 200);
		System.out.println("car44.company : " + car44.company);
		System.out.println("car44.model : " + car44.model);
		System.out.println("car44.color : " + car44.color);
		System.out.println("car44.maxSpeed : " + car44.maxSpeed);
		System.out.println();
	}

}
