public class PrintLexicograpicallyLargestString {
    public static void main(String[] args) {
        String[] arr = {"apple", "mango", "banana"};
        String max = new String(arr[0]);

        //Time Complexity : O(n*(length of the largest string in array))
        //Space Complexity : O(1)

        for(int i = 1; i < arr.length; i++) {
            if(max.compareToIgnoreCase(arr[i]) < 0)
                max = arr[i];
        }
        System.out.println(max);
    }
}
