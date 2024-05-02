package com.sree.tns;

public class car2gettersetter {
	private String doors;
	private String engine;
	private String drivers;
	private int speed;
	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getDrivers() {
		return drivers;
	}
	public void setDrivers(String drivers) {
		this.drivers = drivers;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public static void main(String[] args) {
		car2gettersetter c2=new car2gettersetter();
		c2.setSpeed(40);
		System.out.println(c2.getSpeed());
		c2.setDoors("closed");
		System.out.println(c2.getDoors());
		c2.setEngine("on");
		System.out.println(c2.getEngine());
		c2.setDrivers("seated");
		System.out.println(c2.getDoors());
	}

}
