import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompactDiscs {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number of Discs: ");
        int discs = Integer.parseInt(br.readLine());

        if (discs < 1 || discs > 1000) {
            System.out.println("Invalid Number");
        } else {
            int hundreds = discs / 100;
            discs = discs - hundreds * 100;
            int twenties = discs / 20;
            discs = discs - 20 * twenties;
            int sum = discs * 2 + twenties * 30 + hundreds * 100;
            System.out.println(String.format("You have to pay %d UAH", sum));
        }
    }
}
