import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle amount: ");
        int principle = sc.nextInt();
        System.out.print("Enter the rate: ");
        int rate = sc.nextInt();
        System.out.print("Enter the time (in years): ");
        int time = sc.nextInt();

        double simpleInterest = (principle * rate * time) / 100;
        System.out.println("The Simple Interest is "+ simpleInterest +" for Principal "+ principle +" , Rate of Interest "+ rate +" and Time "+time);
    }
}
