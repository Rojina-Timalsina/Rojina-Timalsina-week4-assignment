//Create a class BankAccount with:
//Fields: accountNumber, balance
//Methods: deposit(double amount), withdraw(double amount), and getBalance()
//Create a subclass SavingsAccount with:
//Field: interestRate
//Override withdraw() to prevent withdrawal if it causes the balance to fall below a threshold (e.g., 1000).
//Add a method addInterest() to update balance based on the interest rate.
//Make all fields private and use getters/setters.
//Demonstrate account creation, deposit, interest addition, and controlled withdrawal.
//File: BankSystem.java.


   class BankAccount{
    private double accountNumber;
    private double balance;

    public BankAccount(double accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("Deposited: "+amount);
        }else{
            System.out.println("Invalid amount deposited");
        }
    }

    public void withdraw(double amount){
        if(balance>0 && balance>amount){
            balance -=amount;
            System.out.println("Withdrawal: "+amount);
        }else{
            System.out.println("Invalid amount withdrawal");
        }
    }

    public double getBalance(){
        return balance;
    }

    public double getAccountnumber(){
        return accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount{

    private double interestRate;

    public SavingsAccount(double accountNumber, double balance, double interestRate){
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount){
        if(getBalance()-amount>=1000){
            super.withdraw(amount);
        }else{
            System.out.println(" withdraw failed...");
        }
    }

    public void addInterest(){
        double interest;
        interest = getBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("Interest added: "+interest);
    }

    public double getInterestrate(){
        return interestRate;
    }

    public void setInterestrate(double rate){
        this.interestRate = rate;
    }
}
public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount Acc = new SavingsAccount(567890, 90000, 13);

        System.out.println("Account: "+Acc.getAccountnumber());
        System.out.println("Balace: "+Acc.getBalance());

        Acc.deposit(7000);
        Acc.addInterest();
        Acc.withdraw(6000);

        System.out.println("Final Balance: "+Acc.getBalance());
    }
} 
    


