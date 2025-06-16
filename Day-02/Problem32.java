import java.util.Scanner;

public class Problem32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int count = 0;
        int temp = Math.abs(number);

        while (temp != 0) {
            temp /= 10;
            count++;
        }

        if (number == 0) {
            count = 1;
        }

        System.out.println("Number of digits: " + count);

    }
}
