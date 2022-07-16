package sec09.exam01;

public class VehicleExample2 {

	public static void main(String[] args) {
		
		Vehicle2 vehicle = new Bus2();
		
		vehicle.run();
		
		// vehicle 인터페이스에는 checkFare() 이 없음
		// vehicle.checkFare();
		
		Bus2 bus = (Bus2)vehicle;
		bus.run();
		bus.checkFare();

	}

}
