package exception;

public class D {
	public static void main(String[] args) {
		try {
			String s = null;
System.out.println(s.length());
		}
		catch(ArithmeticException e) {
		System.out.println("null");
		}
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("null1");
}
		catch(Exception e) {
			System.out.println("null2");
		}
		System.out.println("code.");
	}
}
