package collections;
import java.util.*;
public class STACK {
	public static void main(String[] args) {
	Stack<String>s=new Stack<String>();
	s.push("Geeks");
	s.push("for");
	s.push("Geeks");
	s.push("Geeks");
	Iterator<String>itr=s.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next()+"");
	}
	System.out.println();
	s.pop();
	itr=s.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next()+"");
	}
	}

}
