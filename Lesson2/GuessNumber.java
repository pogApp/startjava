import java.util.Scanner;

public class GuessNumber {
	private int randomNumber = (int) (Math.random() * 101);
	private Player p1;
	private Player p2;
	private int p1Num;
	private int p2Num;
	private String resume = "yes";

	public String getResume() {
		return resume;
	}

	public void setResume(String resume){
		this.resume = resume;
	}

	public GuessNumber(Player pl1, Player pl2) {
		p1 = pl1;
		p2 = pl2;
	}

	private Scanner scan = new Scanner(System.in);

	public void start() {
		System.out.println(p1.getName() + ", enter the number:");
		p1.setPlayerNum(scan.nextInt());
		System.out.println(p2.getName() + ", enter the number:");
		p2.setPlayerNum(scan.nextInt());
		if (p1.getPlayerNum() == randomNumber && p2.getPlayerNum() == randomNumber) {
			System.out.println("Both of you are right! It is " + randomNumber + ". Congratulations!");
			resume = "no";
		} else if (p1.getPlayerNum() == randomNumber) {
			System.out.println(p1.getName() + ", you are right! It is " + randomNumber + ". Congratulations!");
			resume = "no";
		} else if (p2.getPlayerNum() == randomNumber) {
			System.out.println(p2.getName() + ", you are right! It is " + randomNumber + ". Congratulations!");
			resume = "no";
		} else {
			if (p1.getPlayerNum() > randomNumber) {
				System.out.println(p1.getName() + ", your number is too big");
			} else {
				System.out.println(p1.getName() + ", your number is too small");
			}
			if (p2.getPlayerNum() > randomNumber) {
				System.out.println(p2.getName() + ", your number is too big");
			} else {
				System.out.println(p2.getName() + ", your number is too small");
			}
			resume = "question";
		}
	}
}