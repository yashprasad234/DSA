public class KeypadCombinations {
    public static void main(String[] args) {
        letterCombinations("23");
    }

    final static char[][] L = {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};

    static void letterCombinations(String d) {
        int len = d.length();
        if(len == 0) {
            System.out.println("");
            return;
        }
        bfs(0, len, new StringBuilder(""), d);
    }

    static void bfs(int pos, int len, StringBuilder sb, String d) {
        if(pos == len) {
            System.out.println(sb.toString());
        }
        else {
            char[] letters = L[Character.getNumericValue(d.charAt(pos))];
            for (int i = 0; i < letters.length; i++) {
                bfs(pos+1, len, new StringBuilder(sb).append(letters[i]), d);
            }
        }
    }
}
