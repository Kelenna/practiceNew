import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class case2 {

    public static void main(String[] args) throws IOException {
        int grade;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Grade");
        grade = Integer.parseInt(br.readLine());

        if (grade < 4 && grade >= 1) {
            System.out.println("Grade is Initial");
        } else if (grade <= 6 && grade > 3) {
            System.out.println("Grade is Average");
        } else if (grade < 10 && grade > 6) {
            System.out.println("Grade is Sufficient");
        } else if (grade <= 12 && grade >= 10) {
            System.out.println("Grade is High");
        }
        else System.out.println("Grade is invalid");
    }
}
