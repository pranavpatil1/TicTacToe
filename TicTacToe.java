
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
    public boolean checkWin(char c)
    {
        if (checkRow(c) || checkColumn(c) || checkDiagonal(c))
            return true;
        return false;
    }
    private boolean checkRow(char c)
    {
        int num = 0;
        for(int row = 0; row < board.length; row++)
        {
            for(int col = 0; col < board[row].length; col++)
            {
                if (board[row][col] == c)
                    num++;
                if (num == 3)
                    return true;
            }
            num = 0;
        }
        return false;
    }
    private boolean checkColumn(char c)
    {
        int num = 0;
        for (int col = 0; col < board[0].length; col++)
        {
            for (int row = 0; row < board.length; row++)
            {
                if(board[row][col] == c)
                    num++;
                if (num == 3)
                    return true;
            }
            num = 0;
        }
        return false;
    }
    private boolean checkDiagonal(char c)
    {
        int num = 0;
        for (int i = 0; i < board.length; i++)
        {
            if (board[i][i] == c)
                num++;
            if (num == 3)
                return true;
        }
        num = 0;
        for (int j = board.length-1; j > -1; j--)
        {
            if (board[j][j] == c)
                num++;
            if (num == 3)
                return true;
        }
        return false;
    }
}
