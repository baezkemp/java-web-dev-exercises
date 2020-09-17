package exercises.BankSuff.Accounts;

public class BankAccount {

    private int accountNo;
    protected double balance;

    public BankAccount(int accountNo){
        this.accountNo = accountNo;
        this.balance = 0;
    }

    public void deposit(double amount){

        if (amount < 0) {
            throw new IllegalArgumentException();
        }
        this.balance += amount;
    }

    public void withdrawal(double amount){
        if (amount < 0 || amount > this.balance) {
            throw new IllegalArgumentException();
        }
        this.balance -= amount;
    }

    public double getBalance (){
        return this.balance;
    }
}
