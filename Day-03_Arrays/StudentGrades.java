import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        double[] percentages = new double[n];
        char[] grades = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1) + " (Physics, Chemistry, Maths): ");
            for (int j = 0; j < 3; j++) {
                int mark;
                do {
                    mark = sc.nextInt();
                    if (mark < 0) {
                        System.out.println("Marks cannot be negative. Please re-enter:");
                    }
                } while (mark < 0);
                marks[i][j] = mark;
            }

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3.0;

            if (percentages[i] >= 80)
                grades[i] = 'A';
            else if (percentages[i] >= 70)
                grades[i] = 'B';
            else if (percentages[i] >= 60)
                grades[i] = 'C';
            else if (percentages[i] >= 50)
                grades[i] = 'D';
            else if (percentages[i] >= 40)
                grades[i] = 'E';
            else
                grades[i] = 'R';
        }

        System.out.println("\nResults:");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.print("  " + (i + 1) + "\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(marks[i][j] + "\t\t");
            }
            System.out.printf("%.2f\t\t%c\n", percentages[i], grades[i]);
        }
    }
}
