import java.util.*;

public class SpyCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter secret message: ");
        String msg = sc.nextLine();

        String rev = "";
        for (int i = msg.length() - 1; i >= 0; i--) {
            rev += msg.charAt(i);
        }
        System.out.println("Reversed Message: " + rev);

        if (msg.equalsIgnoreCase(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        int vowels = 0, consonants = 0;
        String lower = msg.toLowerCase();

        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        System.out.print("Enter first intercept: ");
        String s1 = sc.nextLine().toLowerCase();

        System.out.print("Enter second intercept: ");
        String s2 = sc.nextLine().toLowerCase();

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");

        System.out.print("Enter surveillance log: ");
        String log = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < log.length(); i++) {
            int count = 0;

            for (int j = 0; j < log.length(); j++) {
                if (log.charAt(i) == log.charAt(j))
                    count++;
            }

            if (count == 1) {
                System.out.println("First Non-Repeating Character: " + log.charAt(i));
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("No non-repeating character found");
    }
}