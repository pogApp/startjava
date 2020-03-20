public class Lucky{
    public static void main(String[] args) {
    	int RandomNum = 60;
    	int OurNum = 60;
    	if (OurNum>RandomNum){
    		System.out.println("Your number is bigger that computer random number");
    	} else {
    		if (OurNum<RandomNum){
    			System.out.println("Your number is smaller that computer random number");
    		}
    		else {
    			System.out.println("You are right!");
    		}
    	}
    }
} 