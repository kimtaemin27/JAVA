package sec09.exam01;

public class Bus2 implements Vehicle2 {

	@Override
	public void run() {
		System.out.println("run Bus2");
	}
	
	public void checkFare() {
		System.out.println("pay check");
	}

}
