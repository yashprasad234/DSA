public class PrintNtoOne {
    public static void main(String[] args) {
        printNto1(5);
    }

    static void printNto1(int n) {
        if(n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNto1(n-1);
    }
}