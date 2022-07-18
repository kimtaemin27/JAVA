package sec11.exam02;

public class PrintThread2 extends Thread {

	public void run() {
		try {
			while(true) {
				System.out.println("run");
				Thread.sleep(1);
			}
		} catch (InterruptedException e) {
			
		}
		System.out.println("정리");
		System.out.println("종료");
	}
	
	

}
