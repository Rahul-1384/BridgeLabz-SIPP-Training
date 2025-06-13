import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter number 1: ");
        float num2 = sc.nextFloat();

        // Addition Operation
        float add = num1 + num2;

        // Subtraction Operation
        float sub = num1 - num2;

        // Multiplication Operation
        float mul = num1 * num2;

        // Division Operation
        float div = num1 / num2;

        System.out.print(" The addition, subtraction, multiplication, and division value of 2 numbers "+ num1 +" and "+ num2 +" is "+ add +", "+
                        sub +", "+ mul +", and "+ div);
    }
}
