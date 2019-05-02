import java.io.IOException;
import java.util.Scanner;

public class WhichQuarter {

    public static void main(String[] args) throws IOException {

        System.out.println("Enter x and y");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > 0 && y > 0)
            System.out.println("I Quarter!");
        else if (x < 0 && y > 0)
            System.out.println("II Quarter!");
        else if (x < 0 && y < 0)
            System.out.println("III Quarter!");
        else if (x > 0 && y < 0)
            System.out.println("IV Quarter!");
        else
            System.out.println("Unequivocally define a quarter it is impossible!");
    }
}
