public class NQueenOneSolution {
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        if(nQueens(board, 0)) {
            System.out.println("Solution is possible");
            printBoard(board);
        } else {
            System.out.println("Solution not possible");
        }
    }

    static boolean nQueens(char[][] board, int row) {
        if(row == board.length) {
            return true;
        }
        for (int i = 0; i < board.length; i++) {
            if(isSafe(board, row, i)){
                board[row][i] = 'Q';
                if(nQueens(board, row + 1))
                    return true;
                board[row][i] = 'x';
            }
        }

        return false;
    }

    static boolean isSafe(char[][] board, int row, int col) {
        //up
        for (int i = row-1; i >= 0; i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }
        //upwards left diagonal
        for (int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        //upwards right diagonal
        for (int i = row-1, j = col+1; i >= 0 && j < board.length; i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    static void printBoard(char[][] b) {
        System.out.println();
        System.out.println();
        System.out.println("-------------------- Chess Board --------------------");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
