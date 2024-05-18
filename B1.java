package multithreading;

public class B1 {
	public static void main(String[] args) {
		A obj=new A();
		obj.start();
		for(int i=0;i<10;i++) {
			System.out.println("main thread id:"+Thread.currentThread().getId());
		}
	}

}
