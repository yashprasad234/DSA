import java.util.*;

public class LexicographicallySmallestString {
    public static void main(String[] args) {
        char[] alphabets = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabets[i] = (char) ('a' + i);
        }
        System.out.println(Arrays.toString(printString(5, 42, alphabets)));
    }

    static char[] printString(int n, int k, char[] alphabets) {
        char[] ans = new char[n];
        //fill the array with 'a's since a is lexicographically smallest
        Arrays.fill(ans, 'a');
        //loop to fill the array with ans
        for (int i = n-1; i >= 0; i--) {
            //reducing k so that remaining places can be taken by 'a's;
            k -= i;
            if(k >= 0) {
                if(k >= 26) {
                    //we want to keep the strings with as many as 'a's as possible to make it lexicographically smallest
                    ans[i] = 'z';
                    k -= 26;
                }
                else {
                    //adding the character whose value is equal to the current value of k
                    //this is done so the rest of the value of k can be covered by 'a's to make lexicographically smallest
                    ans[i] = (char) (k + 97 -1);
                    //reducing value of k by the amount added to it i.e., k = 0;
                    k = 0;
                }
            }
            else
                break;
            k += i;
        }
        return ans;
    }
}
