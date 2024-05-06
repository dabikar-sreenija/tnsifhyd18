package p2;

public class fvar {
	final int speedlimit=30;
	void run() {
		System.out.println(speedlimit);
	}
	public static void main(String[] args) {
		fvar obj=new fvar();
obj.run();
		
	}

}
//we used final keyword so,we assigned the value only once to the fixed variable(it became constant)