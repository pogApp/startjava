public class WolfTest {
	
	public static void main(String[] args) {
		Wolf wolfLana = new Wolf();

		wolfLana.nickname = "Lana";
		System.out.println("nickname: " + wolfLana.nickname);

		wolfLana.gender = "girl";
		System.out.println("It is a " + wolfLana.gender);

		wolfLana.color = "gray";
		System.out.println("She is " + wolfLana.color);

		wolfLana.age = 4;
		System.out.println("She is " + wolfLana.age + " years old");

		wolfLana.sit();
		wolfLana.howl();
		System.out.println(wolfLana.hunt());
	}
}