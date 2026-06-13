import java.util.Scanner;

public class RockPaperScissors {

    public static String getComputerChoice() {

        int choice = (int)(Math.random() * 3);

        if (choice == 0)
            return "Rock";
        else if (choice == 1)
            return "Paper";
        else
            return "Scissors";
    }

    public static String findWinner(
            String player,
            String computer) {

        if (player.equals(computer))
            return "Draw";

        if ((player.equals("Rock") &&
                computer.equals("Scissors")) ||

            (player.equals("Paper") &&
                computer.equals("Rock")) ||

            (player.equals("Scissors") &&
                computer.equals("Paper")))
            return "Player";

        return "Computer";
    }

    public static String[][] getStatistics(
            int playerWins,
            int computerWins,
            int games) {

        String[][] stats = new String[2][3];

        double playerPercent =
                (playerWins * 100.0) / games;

        double computerPercent =
                (computerWins * 100.0) / games;

        stats[0][0] = "Player";
        stats[0][1] = String.valueOf(playerWins);
        stats[0][2] =
                String.format("%.2f%%", playerPercent);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] =
                String.format("%.2f%%", computerPercent);

        return stats;
    }

    public static void displayResults(
            String[][] gameResults,
            String[][] stats) {

        System.out.println(
                "\nGame\tPlayer\tComputer\tWinner");

        for (int i = 0; i < gameResults.length; i++) {

            System.out.println(
                    (i + 1) + "\t" +
                    gameResults[i][0] + "\t" +
                    gameResults[i][1] + "\t\t" +
                    gameResults[i][2]);
        }

        System.out.println("\nStatistics");

        System.out.println(
                "Name\tWins\tPercentage");

        for (int i = 0; i < stats.length; i++) {

            System.out.println(
                    stats[i][0] + "\t" +
                    stats[i][1] + "\t" +
                    stats[i][2]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(
                "Enter number of games: ");

        int games = sc.nextInt();
        sc.nextLine();

        String[][] gameResults =
                new String[games][3];

        int playerWins = 0;
        int computerWins = 0;

        for (int i = 0; i < games; i++) {

            System.out.print(
                    "Enter Rock/Paper/Scissors: ");

            String player = sc.nextLine();

            String computer =
                    getComputerChoice();

            String winner =
                    findWinner(player, computer);

            if (winner.equals("Player"))
                playerWins++;
            else if (winner.equals("Computer"))
                computerWins++;

            gameResults[i][0] = player;
            gameResults[i][1] = computer;
            gameResults[i][2] = winner;
        }

        String[][] stats =
                getStatistics(
                        playerWins,
                        computerWins,
                        games);

        displayResults(gameResults, stats);
    }
}