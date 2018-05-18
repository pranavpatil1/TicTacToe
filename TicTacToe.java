
/**
 * class TicTacToe simulates a tic tac toe board
 *
 * @author Satvik Nagpal, Pranav Patil
 * @version 05.17.18
 */
public class TicTacToe
{
    // stores the board in a square matrix with 'x', 'o', ''
    private char[][] board;
    private final int BOARD_SIZE;
    /**
     * creates a standard 3 by 3 tic tac toe board
     */
    public TicTacToe()
    {
        this(3);
    }
    /**
     * creates a tic tac toe board of any size
     * @param   size of the tic tac toe board (size by size)
     */
    public TicTacToe(int size)
    {
        BOARD_SIZE = size;
        board = new char[BOARD_SIZE][BOARD_SIZE];
    }
    
    /**
     * method checkWin checks if the rows, columns, or diagonals
     * contain a win
     * @param c checks for a win for a character
     * @return if a win is found
     */
    public boolean checkWin(char c)
    {
        return checkRow(c) || checkColumn(c) || checkDiagonal(c);
    }
    /**
     * helper method checkRow checks if the rows have a win
     * @param c checks for a win for a character
     * @return if a win is found
     */
    private boolean checkRow(char c)
    {
        int num = 0;
        for(int row = 0; row < board.length; row++)
        {
            for(int col = 0; col < board[row].length; col++)
            {
                if (board[row][col] == c)
                    num ++;
                if (num == BOARD_SIZE)
                    return true;
            }
            num = 0;
        }
        return false;
    }
    /**
     * helper method checkColumn checks if the columns have a win
     * @param c checks for a win for a character
     * @return if a win is found
     */
    private boolean checkColumn(char c)
    {
        int num = 0;
        for (int col = 0; col < board[0].length; col++)
        {
            for (int row = 0; row < board.length; row++)
            {
                if(board[row][col] == c)
                    num++;
                if (num == BOARD_SIZE)
                    return true;
            }
            num = 0;
        }
        return false;
    }
    /**
     * helper method checkDiagonal checks if the diagonals have a win
     * @param c checks for a win for a character
     * @return if a win is found
     */
    private boolean checkDiagonal(char c)
    {
        int num = 0;
        for (int i = 0; i < board.length; i++)
        {
            if (board[i][i] == c)
                num++;
            if (num == BOARD_SIZE)
                return true;
        }
        num = 0;
        for (int j = board.length-1; j > -1; j--)
        {
            if (board[j][j] == c)
                num++;
            if (num == BOARD_SIZE)
                return true;
        }
        return false;
    }
}
