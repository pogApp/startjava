public class JaegerTest {
	
	public static void main(String[] args) {
		Jaeger robot1 = new Jaeger();
		robot1.setMark("Mark6");
		robot1.setHeight(81.77d);
		robot1.setWeight(2004.0d);
		robot1.setSpeed(10);
		robot1.setStrength(9);
		robot1.setWeapon("Elbow Rocket 2.0");

		System.out.println("Robot 1");
		System.out.println("Mark: " + robot1.getMark());
		System.out.println("Height: " + robot1.getHeight() + "m");
		System.out.println("Weight: " + robot1.getWeight() + "tons");
		System.out.println("Speed: " + robot1.getSpeed());
		System.out.println("Strength: " + robot1.getStrength());

		robot1.move();
		robot1.useWeapon();

		Jaeger robot2 = new Jaeger();
		robot2.setMark("Mark3");
		robot2.setHeight(79.25d);
		robot2.setWeight(1980.0d);
		robot2.setSpeed(7);
		robot2.setStrength(8);
		robot2.setWeapon("Plasma Cannon");

		System.out.println("Robot 2");
		System.out.println("Mark: " + robot2.getMark());
		System.out.println("Height: " + robot2.getHeight() + "m");
		System.out.println("Weight: " + robot2.getWeight() + "tons");
		System.out.println("Speed: " + robot2.getSpeed());
		System.out.println("Strength: " + robot2.getStrength());

		robot2.move();
		robot2.useWeapon();
	}
}