import java.util.Scanner;

class Account {
    String name;
    String acc_no;
    String acc_type;
    double balance;

    public Account(String name, String acc_no, String acc_type) {
        this.name = name;
        this.acc_no = acc_no;
        this.acc_type = acc_type;
        this.balance = 0;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposit successful. New balance: " + this.balance);
    }

    public void display_balance() {
        System.out.println("Current balance: " + this.balance);
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + this.balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

class CurrentAccount extends Account {
    double min_balance = 1000;  
    double service_tax = 50;  

    public CurrentAccount(String name, String acc_no) {
        super(name, acc_no, "Current");
    }

    public void check_min_balance() {
        if (this.balance < this.min_balance) {
            this.balance -= this.service_tax;
            System.out.println("Service tax imposed. New balance: " + this.balance);
        }
    }
}

class SavingsAccount extends Account {
    double interest_rate = 0.05;  

    public SavingsAccount(String name, String acc_no) {
        super(name, acc_no, "Savings");
    }

    public void compute_interest() {
        double interest = this.balance * this.interest_rate;
        this.balance += interest;
        System.out.println("Interest credited. New balance: " + this.balance);
    }
}

public class exer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter account number:");
        String acc_no = scanner.nextLine();

        System.out.println("Enter account type (Savings or Current):");
        String acc_type = scanner.nextLine();

        Account account;
        if (acc_type.equalsIgnoreCase("Savings")) {
            account = new SavingsAccount(name, acc_no);
        } else if (acc_type.equalsIgnoreCase("Current")) {
            account = new CurrentAccount(name, acc_no);
        } else {
            System.out.println("Invalid account type.");
            return;
        }

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            if (account instanceof SavingsAccount) {
                System.out.println("4. Compute Interest");
            } else if (account instanceof CurrentAccount) {
                System.out.println("4. Check Minimum Balance");
            }
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Enter amount to deposit:");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw:");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.display_balance();
                    break;
                case 4:
                    if (account instanceof SavingsAccount) {
                        ((SavingsAccount) account).compute_interest();
                    } else if (account instanceof CurrentAccount) {
                        ((CurrentAccount) account).check_min_balance();
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}