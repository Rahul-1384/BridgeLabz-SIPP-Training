import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of students: ");
        int noOfStudents = sc.nextInt();

        int maxHandShakes = (noOfStudents * (noOfStudents -1)) / 2;

        System.out.println("e the maximum number of possible handshakes among "+ noOfStudents +" students is "+maxHandShakes);

    }
}
