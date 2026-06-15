import java.util.*;

public class SplitText {
    static String[] splitWords(String text) {
        int words = 1;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ')
                words++;
        }

        String arr[] = new String[words];
        String word = "";
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                word += text.charAt(i);
            } else {
                arr[index] = word;
                index++;
                word = "";
            }
        }

        arr[index] = word;
        return arr;
    }

    static boolean compareArrays(String a[], String b[]) {
        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i]))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String arr1[] = splitWords(text);
        String arr2[] = text.split(" ");

        System.out.println("Words using method:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        System.out.println("Arrays Same: " + compareArrays(arr1, arr2));
    }
}