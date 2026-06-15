import java.util.*;

public class UniqueCharacters {
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

    static char[] uniqueChars(String text) {
        int len = findLength(text);
        char temp[] = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            boolean unique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                temp[index] = text.charAt(i);
                index++;
            }
        }

        char result[] = new char[index];

        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String text = sc.nextLine();

        char result[] = uniqueChars(text);

        System.out.println("Unique Characters:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}