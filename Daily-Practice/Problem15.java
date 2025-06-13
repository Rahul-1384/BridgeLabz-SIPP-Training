import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of chocolates: ");
        int noOfChocolates = sc.nextInt();
        System.out.print("Enter the no of children: ");
        int noOfChildren = sc.nextInt();

        int chocolatesDivided = noOfChocolates / noOfChildren;
        int remainingChocolates = noOfChocolates % noOfChildren;

        System.out.println("The number of chocolates each child gets is "+ chocolatesDivided +" and the number of remaining chocolates is "+remainingChocolates);
    }
}
