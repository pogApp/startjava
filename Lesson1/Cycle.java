public class Cycle {
    public static void main(String[] args) {
        System.out.println("For");
        for (int i=0; i<21; i++) {
            System.out.print(i + ", ");
        }

        System.out.println("\nWhile");
        int i = 6;
        while (i >= -6) {
            System.out.print(i + ", ");
            i--;
        } 

        System.out.println("\nDo While");
        i = 10;
        int sum = 0;
        do {
            if (i % 2 == 1) {
                sum += i;
            }
            i++;
        } while (i <= 20);
        System.out.println("Sum = " + sum);
    }
} 