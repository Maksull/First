import java.util.Scanner;

public class Function {
    private static final int n = 18;

    private static double calculateY(double x) {
        if (x < 7) {
            return Math.exp(3.5 - 0.5 * x) + 20;
        } else {
            double result = 0;
            for (int k = 1; k <= n; k++) {
                result += Math.sqrt(k * k + x - 7);
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the beginning of the interval (x_start): ");
        double xStart = scanner.nextDouble();
        System.out.print("Enter the end of the interval (x_end): ");
        double xEnd = scanner.nextDouble();
        System.out.print("Enter the step size (step): ");
        double step = scanner.nextDouble();

        System.out.println("x\t\t y");

        for (double x = xStart; x <= xEnd; x += step) {
            double y = calculateY(x);
            System.out.printf("%.2f\t\t%.2f%n", x, y);
        }

        scanner.close();
    }
}
