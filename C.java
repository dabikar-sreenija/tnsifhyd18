package exception;

public class C {

	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			System.out.println(a[10]);
		}
		catch(ArithmeticException e){
			System.out.println("arithmetic");
		}
		catch(ArrayIndexOutOfBoundsException e) {
System.out.println("out of index");
	}
catch(Exception e) {
	System.out.println("parent exception");
}
		System.out.println("code....");
}}
