public class KthLargestOddNumberInRange {
    public static void main(String[] args) {
        int l = -3, r = 3, k = 1;
        System.out.println(kthLargestOdd(l, r, 1));
    }

    static int kthLargestOdd(int l, int r, int k) {
        if(k <= 0)
            return 0;

        if((r & 1) > 0) { //if r is odd
            //count of odd numbers in range if right end is odd
            int count = (int) Math.ceil((double) (r-l+1)/2);
            if(k > count)
                return 0;
            else
                //r - (2*k) will give the (k+1)th largest odd number by adding 2 to it we get kth largest odd number
                return r - (2*k) + 2;
        } else {
            //count of odd numbers in range if right end is even
            int count = (r-l+1)/2;
            if(k > count)
                return 0;
            else
                //r - (2*k) will give the (k+1)th largest even number by adding 1 to it we get kth largest odd number
                return r - (2*k) + 1;
        }
    }
}
