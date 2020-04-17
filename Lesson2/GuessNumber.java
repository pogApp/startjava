import java.util.Scanner;

public class GuessNumber {
	private int randomNumber = (int) (Math.random() * 101);
	String p1Name;
	String p2Name;

	public GuessNumber(String p1, String p2) {
		p1Name = p1;
		p2Name = p2;
	}

	private String resume = "yes";
	int p1Num;
	int p2Num;
	Scanner scan = new Scanner(System.in);

	public void game() {
		while ("yes".equals(resume)) {
			System.out.println(p1Name + ", enter the number:");
			p1Num = scan.nextInt();
			System.out.println(p2Name + ", enter the number:");
			p2Num = scan.nextInt();
			if (p1Num == randomNumber && p2Num == randomNumber) {
				System.out.println("Both of you are right! It is " + randomNumber + ". Congratulations!");
				resume = "no";
			} else if (p1Num == randomNumber) {
				System.out.println(p1Name + ", you are right! It is " + randomNumber + ". Congratulations!");
				resume = "no";
			} else if (p2Num == randomNumber) {
				System.out.println(p2Name + ", you are right! It is " + randomNumber + ". Congratulations!");
				resume = "no";
			} else {
				if (p1Num > randomNumber) {
					System.out.println(p1Name + ", your number is too big");
				} else {
					System.out.println(p1Name + ", your number is too small");
				}
				if (p2Num > randomNumber) {
					System.out.println(p2Name + ", your number is too big");
				} else {
					System.out.println(p2Name + ", your number is too small");
				}
				resume = "question";
			}
			while (!"yes".equals(resume) && !"no".equals(resume)) {
				System.out.println("Want to resume? 'yes' or 'no'");
				resume = scan.next();
			}
		}
	}
}