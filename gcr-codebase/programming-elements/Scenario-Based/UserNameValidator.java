import java.util.*;

public class UserNameValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        if (username.contains(" "))
            System.out.println("Username contains spaces");
        else
            System.out.println("Username does not contain spaces");

        System.out.println("Total characters: " + username.length());

        System.out.println("Uppercase: " + username.toUpperCase());

        String rev = "";
        for (int i = username.length() - 1; i >= 0; i--) {
            rev += username.charAt(i);
        }

        if (username.equalsIgnoreCase(rev))
            System.out.println("Username is a palindrome");
        else
            System.out.println("Username is not a palindrome");
    }
}