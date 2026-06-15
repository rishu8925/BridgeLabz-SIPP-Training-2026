import java.util.*;

public class SubstringDemo {
    static String createSubstring(String text, int start, int end) {
        String sub = "";

        for (int i = start; i < end; i++) {
            sub += text.charAt(i);
        }
        return sub;
    }

    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String sub1 = createSubstring(text, start, end);
        String sub2 = text.substring(start, end);

        System.out.println("Using charAt: " + sub1);
        System.out.println("Using substring(): " + sub2);
        System.out.println("Same: " + compareStrings(sub1, sub2));
    }
}