import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the calue of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the calue of b: ");
        int b = sc.nextInt();
        System.out.print("Enter the calue of c: ");
        int c = sc.nextInt();

        int intOp1 =  a + b *c;
        int intOp2 = a * b + c;
        int intOp3 = c + a / b;
        int intOp4 =  a % b + c;

        System.out.println("The results of Int Operations are "+ intOp1 +", "+ intOp2 +", "+ intOp3 +", and "+intOp4);
    }
}
