package exception;

public class B {

	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			a[5]=30/0;
		}
catch(ArithmeticException e) {
	System.out.println(e);
}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println("parent exception occurs");
		}
		System.out.println("rest of the code....");
	}
}
