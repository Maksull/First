import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        double result = 0.0;
        boolean errorFlag = false;

        outerLoop:
        for (int i = 1; i <= n - 1; i++) {
            double intermediateResult = 1.0;

            for (int j = 0; j <= i; j++) {
                if (i == j + x) {
                    continue outerLoop;
                }

                if (j + x == 0) {
                    errorFlag = true;
                    break outerLoop;
                }

                intermediateResult *= (double) i / (j + x);
            }

            result += intermediateResult;
        }

        if (errorFlag) {
            System.out.println("Error: Division by zero encountered.");
        } else {
            System.out.printf("Result: %.2f%n", result);
        }

        scanner.close();
    }
}
