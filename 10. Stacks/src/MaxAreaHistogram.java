import java.util.Stack;

public class MaxAreaHistogram {
    public static void main(String[] args) {
        int[] height = {2,4};
        System.out.println("Max area in th above histogram is : " + maxArea(height));
    }

    static int maxArea(int[] arr) {
        int maxArea = 0;
        int[] nsr = new int[arr.length];
        int[] nsl = new int[arr.length];
        //Next smaller left
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsl[i] = arr.length;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        //Next smaller right
        s = new Stack<>();

        for (int i = arr.length-1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        //current area
        for (int i = 0; i < arr.length; i++) {
            int width = nsr[i] - nsl[i] - 1;
            int currArea = arr[i] * width;
            maxArea = Math.max(currArea, maxArea);
        }
        return maxArea;
    }
}
