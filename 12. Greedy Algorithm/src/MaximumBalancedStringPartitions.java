import java.util.*;

public class MaximumBalancedStringPartitions {
    public static void main(String[] args) {
        String str = "LLRRRLLRRL";
        int n = str.length();
        System.out.println(balancedPartition(str, n));
    }

    static int balancedPartition(String str, int n) {
        if(n == 0) {
            return 0;
        }
        //these variables track the count of 'R's and 'L's encountered in the string
        int r = 0, l = 0;
        //this stores balanced substring encountered upto that index in the loop
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if(str.charAt(i) == 'R')
                r++;
            else if(str.charAt(i) == 'L')
                l++;
            //checks if the string upto index i is balanced or not
            if(r == l)
                ans++;
        }
        return ans;
    }
}
