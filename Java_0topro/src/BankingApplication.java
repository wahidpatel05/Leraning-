import java.util.Scanner;

class BankAccount {
    private String customerName;
    private String accountNumber;
    private double balance;
    private double rateOfInterest;
    private String contactNumber;
    private String address;

    public void createAccount() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        customerName = sc.nextLine();

        System.out.print("Enter account number: ");
        accountNumber = sc.nextLine();

        System.out.print("Enter initial balance: ");
        balance = sc.nextDouble();

        System.out.print("Enter rate of interest: ");
        rateOfInterest = sc.nextDouble();
        sc.nextLine(); // consume the newline

        System.out.print("Enter contact number: ");
        contactNumber = sc.nextLine();

        System.out.print("Enter address: ");
        address = sc.nextLine();

        System.out.println("Account created successfully!");
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully!");
        } else {
            System.out.println("Invalid amount. Please try again.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully!");
        } else {
            System.out.println("Invalid amount or insufficient balance. Please try again.");
        }
    }

    public void computeInterest() {
        double interest = balance * rateOfInterest / 100;
        System.out.println("Interest amount: " + interest);
    }

    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    public void displayAccountDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Rate of Interest: " + rateOfInterest);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Address: " + address);
    }
}

public class BankingApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Banking Application Menu ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Compute Interest");
            System.out.println("5. Display Balance");
            System.out.println("6. Display Account Details");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    account.createAccount();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    account.computeInterest();
                    break;
                case 5:
                    account.displayBalance();
                    break;
                case 6:
                    account.displayAccountDetails();
                    break;
                case 7:
                    exit = true;
                    System.out.println("Exiting the application. Goodbye!");
                    break;
  		case 8 -> System.out.println("Hello");
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        sc.close();
    }
}

