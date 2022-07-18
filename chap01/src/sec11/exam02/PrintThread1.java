package sec11.exam02;

public class PrintThread1 extends Thread {
	
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	public void run() {
		while(!stop) {
			System.out.println("run");
		}
		System.out.println("정리");
		System.out.println("종료");
	}

}
