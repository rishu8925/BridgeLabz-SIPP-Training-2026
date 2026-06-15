import java.util.*;

public class Warehouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of stock array: ");
        int n = sc.nextInt();

        int stock[] = new int[n];

        System.out.println("Enter stock quantities:");
        for (int i = 0; i < n; i++) {
            stock[i] = sc.nextInt();
        }

        int max = stock[0];
        int min = stock[0];
        int total = 0;

        for (int i = 0; i < n; i++) {
            if (stock[i] > max)
                max = stock[i];

            if (stock[i] < min)
                min = stock[i];

            total += stock[i];
        }

        System.out.println("Maximum Stock: " + max);
        System.out.println("Minimum Stock: " + min);
        System.out.println("Total Stock: " + total);

        System.out.println("Duplicates:");
        boolean found = false;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (stock[i] == stock[j]) {
                    System.out.println(stock[i]);
                    found = true;
                    break;
                }
            }
        }

        if (!found)
            System.out.println("No duplicates");

        System.out.print("Enter k for rotation: ");
        int k = sc.nextInt();

        k = k % n;
        int rotated[] = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = stock[i];
        }

        System.out.println("Rotated Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(rotated[i] + " ");
        }

        System.out.print("\nEnter rows of shelf grid: ");
        int r = sc.nextInt();

        System.out.print("Enter columns of shelf grid: ");
        int c = sc.nextInt();

        int grid[][] = new int[r][c];

        System.out.println("Enter grid elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        System.out.println("Transpose Matrix:");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(grid[j][i] + " ");
            }
            System.out.println();
        }
    }
}