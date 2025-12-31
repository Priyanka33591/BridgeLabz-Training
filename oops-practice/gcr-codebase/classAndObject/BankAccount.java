class BankAccount {
    String accountHolder, accountNumber;
    double balance;

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited: " + amt);
        System.out.println("Current balance: " + balance);
    }

    void withdraw(double amt) {
        if(amt <= balance) {
            balance -= amt;
            System.out.println("Withdraw amount is : " + amt);
            System.out.println("Current balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.accountHolder="State of Chennai";
        b.balance = 700;

        System.out.println(b.accountHolder);
        System.out.println("Current balance: " + b.balance);

        b.deposit(200);
        b.withdraw(100);
        b.withdraw(2000);
    }
}
