// Superclass
class BankAccount {
    protected double balance;

    // Constructor
    BankAccount(double balance) {
        this.balance = balance;
    }

    // Deposit method
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
        System.out.println("Current Balance: " + balance);
    }
}

// Subclass
class SavingsAccount extends BankAccount {

    // Constructor
    SavingsAccount(double balance) {
        super(balance);
    }

    // Overriding withdraw method
    @Override
    void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal denied! Minimum balance of 100 must be maintained.");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Current Balance: " + balance);
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount(500);

        sa.deposit(200);      // Deposit money
        sa.withdraw(400);     // Valid withdrawal
        sa.withdraw(250);     // Will be denied if balance < 100
    }
}
