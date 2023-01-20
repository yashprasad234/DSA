import java.util.Stack;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = {7, 0, 4, 2, 5, 0, 6, 4, 0, 5};
        System.out.println(maxWater(height));
    }

    static int maxWater(int[] height) {
        //This stores all the smaller elements that can be boundary element for the current element and make a container
        Stack<Integer> stack = new Stack<>();
        int n = height.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && height[stack.peek()]<height[i]) {
                int pop_height = height[stack.peek()];
                stack.pop();
                if(stack.isEmpty())
                    break;
                int distance = i - stack.peek() - 1;
                int min_height = Math.min(height[stack.peek()], height[i])-pop_height;
                ans += distance * min_height;
            }
            stack.push(i);
        }
        return ans;
    }
}
