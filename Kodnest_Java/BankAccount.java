package Kodnest_Java;

class BankAccount {
    String accountNumber;
    String accountHolder;
    double balance;

    // Instance block to initialize and validate instance variables
    {
        accountNumber = "0000000000";
        accountHolder = "Unknown";
        balance = 0.0;
    }

    // Default constructor
    public BankAccount() {

    }

    // Parameterized constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Balance: " + balance);
    }

    // Main method to test the class
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount();
        acc1.displayAccountDetails();


        BankAccount acc2 = new BankAccount("1234567890", "John Doe", 1500.75);
        acc2.displayAccountDetails();
    }
}
