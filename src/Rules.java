public class Rules {
    //regras testar // se o numero ja existe na linha, coluna ou quadrante
    public static boolean isValid(int[][] board, int row, int col, int num) {
        // Verifica se o número já existe na linha
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }

        // Verifica se o número já existe na coluna
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

        // Verifica se o número já existe no quadrante 3x3
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }
}
