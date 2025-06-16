import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n >= 0) {
            int formulaSum = n * (n + 1) / 2;
            int loopSum = 0;
            int i = 1;
            while (i <= n) {
                loopSum += i;
                i++;
            }
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + loopSum);
            System.out.println("Are both computations equal? " + (formulaSum == loopSum));
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
    }
}
