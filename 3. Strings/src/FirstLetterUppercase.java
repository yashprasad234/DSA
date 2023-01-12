public class FirstLetterUppercase {
    public static void main(String[] args) {
        String str = "hi i am yash";
        System.out.println(upperCase(str));
    }

    static String upperCase(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            ch = str.charAt(i);
            if(str.charAt(i-1) == ' ') {
                ch = Character.toUpperCase(str.charAt(i));
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}
