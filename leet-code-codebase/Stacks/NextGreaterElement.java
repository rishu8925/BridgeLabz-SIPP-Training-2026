import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

    public static int[] nextGreater(int[] arr) {

        int n = arr.length;

        int[] ans = new int[n];

        Arrays.fill(ans, -1);

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                ans[stack.pop()] = arr[i];
            }

            stack.push(i);
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] visitors = {100, 80, 120, 90, 130};

        int[] result = nextGreater(visitors);

        System.out.println(Arrays.toString(result));
    }
}