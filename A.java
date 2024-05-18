package multithreading;



public class A extends Thread {
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println("Thread"+Thread.currentThread().getId()+"is running");
			}
		}
		catch(Exception e) {
			System.out.println("Exception");
		}
	}
public static void main(String[] args) {
	A obj=new A();
	obj.start();
	for(int i=0;i<5;i++) {
		System.out.println("main thread"+Thread.currentThread().getId()+"is running");
	}
}
}
