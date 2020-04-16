import java.util.Scanner;
public class GuessNumberTest {
	public static void main(String[] args) {
		int randomNumber = 50;
		//int randomNumber = (int) (Math.random() * 101);
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the name of the first Player: ");
		Player p1 = new Player(scan.nextLine());
		System.out.print("Enter the name of the second Player: ");
		Player p2 = new Player(scan.nextLine());
		System.out.println("Okay! " + p1.getName() + " and " + p2.getName() + ", let's play!");


		GuessNumber game = new GuessNumber(randomNumber);
		while (game.getResume() == "yes") {
			System.out.println(p1.getName() + ", enter the number:");
			p1.setPlayerNum(scan.nextInt());
			System.out.println(p2.getName() + ", enter the number:");
			p2.setPlayerNum(scan.nextInt());
			game.check(p1.getPlayerNum(), p2.getPlayerNum(), p1.getName(), p2.getName());
			while ((game.getResume() != "yes") || (game.getResume() != "no")) {
				System.out.println(game.getResume());
				System.out.println("Want to resume? 'yes' or 'no'");
				game.setResume(scan.next());
				System.out.println(game.getResume());
			}
		}
	}
}