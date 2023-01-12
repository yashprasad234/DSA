public class CountLowercaseVowels {
    public static void main(String[] args) {
        String str = "CounthowmanytimeslowercasevowelsoccurredinaStringenteredbytheuser";
        System.out.println("The number is lowercase vowels in the strings is : " + count(str));
    }

    static int count(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                count++;
        }
        return count;
    }
}
