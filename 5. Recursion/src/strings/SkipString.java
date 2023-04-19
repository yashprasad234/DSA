package strings;

public class SkipString {
    public static void main(String[] args) {
        String str = "bcdapplefg";
        System.out.println(skipApple(str, new StringBuilder("")));
    }

    static String skipApple(String str, StringBuilder sb) {
        if(str.length() == 0)
            return sb.toString();
        if(str.startsWith("apple")) {
            return skipApple(str.substring(5), sb);
        } else {
            sb.append(str.charAt(0));
            return skipApple(str.substring(1), sb);
        }
    }
}
