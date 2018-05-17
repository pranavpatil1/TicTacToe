
/**
 * Write a description of class TicTacToe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TicTacToe
{
    private static char[][] board;
    public TicTacToe()
    {
        board = new char[3][3];
    }
    public boolean checkWin()
    {
        
    }
    private boolean checkRow(char c)
    {
        int num = 0;
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[i].length; j++)
            {
                if (board[i][j] == c)
                    num++;
                if (num == 3)
                    return true;
            }
            num = 0;
        }
        return false;
    }
}
