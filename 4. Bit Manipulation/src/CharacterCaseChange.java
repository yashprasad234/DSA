public class CharacterCaseChange {
    public static void main(String[] args) {
        System.out.println(upperToLowercase('A'));
        System.out.println(lowerToUppercase('t'));
    }

    static char upperToLowercase (char ch) {
        int a = (int) ch;
        int bitMask = 1 << 5;
        a = a | bitMask;
        return (char) a;
    }

    static char lowerToUppercase (char ch) {
        int a = (int) ch;
        int bitMask = ~(1 << 5);
        a = a & bitMask;
        return (char) a;
    }
}
