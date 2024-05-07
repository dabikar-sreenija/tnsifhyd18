package java8.features;

public class Lambda3 {
public static void main(String[] args) {
	Lambda2 S=()->{
		return "sree";
	};
	System.out.println(S.say());
}
}
