import java.util.Scanner;

public class NumberOfAnApartment {

    public static void main(String[] args) {

        System.out.println("Enter total number of apartments N, entrances P, floors Q, number of apartment K:");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        int Q = sc.nextInt();
        int K = sc.nextInt();

        if (N < 1 || K < 1 || P < 1 || Q < 1 || K > N || K > 1000 || N > 1000 || N < P * Q || N % P % Q != 0.0) {
            System.out.println("Wrong input values!");
        } else {
            int appPerEntrance = N / P;
            int appPerFloor = appPerEntrance / Q;

            int entrance = (int) Math.ceil(K / (double) appPerEntrance);
            if (K % appPerEntrance == 0) {
                System.out.println(String.format("Apartment is in %d entrance, on %d floor", entrance, Q));
            } else {
                int floor = (int) Math.ceil(K % appPerEntrance / (double) appPerFloor);
                System.out.println(String.format("Apartment is in %d entrance, on %d floor", entrance, floor));
            }
        }
    }
}
