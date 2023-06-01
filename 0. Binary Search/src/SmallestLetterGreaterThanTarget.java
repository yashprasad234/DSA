public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'z';
        System.out.println(ceilingLetters(letters, target));
    }

    static char ceilingLetters(char[] arr, char target) {
        int st = 0, end = arr.length-1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if(arr[mid] > target)
                end = mid - 1;
            else
                st = mid + 1;
        }
        return arr[st % arr.length];
    }
}
