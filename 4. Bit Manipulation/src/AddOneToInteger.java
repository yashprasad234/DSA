import java.util.Scanner;

public class AddOneToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(addUsingBit(a));
    }

    static int addUsingBit(int a) {
        return -~a;
    }
}
