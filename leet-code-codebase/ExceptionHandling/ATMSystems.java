class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class Account {
    double balance = 5000;

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Balance: " + balance + ", Requested: " + amount
            );
        }
        balance -= amount;
        System.out.println("Withdrawal successful");
    }
}

public class ATMSystems {
    public static void main(String[] args) {
        Account acc = new Account();

        try {
            acc.withdraw(8000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}