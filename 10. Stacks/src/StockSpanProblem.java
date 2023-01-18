import java.util.Arrays;
import java.util.Stack;

public class StockSpanProblem {
    public static void main(String[] args) {
        int[] stocks = {100,80,60,70,60,85,100};
        int[] span = new int[stocks.length];
        stockSpan(stocks, span);
        System.out.println(Arrays.toString(span));
    }

    static void stockSpan(int[] stocks, int[] span) {
        Stack<Integer> s = new Stack<>();
        //span contains the span for ith day
        span[0] = 1;
            //stack s contains the index of the previous high element in the stack
        s.push(0);

        //currPrice stores the current price of the stock
        for (int i = 1; i < stocks.length; i++) {
            int currPrice = stocks[i];
            while (!s.isEmpty() && currPrice >= stocks[s.peek()]) {
                s.pop();
            }
            if(s.isEmpty())
                span[i] = i + 1;
            else {
                span[i] = i - s.peek();
            }
            s.push(i);
        }
    }
}
