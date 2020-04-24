package com.startjava.lesson2_3_4.jaeger;

public class Jaeger {

	private String mark;
	private double height;
	private double weight;
	private int speed;
	private int strength;
	private String weapon;

	void setMark(String mark) {
		this.mark = mark;
	}

	public String getMark() {
		return mark;
	}

	void setHeight(double height) {
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	void setWeight(double weight) {
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	void setStrength(int strength) {
		this.strength = strength;
	}

	public int getStrength() {
		return strength;
	}

	void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public void useWeapon() {
		if (weapon != "null" && mark != "null") {
			System.out.println(mark + " started using " + weapon);
		} else {
			System.out.println("Unknown mark of the robot or robot don't have any weapon");
		}
	}

	public void move() {
		if (speed > 0) {
			System.out.println(mark + " started moving with speed " + speed);
		} else if (speed < 0 ) {
			System.out.println("This robot has wrong speed!");
		} else {
			System.out.println("This robot has speed 0. It can't move.");
		}
	}

}