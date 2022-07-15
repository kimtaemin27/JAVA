package sec08.exam01;

public class Tire {
	
	// 필드
	public int maxRotation;
	public int accumulateRoatation;
	public String location;
	
	// 생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	// 메소드
	public boolean roll() {
		++accumulateRoatation;
		if(accumulateRoatation < maxRotation) {
			System.out.println(location + "Tire 수명 : " +(maxRotation - accumulateRoatation) + " 회");
			return true;
		} else {
			System.out.println("***" + location + "Tire 펑크 ***");
			return false;
		}
	}

}
