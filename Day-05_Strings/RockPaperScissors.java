import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] choices = {"rock", "paper", "scissors"};

        System.out.print("Enter number of games: ");
        int n = sc.nextInt();

        String[][] results = new String[n][3];
        int playerWins = 0, computerWins = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Game " + (i + 1) + " - Enter your choice (rock/paper/scissors): ");
            String player = sc.next().toLowerCase();
            String computer = getComputerChoice();
            String winner = getWinner(player, computer);

            if (winner.equals("Player")) playerWins++;
            else if (winner.equals("Computer")) computerWins++;

            results[i][0] = player;
            results[i][1] = computer;
            results[i][2] = winner;
        }

        String[][] stats = calculateStats(n, playerWins, computerWins);
        displayGameResults(results, stats);
    }

    public static String getComputerChoice() {
        String[] options = {"rock", "paper", "scissors"};
        return options[(int) (Math.random() * 3)];
    }

    public static String getWinner(String player, String computer) {
        if (player.equals(computer)) return "Draw";
        if ((player.equals("rock") && computer.equals("scissors")) ||
            (player.equals("scissors") && computer.equals("paper")) ||
            (player.equals("paper") && computer.equals("rock"))) {
            return "Player";
        } else {
            return "Computer";
        }
    }

    public static String[][] calculateStats(int total, int player, int computer) {
        String[][] stats = new String[2][3];

        stats[0][0] = "Player";
        stats[0][1] = String.valueOf(player);
        stats[0][2] = String.format("%.2f", (player * 100.0) / total) + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computer);
        stats[1][2] = String.format("%.2f", (computer * 100.0) / total) + "%";

        return stats;
    }

    public static void displayGameResults(String[][] games, String[][] stats) {
        System.out.println("\nGame\tPlayer\tComputer\tWinner");
        for (int i = 0; i < games.length; i++) {
            System.out.println((i + 1) + "\t" + games[i][0] + "\t" + games[i][1] + "\t\t" + games[i][2]);
        }

        System.out.println("\nSummary:");
        System.out.println("Entity\tWins\tWin %");
        for (String[] row : stats) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
        }
    }
}
