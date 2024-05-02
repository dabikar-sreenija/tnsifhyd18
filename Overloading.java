package com.sree.tns;

public class Overloading {
	//instance methods
	void display(int x) {
		System.out.println("instance method:"+x);
	}
	void display(String S) {
		System.out.println("instance method:"+S);
		}
	//static methods
	static void displaystatic(int x) {
		System.out.println("static method:"+x);
		}
    static void displaystatic(String S) {
    	System.out.println("static method:"+S);
    }
    public static void main(String[] args) {
		Overloading n=new Overloading();//object
		n.display(13);
		n.display("sreenija");
		Overloading.displaystatic(12);
		Overloading.displaystatic("ajineers");
	}
}
