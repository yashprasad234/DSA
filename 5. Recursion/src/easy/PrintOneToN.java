package easy;

public class PrintOneToN {
    public static void main(String[] args) {
        printOneToN(5);
    }

    static void printOneToN(int n) {
        if(n == 1) {
            System.out.println(1);
            return;
        }
        printOneToN(n-1);
        System.out.println(n);
    }
}
