import java.util.*;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();

        try {
            System.out.println("Value at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}