public class Game {


    Winner chooseWinner(Choice playerAChoice, Choice playerBChoice) {

        if (playerAChoice == playerBChoice) {
            return Winner.TIE;
        } else if (playerBChoice == Choice.ROCK && playerAChoice == Choice.PAPER) {
            return Winner.PLAYER_A;
        } else if (playerBChoice == Choice.SCISSORS && playerAChoice == Choice.ROCK) {
            return Winner.PLAYER_A;
        } else if (playerBChoice == Choice.ROCK && playerAChoice == Choice.SCISSORS) {
            return Winner.PLAYER_B;
        } else if (playerBChoice == Choice.SCISSORS && playerAChoice == Choice.PAPER) {
            return Winner.PLAYER_B;
        } else if (playerBChoice == Choice.PAPER && playerAChoice == Choice.SCISSORS) {
            return Winner.PLAYER_A;
        } else if (playerBChoice == Choice.PAPER && playerAChoice == Choice.ROCK) {
            return Winner.PLAYER_B;
        }
        return Winner.TIE;
    }
}

enum Choice {ROCK, PAPER, SCISSORS}

enum Winner {PLAYER_A, PLAYER_B, TIE}

