import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GenerateBinaryNumbers {
    public static void main(String[] args) {
        printBinary(10);
    }

    static void printBinary(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("1");
        while (n-- > 0) {
            String s1 = q.peek();
            q.remove();
            //print the binary for n-ith decimal number. (i is the number of iteration)
            System.out.println(s1);
            String s2 = s1;
            //add the next two possible numbers to the current number printed
            q.add(s1 + "0");
            q.add(s2 + "1");
        }
    }
}
