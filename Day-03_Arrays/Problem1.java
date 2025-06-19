import java.util.Arrays;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter no of columns: ");
        int col = sc.nextInt();
        int[][] arr2D = new int[rows][col];

        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                arr2D[i][j] = sc.nextInt();
            }
        }
        int[] arr = new int[rows * col];
        int idx = 0;

        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                arr[idx++] = arr2D[i][j];
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
