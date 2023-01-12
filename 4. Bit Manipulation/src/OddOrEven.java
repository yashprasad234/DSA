public class OddOrEven {
    public static void main(String[] args) {
        int num = 4;
        oddEven(num);
    }

    static void oddEven (int a) {
        int b = a & 1;
        if(b == 1)
            System.out.println(a + " is odd");
        else
            System.out.println(a + " is even");
    }
}
