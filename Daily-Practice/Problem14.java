import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1 (in meters): ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side 2 (in meters): ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side 3 (in meters): ");
        double side3 = sc.nextDouble();

        // Calculate perimeter
        double perimeter = side1 + side2 + side3;

        // Total distance to run = 5000 meters (5 km)
        double totalRounds = 5000 / perimeter;

        // Output
        System.out.printf("The total number of rounds the athlete will run is %.2f to complete 5 km.%n", totalRounds);

    }
}
