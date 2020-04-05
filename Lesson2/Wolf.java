public class Wolf {

	String gender = "boy";
	String nickname = "Jack";
	float weight = 63.5f;
	int age = 6;
	String color = "white";

	boolean move() {
		System.out.println(nickname + " started to go");
		return true;
	}

	boolean sit() {
		System.out.println(nickname + " sat down");
		return true;
	}

	boolean run() {
		System.out.println(nickname + " started to run");
		return true;
	}

	void howl() {
		System.out.println(nickname + ": HOWLOOWOOOOOOO...");
	}

	String hunt() {
		System.out.println(nickname + " began the hunt");
		return "3 chickens";
	}
}