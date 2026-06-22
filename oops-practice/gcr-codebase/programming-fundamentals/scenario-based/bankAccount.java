class BankAccount {

   
    static int totalAccounts = 0;

   
    private String accountNumber;
    private String holder;
    private double balance;

    BankAccount(String accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited into " + accountNumber);
        }
    }

    
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn from " + accountNumber);
        } else {
            System.out.println("Insufficient Balance in " + accountNumber);
        }
    }

    void getStatement() {
        System.out.println("\nAccount Number : " + accountNumber);
        System.out.println("Holder Name    : " + holder);
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class bankAccount {
    public static void main(String[] args) {

        
        BankAccount acc1 = new BankAccount("ACC101", "Rahul", 10000);
        BankAccount acc2 = new BankAccount("ACC102", "Priya", 15000);
        BankAccount acc3 = new BankAccount("ACC103", "Amit", 20000);

        
        acc1.deposit(2000);
        acc1.withdraw(1500);
        acc1.deposit(3000);
        acc1.withdraw(4000);
        acc1.withdraw(12000);

        acc2.withdraw(2000);
        acc2.deposit(5000);
        acc2.withdraw(3000);
        acc2.deposit(1000);
        acc2.withdraw(20000);

       
        acc3.deposit(4000);
        acc3.withdraw(5000);
        acc3.deposit(2500);
        acc3.withdraw(1000);
        acc3.withdraw(15000);

      
        acc1.getStatement();
        acc2.getStatement();
        acc3.getStatement();

        
        System.out.println("\nTotal Accounts Created: " + BankAccount.totalAccounts);
    }
}