import java.util.Arrays;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println(Arrays.toString(searchInMatrix(mat, 11)));
    }

    static int[] searchInMatrix(int[][] mat, int target) {
        int rows = mat.length, cols = mat[0].length;
        int rSt = 0, rEnd = rows-1;
        int cMid = cols/2;
        while(rSt + 1 < rEnd){
            int rMid = rSt + (rEnd - rSt) / 2;
            if (mat[rMid][cMid] == target)
                return new int[]{rMid, cMid};
            if (mat[rMid][cMid] < target)
                rSt = rMid;
            else
                rEnd = rMid;
        }


        if(mat[rSt][cMid] == target)
            return new int[]{rSt, cMid};
        if(mat[rSt+1][cMid] == target)
            return new int[]{rSt+1, cMid};

        // search in 1st part
        if(target <= mat[rSt][cMid-1])
            return binarySearch(mat, target, rSt, 0, cMid-1);
        // search in 2nd part
        if(target <= mat[rSt][cols-1])
            return binarySearch(mat, target, rSt, cMid+1, cols-1);
        // search in 3rd part
        if(target <= mat[rSt+1][cMid-1])
            return binarySearch(mat, target, rSt+1, 0, cMid-1);
        // search in 4th part
        if(target <= mat[rSt+1][cols-1])
            return binarySearch(mat, target, rSt+1, cMid+1, cols-1);
        else
            return new int[] {-1,-1};
    }

    static int[] binarySearch(int[][] mat, int target ,int row, int cSt, int cEnd) {
        while (cSt <= cEnd) {
            int mid = cSt + (cEnd - cSt) / 2;
            if(mat[row][mid] == target)
                return new int[]{row, mid};
            else if(mat[row][mid] < target)
                cSt = mid + 1;
            else
                cEnd = mid - 1;
        }
        return new int[] {-1,-1};
    }
}
