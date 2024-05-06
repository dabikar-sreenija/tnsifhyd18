package p2;

public class sclass1 extends sclass{
void eat() {
	System.out.println("eat");
}
void bark() {
	System.out.println("brak");
}
void work() {
	super.eat();
	bark();
}
}
