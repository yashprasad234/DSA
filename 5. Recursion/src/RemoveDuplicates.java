public class RemoveDuplicates {
    public static void main(String[] args) {
        remDupli("appnnacollege", 0, new StringBuilder(""), new boolean[26]);
    }

    static void remDupli(String str, int i, StringBuilder newStr, boolean[] map) {
        if(i == str.length()) {
            System.out.println(newStr);
            return;
        }
        if(!map[str.charAt(i) - 'a']) {
            newStr.append(str.charAt(i));
            map[(int) str.charAt(i) - 'a'] = true;
        }
        remDupli(str, i+1, newStr, map);
    }
}
