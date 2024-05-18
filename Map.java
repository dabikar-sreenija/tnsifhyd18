package collections;
import java.util.*;
import java.util.Map.Entry;
public class Map {
public static void main(String[] args) {
	HashMap<Integer,String>hm=new HashMap<Integer,String>();
	hm.put(1, "geeks");
	hm.put(2, "for");
	hm.put(3, "geeks");
	System.out.println("value for 1 is:"+hm.get(1));
	for(Entry<Integer, String> e:hm.entrySet())
		System.out.println(e.getKey()+" "+e.getValue());
}
}
