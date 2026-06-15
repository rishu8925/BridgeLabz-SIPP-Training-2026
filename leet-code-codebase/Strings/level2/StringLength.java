import java.util.*;

public class StringLength {
    static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String text = sc.next();

        System.out.println("Length using method: " + findLength(text));
        System.out.println("Length using length(): " + text.length());
    }
}