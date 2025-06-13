import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("The Area of the triangle in sq in is "+ (area * 0.1550) +" and sq cm is "+ area);
    }
}
