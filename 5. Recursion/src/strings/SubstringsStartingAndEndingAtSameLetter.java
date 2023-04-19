//https://www.geeksforgeeks.org/recursive-solution-count-substrings-first-last-characters/

public class SubstringsStartingAndEndingAtSameLetter {
    public static void main(String[] args) {
//        System.out.println(countSubstring("aba", 0,0,1));
        String str = "abcab";
        System.out.println(countSubstring(str, 0, 0, 1));
    }

    static int countSubstring(String s, int count, int i, int j) {
        if(i == s.length())
            return count;
        if(!(j <= s.length()))
            return countSubstring(s, count, i+1, i+2);
        String str = s.substring(i, j);
        if(str.charAt(0) == str.charAt(str.length()-1))
            count++;
        return countSubstring(s, count, i, j+1);
    }

//    static int countSubstrs(String str, int i, int j, int n) {
//        if(n == 1)
//            return 1;
//        if(n <= 0)
//            return 0;
//        int res = countSubstrs(str, i+1, j, n-1) + countSubstrs(str, i, j-1, n-1) - countSubstrs(str, i + 1, j - 1, n - 2);
//        if(str.charAt(i) == str.charAt(j))
//            res++;
//        return res;
//    }
}
