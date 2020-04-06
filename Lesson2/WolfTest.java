public class WolfTest {
	
	public static void main(String[] args) {
		Wolf wolfLana = new Wolf();

		wolfLana.setNickname("Lana");
		System.out.println("nickname: " + wolfLana.getNickname());

		wolfLana.setGender("girl");
		System.out.println("It is a " + wolfLana.getGender());

		wolfLana.setAge(4);
		System.out.println("She is " + wolfLana.getAge() + " years old");

		wolfLana.setColor("gray");
		System.out.println("She is " + wolfLana.getColor());

		wolfLana.sit();
		wolfLana.howl();
		System.out.println(wolfLana.hunt());
	}
}