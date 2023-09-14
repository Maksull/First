import java.util.Scanner;

public class PowersOfEight {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n (from 0 to 10): ");
        int n = scanner.nextInt();

        if (n >= 0 && n <= 10) {
            System.out.println("Using Arithmetic Operations:");
            for (int i = 0; i <= n; i++) {
                long result = (long) Math.pow(8, i);
                System.out.printf("8^%d = %d%n", i, result);
            }

            System.out.println("\nUsing Bitwise Operations:");
            for (int i = 0; i <= n; i++) {
                long result = 1L << (3 * i);
                System.out.printf("8^%d = %d%n", i, result);
            }
        } else {
            System.out.println("Please enter a valid value of n between 0 and 10.");
        }

        scanner.close();
    }
}
