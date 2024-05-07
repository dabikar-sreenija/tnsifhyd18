package java8.features;

public class Lambda1 {
	public static void main(String[] args) {
		int width=20;
		Lambda L=()->{
			System.out.println("drawing"+width);
		};
		L.draw();
	}

}
