package com.startjava.lesson2.wolf;

public class Wolf {

	private String gender = "unknown gender";
	private String nickname = "unknown nickname";
	private float weight = 63.5f;
	private int age = 6;
	private String color = "unknown color";

	public String getNickname() {
		return nickname;
	}

	void setNickname(String nickname) {
		if(nickname == ""){
			System.out.println("Nickname can not be empty");
		} else {
			this.nickname = nickname;
		}
	}

	public String getGender() {
		return gender;
	}

	void setGender(String gender) {
		if(gender != "boy" && gender != "girl") {
			System.out.println("Gender must be 'boy' or 'girl'");
		} else {
			this.gender = gender;
		}
	}

	public float getWeight() {
		return weight;
	}

	void setWeight(float weight) {
			this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	void setAge(int age) {
		if(age > 8) {
			System.out.println("Age is incorrect");
		} else {
			this.age = age;
		}
	}

	public String getColor() {
		return color;
	}
	
	void setColor(String color) {
		this.color = color;
	}

	public boolean move() {
		System.out.println(nickname + " started to go");
		return true;
	}

	public boolean sit() {
		System.out.println(nickname + " sat down");
		return true;
	}

	public boolean run() {
		System.out.println(nickname + " started to run");
		return true;
	}

	public void howl() {
		System.out.println(nickname + ": HOWLOOWOOOOOOO...");
	}

	public String hunt() {
		System.out.println(nickname + " began the hunt");
		return "3 chickens";
	}
}