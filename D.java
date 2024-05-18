package multithreading;

public class D extends Thread {
public void run() {
	for(int i=1;i<=5;i++) {
		try {
	Thread.sleep(500);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	
	System.out.println(i);
	}
}
public static void main(String[] args) {
	D t1=new D();
	t1.start();
}
}
