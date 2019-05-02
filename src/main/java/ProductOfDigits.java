import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProductOfDigits {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter positive three digit number: ");
        int number = Integer.parseInt(br.readLine());
        String numberString = String.valueOf(number);

        if (numberString.length() == 3 && number > 0) {
            int firstDigit = Character.digit(numberString.charAt(0), 10);
            int secondDigit = Character.digit(numberString.charAt(1), 10);
            int thirdDigit = Character.digit(numberString.charAt(2), 10);
            System.out.println(firstDigit * secondDigit * thirdDigit);
        }
        else System.out.println("Learn to count digits!");
    }
}
