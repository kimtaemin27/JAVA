package sec11.exam02;

public class ThreadNameExample {

	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();
		System.out.println("start Thread Name : " + mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("running Thread Name : " + threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("runngin Thread Name : " + threadB.getName());
		threadB.start();

	}

}
