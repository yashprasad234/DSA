package strings;

public class SkipStringIfNotRequiredString {
    public static void main(String[] args) {
        String str = "bappcappled";
        System.out.println(skipString(str, new StringBuilder("")));
    }

    static String skipString(String str, StringBuilder sb) {
        if(str.length() == 0)
            return sb.toString();
        if(!str.startsWith("apple") && str.startsWith("app")) {
            return skipString(str.substring(3), sb);
        } else {
            sb.append(str.charAt(0));
            return skipString(str.substring(1), sb);
        }
    }
}
