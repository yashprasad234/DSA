import java.util.Arrays;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println(Arrays.toString(search(mat, 2)));
    }
    
    static int[] bSearch(int[] arr, int target, int st, int end, int row) {
        while(st <= end) {
            int mid = st + (end - st) / 2;
            if(arr[mid] == target)
                return new int[] {row, mid};
            else if(arr[mid] < target)
                st = mid + 1;
            else
                end = mid - 1;
        }
        return new int[] {-1,-1};
    }
    
    static int[] search(int[][] mat, int target) {
        int rows = mat.length, cols = mat[0].length;
        int rSt = 0, rEnd = rows-1;
        int cMid = cols/2;
        while (rSt + 1 < rEnd) {
            int rMid = rSt + (rEnd - rSt) / 2;

            if(mat[rMid][cMid] == target)
                return new int[] {rMid, cMid};
            // ignore the rows below
            if (mat[rMid][cMid] > target) {
                rEnd = rMid;
            }
            // ignore the row above
            else {
                rSt = rMid;
            }
        }

        if(mat[rSt][cMid] == target)
            return new int[] {rSt, cMid};
        if(mat[rSt+1][cMid] == target)
            return new int[] {rSt+1, cMid};

        //search in 1st part
        if(mat[rSt][cMid-1] >= target)
            return bSearch(mat[rSt], target, 0, cMid-1, rSt);
        //search in 2nd part
        if(mat[rSt][cols-1] >= target)
            return bSearch(mat[rSt], target, cMid+1, cols-1, rSt);
        //search in 3rd part
        if(mat[rSt+1][cMid-1] >= target)
            return bSearch(mat[rSt+1], target, 0, cMid-1, rSt+1);
        //search in 4th part
        if(mat[rSt+1][cols-1] >= target)
            return bSearch(mat[rSt+1], target, cMid+1, cols-1, rSt+1);
        return new int[] {-1,-1};
    }
}
