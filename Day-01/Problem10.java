import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        
        float quotient = num1 / num2;
        float reminder = num1 % num2;
        System.out.print(" The Quotient is "+ quotient +" and Reminder is "+ reminder +" of two number "+ num1 +" and "+num2);
    }
}
