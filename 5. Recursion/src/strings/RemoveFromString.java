package strings;

public class RemoveFromString {
    public static void main(String[] args) {
        String str = "baccad";
        System.out.println(removeA(str, 0, new StringBuilder("")));
        System.out.println(removeA2(str, 0));
    }

    static String removeA (String str, int i, StringBuilder sb) {
        if(i == str.length())
            return sb.toString();
        if(str.charAt(i) != 'a')
            sb.append(str.charAt(i));
        return removeA(str, i+1, sb);
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
