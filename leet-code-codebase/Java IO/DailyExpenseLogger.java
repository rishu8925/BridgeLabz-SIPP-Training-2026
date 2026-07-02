import java.io.*;
import java.util.*;

public class DailyExpenseLogger {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Category: ");
        String category = sc.nextLine();

        System.out.print("Amount: ");
        int amount = sc.nextInt();

        FileWriter fw = new FileWriter("expenses.txt", true);

        fw.write(category + " - " + amount + "\n");

        fw.close();

        System.out.println("Expense Saved");
    }
}