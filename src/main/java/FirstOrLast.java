import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstOrLast {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter three digit number: ");
        int number = Integer.parseInt(br.readLine());
        String numberString = String.valueOf(number);
        if (number < 0 && numberString.length() == 4) {
                int firstDigit = Character.digit(numberString.charAt(1), 10);
                int thirdDigit = Character.digit(numberString.charAt(3), 10);
                if (firstDigit > thirdDigit)
                    System.out.println(firstDigit);
                else if (thirdDigit > firstDigit)
                    System.out.println(thirdDigit);
                else System.out.println("=");
        }
        else if (numberString.length() == 3 && number > 0) {
            int firstDigit = Character.digit(numberString.charAt(0), 10);
            int thirdDigit = Character.digit(numberString.charAt(2), 10);
                if (firstDigit > thirdDigit)
                    System.out.println(firstDigit);
                else if (thirdDigit > firstDigit)
                    System.out.println(thirdDigit);
                else System.out.println("=");
            }
        else System.out.println("Learn to count digits!");
        }
    }

