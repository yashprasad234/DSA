package intro;

public class FindStringLength {
    public static void main(String[] args) {
        System.out.println(strLength("yash prasad"));
    }

    static int strLength(String str) {
        if(str.equals(""))
            return 0;
        return strLength(str.substring(1)) + 1;
    }
}
