import java.util.*;
public class Problem1{
    public static void main(String[] args) {
        double km;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in Kilometers: ");
        km = sc.nextDouble();
        double miles = 0.621371 * km;
        System.out.println("The total miles is "+ miles +" mile for the given "+ km +" km.");
    }
}