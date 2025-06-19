import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            double weight;
            do {
                weight = sc.nextDouble();
            } while (weight <= 0);

            double height;
            do {
                height = sc.nextDouble();
            } while (height <= 0);

            double hMeters = height / 100.0;
            double bmi = weight / (hMeters * hMeters);

            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = bmi;

            if (bmi <= 18.4) weightStatus[i] = "Underweight";
            else if (bmi <= 24.9) weightStatus[i] = "Normal";
            else if (bmi <= 39.9) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        for (int i = 0; i < number; i++) {
            System.out.printf("Person %d: Height: %.2f cm, Weight: %.2f kg, BMI: %.2f, Status: %s%n",
                    i + 1, personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }
    }
}
