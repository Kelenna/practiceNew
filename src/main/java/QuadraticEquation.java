import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {

        System.out.println("Enter the coefficients of quadratic equation a, b, c:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (Math.abs(a) > 1000 || Math.abs(b) > 1000 || Math.abs(c) > 1000 || a == 0) {
            System.out.println("The values of coefficients should not exceed 100 by absolute value, a should not be 0");
        }
        else {
            double D = b * b - 4 * a * c;
            if (D > 0) {
                double x1 = (-b + Math.sqrt(D)) / 2 * a;
                double x2 = (-b - Math.sqrt(D)) / 2 * a;
                if (x1 > x2) {
                    System.out.println(String.format("Two roots %f %f", x1, x2));
                } else
                System.out.println(String.format("Two roots %f %f", x2, x1));
            } else if (D == 0) {
                double x1 = -b  / 2.0 * a;
                System.out.println(String.format("One root %f", x1));
            } else {
                System.out.println("No roots");
            }
        }
    }
}
