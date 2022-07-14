package sec07.exam01;

public class Car3Example {

	public static void main(String[] args) {
		
		Car3 car11 = new Car3();
		System.out.println("car11.company : " + car11.company);
		System.out.println();
		
		Car3 car22 = new Car3("자가용");
		System.out.println("car22.company : " + car22.company);
		System.out.println("car22.model : " + car22.model);
		System.out.println();
		
		Car3 car33 = new Car3("자가용" , "빨강");
		System.out.println("car33.company : " + car33.company);
		System.out.println("car33.model : " + car33.model);
		System.out.println("car33.color : " + car33.color);
		System.out.println();
		
		Car3 car44 = new Car3("자가용" , "빨강", 300);
		System.out.println("car44.company : " + car44.company);
		System.out.println("car44.model : " + car44.model);
		System.out.println("car44.color : " + car44.color);
		System.out.println("car44.maxSpeed : " + car44.maxSpeed);
		System.out.println();

	}

}
