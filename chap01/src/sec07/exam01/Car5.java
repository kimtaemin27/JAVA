package sec07.exam01;

public class Car5 {
	
	// 필드
	int gas;
	
	// 생성자
	
	// 메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("no gas");
			return false;
		}
		System.out.println("in gas");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("run(in gas : " + gas + " )");
				gas -=1;
			} else {
				System.out.println("stop ( in gas : " +gas + " )");
				return;
			}
		}
	}

}
