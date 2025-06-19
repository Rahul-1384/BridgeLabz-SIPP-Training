import java.util.Arrays;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int[] arr = new int[10];
        for(int i=1;i<=arr.length;i++){
            arr[i-1] = number * i;
        }
        System.out.println(Arrays.toString(arr));
    }
}
