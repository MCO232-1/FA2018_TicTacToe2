package tictactoe2;

/**
 *
 * @author Administrator
 */
public class TicTacToe2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe(2);
        do {
            game.displayBoard();
            game.promptAndMakeMove();
        } while (! game.isGameOver());
        System.out.println(game.getWinner());

    }

}
