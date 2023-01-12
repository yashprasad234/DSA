public class PrintOccurrences {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        printOccurrences(arr, 0, 2);
    }

    static void printOccurrences(int[] arr, int i, int key) {
        if(i == arr.length)
            return;
        if(arr[i] == key)
            System.out.print(i + " ");
        printOccurrences(arr, i+1, key);
    }
}
