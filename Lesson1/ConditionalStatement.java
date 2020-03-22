public class ConditionalStatement{
    public static void main(String[] args) {
    	int age = 27;
    	boolean areMale = true;
    	float heig = 1.87f;
    	char fLetter = 'D';
    	if (age>20) {
    		System.out.println("You need a sand scoop");
    	}
    	if (areMale) {
    		System.out.println("You are male");
    	}
    	if (!areMale) {
    		System.out.println ("Oh, no, no, no, no");
    	}
    	if (heig < 1.80){
    		System.out.println ("Look up");
    	}
    	if (fLetter == 'M') {
    		System.out.println ("You are Maxim");
    	} else if (fLetter == 'I') {
    		System.out.println ("You are Igor");
    	} else {
    		System.out.println ("You are Denis");
    	}
    }
} 