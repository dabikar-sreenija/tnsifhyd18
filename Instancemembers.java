package com.sree.tns;

public class Instancemembers {
	int a=10;//instance variable
	//instance method
	void display()
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		Instancemembers i = new Instancemembers();//object
		System.out.println("ïnstance variable:");
		i.display();
	}

}
