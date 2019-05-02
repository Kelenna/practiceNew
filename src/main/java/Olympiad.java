import java.util.Scanner;

public class Olympiad {

    public static void main(String[] args) {

        System.out.println("Enter the starting time:");
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int s1 = sc.nextInt();

        System.out.println("Enter the finishing time:");
        Scanner sc1 = new Scanner(System.in);
        int h2 = sc1.nextInt();
        int m2 = sc1.nextInt();
        int s2 = sc1.nextInt();

        if (0 > h1 || h1 > h2 || h2 > 23 || 0 > m1 || m2 > 59 || 0 > s1 || s1 > 59 || m1 > 59 || s2 > 59) {
            System.out.println("Wrong time format!");
        } else {
            int h1_to_seconds = h1 * 3600;
            int m1_to_seconds = m1 * 60;
            int start_in_seconds = h1_to_seconds + m1_to_seconds + s1;

            int h2_to_seconds = h2 * 3600;
            int m2_to_seconds = m2 * 60;
            int finish_in_seconds = h2_to_seconds + m2_to_seconds + s2;

            int total_duration_in_sec = finish_in_seconds - start_in_seconds;

            int duration_hours = total_duration_in_sec / 3600;
            int duration_minutes = (total_duration_in_sec % 3600) / 60;
            int duration_seconds = total_duration_in_sec - duration_hours * 3600 - duration_minutes * 60;

            System.out.println(String.format("Olympiad duration is %d hours, %d minutes, %d seconds", duration_hours, duration_minutes, duration_seconds));
        }
    }
}
