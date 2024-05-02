package com.sree.tns;

public class Staticmemberes {
	static int A=10;//static variable
	//static method
		static void display() {
			System.out.println(A);
		}
		public static void main(String[] args) {
			System.out.println(Staticmemberes.A);
			Staticmemberes.display();
	
		}
	

}
