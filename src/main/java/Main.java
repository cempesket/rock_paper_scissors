import java.util.Random;

public class Main {


    private static Choice getRandomChoice() {
        Random random = new Random();
        return Choice.values()[random.nextInt(Choice.values().length)];
    }

    public static void main(String[] args) {
        int winCountA = 0;
        int winCountB = 0;
        int tieCount = 0;
        int counter = 100;
        Game game = new Game();
        while (counter > 0) {

            //Considering player A always chooses PAPER
            Choice playerAChoice = Choice.PAPER;
            Choice playerBChoice = getRandomChoice();

            Winner winner = game.chooseWinner(playerAChoice, playerBChoice);
            if (winner == Winner.PLAYER_A) {
                winCountA++;
            } else if (winner == Winner.PLAYER_B) {
                winCountB++;
            } else {
                tieCount++;
            }
            counter--;
        }
        System.out.printf("Player A wins %d of 100 games \n", winCountA);
        System.out.printf("Player B wins %d of 100 games \n", winCountB);
        System.out.printf("Tie: %d of 100 games \n", tieCount);

    }
}
