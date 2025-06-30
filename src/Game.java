public class Game {
    // Method to add a number to the Sudoku board
    public static boolean addNumber(int[][] board, int row, int col, int num) {
        // Check if the number is valid according to Sudoku rules
        if (Rules.isValid(board, row, col, num)) {
            board[row][col] = num; // Place the number on the board
            return true; // Successfully added the number
        }
        return false; // Number could not be added due to rule violation
    }

}
