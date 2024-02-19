package strings;

public class SkipACharacter {
    public static void main(String[] args) {
        String str = "yash prasad";
        System.out.println(removeA(str, new StringBuilder("")));
        System.out.println(removeA2(str, 0));
    }

    static String removeA (String str, StringBuilder sb) {
        if(str.length() == 0)
            return sb.toString();
        if(str.startsWith("a"))
            return removeA(str.substring(1), sb);
        else {
            char ch = str.charAt(0);
            return removeA(str.substring(1), sb.append(ch));
        }
    }

    static String removeA2 (String str, int i) {
        StringBuilder sb = new StringBuilder("");
        if(i == str.length())
            return sb.toString();
        if(str.charAt(i) != 'a')
            sb.append(str.charAt(i));
        String ans = removeA2(str, i+1);
        sb.append(ans);
        return sb.toString();
    }
}
