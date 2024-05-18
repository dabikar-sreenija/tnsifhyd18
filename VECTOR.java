package collections;
import java.io.*;
import java.util.*;
public class VECTOR {
public static void main(String[] args) {
	Vector<Integer>v=new Vector<Integer>();
	for(int i=1;i<=5;i++)
		v.add(i);
	System.out.println(v);
	v.remove(4);
	System.out.println(v);
	for(int i=0;i<v.size();i++)
		System.out.println(v.get(i)+" ");
}
}
