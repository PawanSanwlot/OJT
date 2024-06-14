public class Main11 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(null, null, 0);
        account.setAccountNumber("12345678");
        account.setAccountHolderName("Pavan");
        account.setBalance(500.0);

        System.out.println("Account number:" + account.getAccountNumber());
        System.out.println("Account Holder:" + account.getAccountHolderName());
        System.out.println("Balance:" + account.getBalance());
        account.deposit(200.0);
        System.out.println("Balance after the deposit:" + account.getBalance());
        account.withdraw(100);
        System.out.println("Balance after withdrawal is:" + account.getBalance());
        account.setBalance(-50.0);
        account.deposit(-20);
        account.withdraw(700.00);

    }
}