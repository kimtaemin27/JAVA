package sec11.exam02;

public class BeepPrintExample4 {

	public static void main(String[] args) {
		
		Thread thread = new BeepThread();
		
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("bbbbbbbbbbbb");
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				
			}
		}

	}

}
