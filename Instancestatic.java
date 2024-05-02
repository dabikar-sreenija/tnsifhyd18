package com.sree.tns;

public class Instancestatic {
	int A= 13;//instance variable
	static short B= 15;//static variable
	void display() {
		System.out.println(A);
		System.out.println(B);
	}
public static void main(String[] args) {
	Instancestatic n1=new Instancestatic();//object
	n1.display();
	
}
}
