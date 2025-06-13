import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        float a = sc.nextFloat();
        System.out.print("Enter the value of b: ");
        float b = sc.nextFloat();
        System.out.print("Enter the value of c: ");
        float c = sc.nextFloat();
        float doubleOp1 =  a + b *c;
        float doubleOp2 = a * b + c;
        float doubleOp3 = c + a / b;
        float doubleOp4 =  a % b + c;

        System.out.println("The results of Double Operations are "+ doubleOp1 +", "+ doubleOp2 +", "+ doubleOp3 +", and "+ doubleOp4);
    }
}
