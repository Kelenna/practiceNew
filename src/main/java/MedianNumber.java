import java.io.IOException;
import java.util.Scanner;

public class MedianNumber {

    public static void main(String[] args) throws IOException {

        System.out.println("Enter a, b, c:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (Math.abs(a) > 1000 || Math.abs(b) > 1000 || Math.abs(c) > 1000) {
            System.out.println("a, b, c should not exceed 1000 by absolute value");
        } else {
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
            if (b > c) {
                int temp = b;
                b = c;
                c = temp;
            }
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
            System.out.println(String.format("Median is %d", b));
        }
    }
}
