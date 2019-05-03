import java.util.Scanner;

public class Ring {

    public static void main(String[] args) {

        System.out.println("Enter the area of a ring and radius of an external circle:");
        Scanner sc = new Scanner(System.in);
        double s_ring = sc.nextDouble();
        double r_external = sc.nextDouble();

        if (s_ring <= 100 && r_external <= 100 && s_ring >= 0 && r_external >= 0) {
            double r_internal = (Math.sqrt(Math.pow(r_external, 2) - s_ring / Math.PI));

            System.out.println(String.format("%.3g%n", r_internal));
        }
        else
            System.out.println("Wrong input");
    }
}
