import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Digits {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter non negative integer n les than 2*10^9: ");

        try {
            int number = Integer.parseInt(br.readLine());
            String numberString = String.valueOf(number);

            if (number <= 2 * Math.pow(10, 9) && number >= 0) {
                int length = numberString.length();
                System.out.println(String.format("Number of digits is %d", length));
            }
            else
                System.out.println("Negative or exceeds 2*10^9");

        } catch (NumberFormatException ex) {
            System.out.println("It's not integer");
        }
    }
}
