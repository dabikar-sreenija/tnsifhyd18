package java8.features;

public class Lmultipleparameters1 {
public static void main(String[] args) {
	Lmultipleparameters L1=(int a,int b)->{
		return a+b;
	};
	System.out.println(L1.add(1300, 1200));
}
}
