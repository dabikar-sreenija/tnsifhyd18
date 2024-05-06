package p1;

public class dog implements pet{
public void test() {
	System.out.println("interface1");
}
public static void main(String[] args) {
	pet obj=new dog();
	obj.test();
}
}
