public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "calc";
        if(isPalindrome(str))
            System.out.println("The string \""+str+"\" is a palindrome.");
        else
            System.out.println("The string \""+str+"\" is not a palindrome.");
    }

    //Time Complexity : O(n)
    //Space Complexity : O(1)

    static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i))
                return false;
        }
        return true;
    }
}
