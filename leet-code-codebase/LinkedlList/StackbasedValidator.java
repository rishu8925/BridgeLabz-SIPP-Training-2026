import java.util.*;

public class StackbasedValidator {
    // Balanced Brackets
    public static boolean isBalanced(String str) {
        LinkedList<Character> stack = new LinkedList<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty())
                    return false;

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '['))
                    return false;
            }
        }

        return stack.isEmpty();
    }

    // Next Greater Price
    public static int[] nextGreaterPrice(int[] price) {

        int n = price.length;
        int[] ans = new int[n];
        LinkedList<Integer> stack = new LinkedList<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= price[i]) {
                stack.pop();
            }

            ans[i] = stack.isEmpty() ? -1 : stack.peek();

            stack.push(price[i]);
        }

        return ans;
    }

    // Stock Span
    public static int[] stockSpan(int[] price) {

        int n = price.length;
        int[] span = new int[n];
        LinkedList<Integer> stack = new LinkedList<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && price[stack.peek()] <= price[i]) {
                stack.pop();
            }

            if (stack.isEmpty())
                span[i] = i + 1;
            else
                span[i] = i - stack.peek();

            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {

        String brackets = "{[()]}";
        System.out.println("Balanced Brackets: " + isBalanced(brackets));

        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        int[] next = nextGreaterPrice(prices);
        System.out.println("\nNext Greater Price:");
        for (int x : next) {
            System.out.print(x + " ");
        }

        int[] span = stockSpan(prices);
        System.out.println("\n\nStock Span:");
        for (int x : span) {
            System.out.print(x + " ");
        }
    }
}