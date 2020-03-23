public class ConditionalStatement {
    public static void main(String[] args) {
    	int age = 27;
    	if (age > 20) {
    		System.out.println("You need a sand scoop");
    	}

        boolean isMale = true;
    	if (isMale) {
    		System.out.println("You are male");
    	}
    	if (!isMale) {
    		System.out.println ("Oh, no, no, no, no");
    	}

        float height = 1.87f;
    	if (height < 1.80) {
    		System.out.println ("Look up");
    	} else {
            System.out.println ("You're tall");
        }

        char firstNameLetter = 'D';
    	if (firstNameLetter == 'M') {
    		System.out.println ("You are Maxim");
    	} else if (firstNameLetter == 'I') {
    		System.out.println ("You are Igor");
    	} else {
    		System.out.println ("You are Denis");
    	}
    }
} 