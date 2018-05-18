
/**
 * class Tester tests the game
 */
public class Tester
{
    public static void main(String[] args)
    {
        TicTacToe game = new TicTacToe(4);
        game.go(1, 1);
        game.go(2, 2);
        game.go(3, 3);
        game.go(4, 4);
    }
}
