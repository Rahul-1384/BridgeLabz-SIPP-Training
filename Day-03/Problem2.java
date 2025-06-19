import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int n = sc.nextInt();
        double[] arr = new double[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        double sumOfAll = 0;
        for(int i=0;i<n;i++){
            sumOfAll += arr[i];
        }
        double mean = sumOfAll / n;
        System.out.println("The mean height of players in a football team is "+mean);
    }
}
