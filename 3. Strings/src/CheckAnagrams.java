import java.util.Arrays;
import java.util.Locale;

public class CheckAnagrams {
    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "Caree";
        if(isAnagram(str1, str2))
            System.out.println("The strings mentioned above are anagrams");
        else
            System.out.println("The strings mentioned above are not anagrams");
    }

    //An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically
    //using all the original letters exactly once

    static boolean isAnagram(String str1, String str2) {
        if(str1.length() != str2.length())
            return false;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        return Arrays.equals(charArr1, charArr2);
    }
}
