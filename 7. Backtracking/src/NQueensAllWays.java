
//Time complexity of this function is O(n!)

public class NQueensAllWays {
    public static void main(String[] args) {
        int n = 4;
        char[][] chessBoard = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chessBoard[i][j] = 'x';
            }
        }
        nQueen(chessBoard, 0);
    }

    //This function checks whether placing the queen at the given position is safe
    static boolean isSafe(char[][] chessBoard, int row, int col) {
        //up
        for (int i = row-1; i >= 0; i--) {
            if(chessBoard[i][col] == 'Q') {
                return false;
            }
        }
        //upwards left diagonal
        for (int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--) {
            if(chessBoard[i][j] == 'Q') {
                return false;
            }
        }
        //upwards right diagonal
        for (int i = row-1, j = col+1; i >= 0 && j < chessBoard.length; i--, j++) {
            if(chessBoard[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    //This function places the queen
    static void nQueen(char[][] chessBoard, int row) {
        if(row == chessBoard.length) {
            printBoard(chessBoard);
            return;
        }
        for (int j = 0; j < chessBoard.length; j++) {
            if(isSafe(chessBoard, row, j)){
                chessBoard[row][j] = 'Q';
                nQueen(chessBoard, row + 1);
                chessBoard[row][j] = 'x';
            }
        }
    }

    static void printBoard(char[][] mat) {
        System.out.println("----------------Chess Board----------------");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
