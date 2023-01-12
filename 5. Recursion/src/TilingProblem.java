
//Question: Given a "2 x n" board and tiles of size "2 X 1", count the number of ways to tile the given board
//using the 2 x 1 tiles. (A tile can either be placed vertically or horizontally.)

public class TilingProblem {
    public static void main(String[] args) {
        System.out.println(numberOfWays(6));
    }

    static int numberOfWays(int n) {

        //base case
        if(n == 0 || n == 1)
            return 1;

        //for every tile that is placed vertically we have f(n-1) more ways to place tiles and for horizontally placed
        //tile we have f(n-2) more ways and adding these two we will have total number of ways we can place those tiles.
        return numberOfWays(n-1) + numberOfWays(n-2);
    }
}
