package definingClass;

public class BankAccount {
    private final static double DEFAULT_INTEREST = 0.02;
    private static double rate = DEFAULT_INTEREST;
    private static int bankAccountCount=1;
    private int id;
    private double balance;

    public BankAccount() {
        this.id = bankAccountCount++;
    }
    public static void setInterest(double interest){
        BankAccount.rate = interest;
    }
    public int getId() {
        return id;
    }
    public double getInterest(int year){
        return BankAccount.rate*year*this.balance;
    }
    public void deposit(double amount){
        this.balance+=amount;
    }

    @Override
    public String toString() {
        return String.format("Account ID%d, balance %.2f\n",this.id,this.balance);
    }
}



