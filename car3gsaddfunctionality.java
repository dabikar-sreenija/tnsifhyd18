package com.sree.tns;

public class car3gsaddfunctionality {
	private String doors;
	private String engine;
	private String driver;
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
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String run() {
		if(doors.equals("closed")&& engine.equals("on")&& driver.equals("seated")&& speed>0) {
			return("car is running");
		}
			else {
				return("car is not running");
			}
		}
	public static void main(String[] args) {
		car3gsaddfunctionality c3=new car3gsaddfunctionality();
		c3.setSpeed(10);
		c3.setDoors("closed");
		c3.setEngine("on");
		c3.setDriver("seated");
		System.out.println(c3.run());
	}
	}


