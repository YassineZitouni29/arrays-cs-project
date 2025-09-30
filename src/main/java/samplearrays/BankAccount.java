package samplearrays;

public class BankAccount {
    private String name;
    private double currentBalance;
    private int numOfTransactions = 0;
    private double[] transactions = new double[1000];
    public BankAccount(String name, int startingBalance){
        this.name = name;
        this.currentBalance = startingBalance;
    }

    public void deposit(double amount){
        if(amount > 0 && numOfTransactions < transactions.length){
            currentBalance += amount;
            transactions[numOfTransactions] = amount;
            numOfTransactions++;
            System.out.println(name + " deposited " + amount + " current balance is " + currentBalance);
        }else if(amount <= 0){
            System.out.println("Invalid amount");
        }else{
            System.out.println("Number of transactions exceeded");
        }
    }

    public void withdraw(double amount){
        if (amount > 0 && amount <= currentBalance && numOfTransactions < transactions.length){
            currentBalance -= amount;
            transactions[numOfTransactions] = -amount;
            numOfTransactions++;
            System.out.println(name + " withdrawn " + amount + " current balance is " + currentBalance);
        }else if(amount <= 0){
            System.out.println("Invalid amount");
        }else if(amount > currentBalance){
            System.out.println("Insufficient balance");
        }else {
            System.out.println("Number of transactions exceeded");
        }
    }

    public void displayTransactions(){
        for(int i = 0; i < numOfTransactions; i++){
            if(transactions[i] > 0){
                System.out.println("Deposit of : " + transactions[i]);
            }else if(transactions[i] < 0){
                System.out.println("Withdraw of : " + -transactions[i]);
            }
        }
    }

    public void displayBalance(){
        System.out.println("Current balance is " + currentBalance);
    }

    public static void main(String[] args) {

        BankAccount john = new BankAccount("John Doe", 100);

        // ----- DO NOT CHANGE -----

        //Testing..
        john.displayBalance();
        john.deposit(0.25);
        john.withdraw(100.50);
        john.withdraw(40.90);
        john.deposit(-90.55);
        john.deposit(3000);
        john.displayTransactions();
        john.displayBalance();

        // ----- DO NOT CHANGE -----

    }

}
