import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the salary: ");
        int salary = sc.nextInt();
        System.out.print("Enter the bonus: ");
        int bonus = sc.nextInt();

        int totalIncome = salary + bonus;

        System.out.println("The salary is INR "+ salary +" and the bonus is INR "+ bonus +" . Hence Total Income is INR "+totalIncome);
    }
}
