import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the name of the first Player: ");
		Player p1 = new Player(scan.nextLine());
		System.out.print("Enter the name of the second Player: ");
		Player p2 = new Player(scan.nextLine());
		System.out.println("Okay! " + p1.getName() + " and " + p2.getName() + ", let's play!");

		GuessNumber play = new GuessNumber(p1.getName(), p2.getName());
		play.game();
	}
}