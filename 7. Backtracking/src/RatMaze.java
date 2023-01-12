public class RatMaze {
    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}
        };
        solveMaze(maze);
    }

    //creates a matrix to store the solution and calls the function which writes the solution in this matrix
    static boolean solveMaze(int[][] maze) {
        int n = maze.length;
        int[][] sol = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sol[i][j] = 0;
            }
        }
        if(!solveMazeUtil(maze, 0, 0, sol))
            return false;
        printSolution(sol);
        return true;
    }

    //The main function that solves the problem based on the maze and stores the solution in other matrix
    static boolean solveMazeUtil(int[][] maze, int i, int j, int[][] sol) {
        if(i == maze.length-1 && j == maze.length-1 && maze[i][j] == 1) {
            sol[i][j] = 1;
            return true;
        }

        if(isSafe(maze, i, j)) {
            if(sol[i][j] == 1)
                return false;
            sol[i][j] = 1;
            if(solveMazeUtil(maze, i, j+1, sol))
                return true;
            if(solveMazeUtil(maze, i+1, j, sol))
                return true;
            sol[i][j] = 0;
            return  false;
        }
        return false;
    }

    //checks whether it is safe to go to (x,y) coordinate in the maze
    static boolean isSafe(int[][] maze, int x, int y) {
        return (x >= 0 && x < maze.length && y >= 0 && y < maze.length && maze[x][y] == 1);
    }

    //prints the matrix
    static void printSolution(int[][] sol) {
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol.length; j++) {
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }
    }
}
