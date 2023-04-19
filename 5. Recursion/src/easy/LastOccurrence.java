public class LastOccurrence {
    public static void main(String[] args) {
        int[] arr = {8,3,6,9,5,10,2,5,3};
        System.out.println(lastOcc(arr, arr.length-1, 5));
    }

    static int lastOcc(int[] arr, int i, int target) {
        if(i < 0)
            return -1;
        if(arr[i] == target)
            return i;
        else
            return lastOcc(arr, i-1, target);
    }
}
