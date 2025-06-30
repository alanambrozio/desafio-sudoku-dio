public class StartingNumbers {
    // generate the initial numbers of the Sudoku, 10 numbers in positions randomly.
    public static int[][] startingNumbers = new int[9][9];
    public static void generateStartingNumbers() {
        // Initialize the starting numbers with zeros
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                startingNumbers[i][j] = 0;
            }
        }

        // Randomly place 10 numbers in the Sudoku grid
        int count = 0;
        while (count < 10) {
            int row = (int) (Math.random() * 9);
            int col = (int) (Math.random() * 9);
            int num = (int) (Math.random() * 9) + 1; // Random number between 1 and 9

            if (startingNumbers[row][col] == 0 && Rules.isValid(startingNumbers, row, col, num)) {
                startingNumbers[row][col] = num;
                count++;
            }
        }
    }
    // Print the starting numbers in a readable format spaced by tabs, and space in 3x3
    public static void printStartingNumbers() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(startingNumbers[i][j] + "\t");
                if ((j + 1) % 3 == 0 && j < 8) {
                    System.out.print("|\t");
                }
            }
            System.out.println();
            if ((i + 1) % 3 == 0 && i < 8) {
                System.out.println("------------------------------------------");
            }
        }
    }

}
