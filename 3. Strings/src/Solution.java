import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(stringCompress(str));
    }

    static String stringCompress (String str) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count > 1)
                sb.append(count);
        }
        return sb.toString();
    }
}
