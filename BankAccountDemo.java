
class BankAccount {
    private String accountHolder;
    private double balance;

    public void setAccountHolder(String name) {
        accountHolder = name;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal");
        }
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        b.setAccountHolder("Rahul");
        b.setBalance(5000);

        b.setBalance(-1000);

        b.deposit(1000);
        b.withdraw(7000);

        System.out.println("Account Holder: " + b.getAccountHolder());
        System.out.println("Balance: " + b.getBalance());
    }
}
