import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class case1 {

    public static void main(String[] args) throws IOException {
        int a, b, c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Integer a:");
        a = Integer.parseInt(br.readLine());

        System.out.println("Enter Integer b:");
        b = Integer.parseInt(br.readLine());

        System.out.println("Enter Integer c:");
        c = Integer.parseInt(br.readLine());

        if (a > b && a > c) {
            System.out.println("a is the big bro");
        } else if (b > c) {
            System.out.println("b is the big bro");
        } else
            System.out.println("c is the big bro");
    }
}
