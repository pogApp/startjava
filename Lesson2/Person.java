public class Person {
	
	char gender = 'M';
	String name = "Arndold";
	float height = 1.91f;
	float weight = 91.5f;
	int age = 32;

	boolean move() {
		System.out.println(name + " started to go");
		return true;
	}

	boolean sit() {
		System.out.println(name + " sat down");
		return true;
	}

	boolean run() {
		System.out.println(name + " started to run");
		return true;
	}

	void talk() {
		System.out.prinln("Get out of this! That is the bomb is there!");
	}

	String learnJava() {
		return "success";
	}
}