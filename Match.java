package com.sree.tns;

public class Match {
	String batsman = "virat koheli";//instance variable
	static String bowler = "bhuvie";//static variable
	void display() {
		System.out.println("name of the batsman");
	}
static String display1() {
	return("name of the bowler");
}
	public static void main(String[] args) {
		Match m1=new Match();//object
		System.out.println(m1.batsman);//instance method
		m1.display();
		System.out.println(Match.bowler);//static method
		System.out.println(Match.display1());
		// TODO Auto-generated method stub

	}

}
