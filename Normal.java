package com.sree.tns;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;

public class Normal {
	
	int a=10;//instance
	static int b=20;//static
	public static void main(String[] args) {
		int c=30;//local
		System.out.println("c");
		Normal n1=new Normal();//object
		System.out.println("n1.a");
		System.out.println("Normal.b");
		System.out.println("c");
	
		
	}

}
