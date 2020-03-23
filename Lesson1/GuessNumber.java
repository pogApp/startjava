public class GuessNumber {
    public static void main(String[] args) {
        int randomNum = 60;
        int ourNum = 60;

        if (ourNum > randomNum) {
            System.out.println("Your number is bigger that computer random number");
        } else if (ourNum < randomNum) {
            System.out.println("Your number is smaller that computer random number");
            } else {
                System.out.println("You are right!");
                }
    }
}