import java.util.Scanner;

public class Problem37 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double weight = in.nextDouble();
        double heightCm = in.nextDouble();
        double h = heightCm / 100.0;
        double bmi = weight / (h * h);
        System.out.printf("%.1f%n", bmi);
        if (bmi <= 18.4) System.out.println("Underweight");
        else if (bmi <= 24.9) System.out.println("Normal");
        else if (bmi <= 39.9) System.out.println("Overweight");
        else System.out.println("Obese");
    }
}
