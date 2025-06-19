import java.util.Arrays;
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        if(number <= 0){
            System.out.println("Error! The number "+ number +" is not a natural number.");
        }
        int[] odd = new int[number / (2)];
        int[] even = new int[number / (2)];
        int oddIdx = 0;
        int evenIdx = 0;
        for(int i=1;i<=number;i++){
            if(i % 2 == 0){
                odd[oddIdx++] = i;
            }else{
                even[evenIdx++] = i;
            }
        }
        System.out.println(Arrays.toString(odd));
        System.out.println(Arrays.toString(even));
    }
}
