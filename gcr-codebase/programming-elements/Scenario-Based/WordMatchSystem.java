import java.util.*;

public class WordMatchSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first skill keyword: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second skill keyword: ");
        String s2 = sc.nextLine();

        System.out.println("First String in Uppercase: " + s1.toUpperCase());
        System.out.println("Second String in Uppercase: " + s2.toUpperCase());

        System.out.println("Length of First String: " + s1.length());
        System.out.println("Length of Second String: " + s2.length());

        String str1 = s1.toLowerCase();
        String str2 = s2.toLowerCase();

        char a[] = str1.toCharArray();
        char b[] = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            System.out.println("Both skill keywords are anagrams");
        } else {
            System.out.println("Skill keywords are not anagrams");
        }
    }
}