abstract class BankAccount {

    private String accountNumber;
    private String holderName;
    private double balance;

   
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name : " + holderName);
        System.out.println("Balance : " + balance);
    }

 
    abstract double calculateInterest();
}


class SavingsAccount extends BankAccount {

    private double interestRate;

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
}

public class BankingSystem {

    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount();

        s.setAccountNumber("SB1001");
        s.setHolderName("Rahul");
        s.setBalance(50000);
        s.setInterestRate(5);

        s.deposit(10000);
        s.withdraw(5000);

        s.displayAccountDetails();

        System.out.println("Interest : " + s.calculateInterest());
    }
}