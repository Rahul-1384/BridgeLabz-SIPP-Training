import java.util.Random;

public class StudentScorecard {

    public static void main(String[] args) {
        int numStudents = 5;

        int[][] pcmScores = generateScores(numStudents);
        double[][] stats = calculateStats(pcmScores);
        char[] grades = calculateGrades(stats);
        displayScorecard(pcmScores, stats, grades);
    }

    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            scores[i][0] = 40 + rand.nextInt(60); // Physics
            scores[i][1] = 40 + rand.nextInt(60); // Chemistry
            scores[i][2] = 40 + rand.nextInt(60); // Maths
        }

        return scores;
    }

    public static double[][] calculateStats(int[][] scores) {
        int n = scores.length;
        double[][] result = new double[n][3]; // total, average, percentage

        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return result;
    }

    public static char[] calculateGrades(double[][] stats) {
        int n = stats.length;
        char[] grades = new char[n];

        for (int i = 0; i < n; i++) {
            double percentage = stats[i][2];

            if (percentage >= 80) grades[i] = 'A';
            else if (percentage >= 70) grades[i] = 'B';
            else if (percentage >= 60) grades[i] = 'C';
            else if (percentage >= 50) grades[i] = 'D';
            else if (percentage >= 40) grades[i] = 'E';
            else grades[i] = 'R';
        }

        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] stats, char[] grades) {
        System.out.println("S.No\tPhysics\tChemistry\tMaths\tTotal\tAverage\t\tPercentage\tGrade");

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" +
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t\t" +
                    scores[i][2] + "\t" +
                    (int) stats[i][0] + "\t" +
                    stats[i][1] + "\t\t" +
                    stats[i][2] + "\t\t" +
                    grades[i]);
        }
    }
}
