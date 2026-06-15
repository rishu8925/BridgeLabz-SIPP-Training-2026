import java.util.*;

public class TaxSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalTax = 0;
        double income[] = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter income of citizen " + (i + 1) + ": ");
            income[i] = sc.nextDouble();

            double tax = 0;
            String bracket = "";

            if (income[i] < 10000) {
                tax = income[i] * 0.05;
                bracket = "5% Tax Bracket";
            } else if (income[i] <= 50000) {
                tax = income[i] * 0.15;
                bracket = "15% Tax Bracket";
            } else {
                tax = income[i] * 0.30;
                bracket = "30% Tax Bracket";
            }

            System.out.println("Tax Bracket: " + bracket);
            System.out.println("Tax Amount: " + tax);

            totalTax += tax;
        }

        System.out.println("Total Tax Collected: " + totalTax);
    }
}