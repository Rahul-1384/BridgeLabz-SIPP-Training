import java.util.Scanner;

public class BMIStatus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();

        double[] weights = new double[n];
        double[] heights = new double[n];
        double[] bmis = new double[n];
        String[] statuses = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.print("Weight (kg): ");
            weights[i] = sc.nextDouble();
            System.out.print("Height (cm): ");
            heights[i] = sc.nextDouble();

            double hMeters = heights[i] / 100.0;
            bmis[i] = weights[i] / (hMeters * hMeters);

            if (bmis[i] < 18.5)
                statuses[i] = "Underweight";
            else if (bmis[i] < 25)
                statuses[i] = "Normal weight";
            else if (bmis[i] < 30)
                statuses[i] = "Overweight";
            else
                statuses[i] = "Obese";
        }

        System.out.println("\nS.No\tHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%.1f\t\t%.1f\t\t%.2f\t%s\n",
                    i + 1, heights[i], weights[i], bmis[i], statuses[i]);
        }
    }
}
