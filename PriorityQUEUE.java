package collections;
import java.util.*;
public class PriorityQUEUE {
public static void main(String[] args) {
	PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
	pq.add(10);
	pq.add(20);
	pq.add(15);
	System.out.println(pq.peek());//prints the top element
	System.out.println(pq.poll());//prints the top element and removes it
	System.out.println(pq.peek());
}
}
