package arrays;

public class FirstOccurrence {
    public static void main(String[] args) {
        int[] arr = {8,3,6,9,5,10,2,5,3};
        System.out.println(firstOcc(arr,5,0));
    }

    static int firstOcc(int[] arr, int target,int i) {
        if(i == arr.length)
            return -1;
        if(arr[i] == target)
            return i;
        else
            return firstOcc(arr, target, i+1);
    }
}
