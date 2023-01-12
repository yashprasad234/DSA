public class Solution {
    public static void main(String[] args) {
        tOH(3, 'A', 'B', 'C');
    }

    static void tOH(int n, char a, char b, char c){
        if(n == 1) {
            System.out.println("Move " + 1 + " from " + a + " to " + c);
            return;
        }
        tOH(n-1, a, c, b);
        System.out.println("Move " + n +" from " + a + " to " + c);
        tOH(n-1, b, a, c);
    }
}
