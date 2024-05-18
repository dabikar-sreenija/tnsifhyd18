package collections;
import java.util.*;
public class Set {
public static void main(String[] args) {
	HashSet<String>hs=new HashSet<String>();
	hs.add("geeks");
	hs.add("for");
    hs.add("is");
    hs.add("very helpful");
    Iterator<String>itr=hs.iterator();
    while(itr.hasNext()) {
    	System.out.println(itr.next());
    }
}
}
