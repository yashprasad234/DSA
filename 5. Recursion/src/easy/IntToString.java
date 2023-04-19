package easy;

public class IntToString {
    public static void main(String[] args) {
        intToString(2022);
    }

    static void intToString(int n) {
        if(n == 0)
            return;
        int rem = n % 10;
        intToString(n/10);
        switch (rem) {
            case 0 :
                System.out.print("zero ");
                break;
            case 1 :
                System.out.print("one ");
                break;
            case 2:
                System.out.print("two ");
                break;
            case 3:
                System.out.print("three ");
                break;
            case 4:
                System.out.print("four ");
                break;
            case 5:
                System.out.print("five ");
                break;
            case 6:
                System.out.print("six ");
                break;
            case 7:
                System.out.print("seven ");
                break;
            case 8:
                System.out.print("Eight ");
                break;
            default:
                System.out.print("nine ");
        }
    }
}
