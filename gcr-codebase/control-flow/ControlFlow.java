import java.util.*;

public class ControlFlow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter income: ");
        double income = sc.nextDouble();

        double tax;
        String bracket;

        if (income < 10000) {
            bracket = "5%";
            tax = income * 0.05;
        } else if (income <= 50000) {
            bracket = "15%";
            tax = income * 0.15;
        } else {
            bracket = "30%";
            tax = income * 0.30;
        }

        System.out.println("Tax Bracket: " + bracket);
        System.out.println("Tax Amount: " + tax);

        sc.close();
    }
}
