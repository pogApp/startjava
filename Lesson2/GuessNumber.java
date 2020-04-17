import java.util.Scanner;
public class GuessNumber {
	private int randomNumber;
	public GuessNumber(int y) {
		randomNumber = y;
	}
	private String resume = "yes";

	public void setResume(String resume) {
		this.resume = resume;
	}

	public String getResume() {
		return resume;
	}

	public void check(int p1Num, int p2Num, String p1Name, String p2Name) {
		if(p1Num == randomNumber && p2Num == randomNumber){
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
	}
}