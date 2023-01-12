public class CheckIfSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,6};
        System.out.println(isSorted(arr, 0));
    }

    static boolean isSorted(int[] arr, int curr) {
        if(curr == arr.length-1) {
            return true;
        }
        if(arr[curr] > arr[curr+1])
            return false;
        return isSorted(arr, curr+1);
    }
}
