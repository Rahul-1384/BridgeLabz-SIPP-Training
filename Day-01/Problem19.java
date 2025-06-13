import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input for name and cities
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter From City: ");
        String fromCity = sc.nextLine();

        System.out.print("Enter Via City: ");
        String viaCity = sc.nextLine();

        System.out.print("Enter To City: ");
        String toCity = sc.nextLine();

        // Step 2: Input for distances in miles
        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double fromToVia = sc.nextDouble();

        System.out.print("Enter distance from " + viaCity + " to " + toCity + " (in miles): ");
        double viaToFinalCity = sc.nextDouble();

        // Step 3: Input for time taken
        System.out.print("Enter time from " + fromCity + " to " + viaCity + " (in minutes): ");
        int timeFromToVia = sc.nextInt();

        System.out.print("Enter time from " + viaCity + " to " + toCity + " (in minutes): ");
        int timeViaToFinalCity = sc.nextInt();

        double totalMiles = fromToVia + viaToFinalCity;
        double totalKm = totalMiles * 1.60934;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.printf(
            "The Total Distance travelled by %s from %s to %s via %s is %.2f km and the Total Time taken is %d minutes.%n",
            name, fromCity, toCity, viaCity, totalKm, totalTime
        );

    }
}
