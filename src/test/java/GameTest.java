import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class GameTest {


    @Test
    void testChooseWinner() {
        Game game = new Game();
        // assert statements
        Assertions.assertEquals(Winner.PLAYER_A,game.chooseWinner(Choice.PAPER,Choice.ROCK),"Paper beats rock.");
        Assertions.assertEquals(Winner.PLAYER_B,game.chooseWinner(Choice.PAPER,Choice.SCISSORS),"Scissors beats paper.");
        Assertions.assertEquals(Winner.TIE,game.chooseWinner(Choice.PAPER,Choice.PAPER),"Paper ties paper.");
        Assertions.assertEquals(Winner.TIE,game.chooseWinner(Choice.ROCK,Choice.ROCK),"Rock ties rock.");
        Assertions.assertEquals(Winner.PLAYER_A,game.chooseWinner(Choice.ROCK,Choice.SCISSORS),"Rock beats scissors.");
        Assertions.assertEquals(Winner.PLAYER_B,game.chooseWinner(Choice.ROCK,Choice.PAPER),"Paper beats rock.");
        Assertions.assertEquals(Winner.PLAYER_B,game.chooseWinner(Choice.SCISSORS,Choice.ROCK),"Rock beats scissors.");
        Assertions.assertEquals(Winner.PLAYER_A,game.chooseWinner(Choice.SCISSORS,Choice.PAPER),"Scissors beats paper.");
        Assertions.assertEquals(Winner.TIE,game.chooseWinner(Choice.SCISSORS,Choice.SCISSORS),"Scissors ties scissors.");





    }

}