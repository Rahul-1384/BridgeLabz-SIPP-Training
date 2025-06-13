import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        int distanceInFeet = sc.nextInt();

        double distanceInYards = distanceInFeet / 3.0;
        double distanceInMiles = distanceInYards / 1760.0;

        System.out.printf("The distance in yards is %.2f while the distance in miles is %.2f%n",
                          distanceInYards, distanceInMiles);
    }
}
