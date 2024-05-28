public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance. Withdrawal denied.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to check the balance
    public double getBalance() {
        return balance;
    }

    // Method to display account information
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    // Main method to test the BankAccount class
    public static void main(String[] args) {
        // Creating a new bank account with initial balance of 1000
        BankAccount account = new BankAccount("123456789", "Pavan Sanwlot", 1000);

        // Displaying initial account information
        account.displayAccountInfo();

        // Depositing money
        account.deposit(500);
        // Checking balance after deposit
        System.out.println("Balance after deposit: " + account.getBalance());

        // Withdrawing money
        account.withdraw(300);
        // Checking balance after withdrawal
        System.out.println("Balance after withdrawal: " + account.getBalance());

        // Attempting to withdraw more money than available balance
        account.withdraw(1500);
        // Checking balance after failed withdrawal
        System.out.println("Balance after failed withdrawal: " + account.getBalance());
    }
}
