public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
       
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } 
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance.");
            }
        
    }

    public double checkBalance(){
        return balance;
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount("1235423", "Pavan Sanwlot", 100000000);
        account.deposit(10000);
        account.withdraw(1000);
        System.out.println("Balance: " + account.checkBalance());
    }
}
