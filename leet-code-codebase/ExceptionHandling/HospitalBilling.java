import java.util.*;

class InsufficientFundsException extends Exception {
    InsufficientFundsException(String msg) {
        super(msg);
    }
}

public class HospitalBilling {
    public static void main(String[] args) {
        try {
            int totalBill = 10000;
            int items = 0;
            int[] patients = {101, 102, 103};
            String input = "abc";
            int payment = 5000;

            int perItem = totalBill / items;
            System.out.println(perItem);

            System.out.println(patients[5]);

            int amount = Integer.parseInt(input);

            if (payment < totalBill) {
                throw new InsufficientFundsException("Payment failed: Insufficient funds");
            }

        } catch (ArithmeticException e) {
            System.out.println("Error: Bill items cannot be zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input");
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}