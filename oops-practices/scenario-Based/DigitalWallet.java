class InsufficientBalanceException extends Exception {}

class Wallet {
    double balance;
    void send(double amt) throws InsufficientBalanceException {
        if (amt > balance) throw new InsufficientBalanceException();
        balance -= amt;
    }
}

public class DigitalWallet {
    public static void main(String[] args) throws Exception {
        Wallet w = new Wallet();
        w.balance = 500;
        w.send(200);
        System.out.println(w.balance);
    }
}
