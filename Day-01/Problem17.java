import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature (in celsius): ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * (9 / 5.0)) + 32;

        System.out.println("The "+ celsius +" celsius is "+ fahrenheit +" fahrenheit");
    }
}
