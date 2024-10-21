import java.util.Scanner;
class Bank {
    double getRateOfInterest() {
        return 0; 
    }
}

class SBI extends Bank {
    @Override
    double getRateOfInterest() {
        return 8;
    }
}

class ICICI extends Bank {
    @Override
    double getRateOfInterest() {
        return 7;
    }
}

class AXIS extends Bank {
    @Override
    double getRateOfInterest() {
        return 9;
    }
}

public class exer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principal amount:");
        double principal = scanner.nextDouble();

        Bank bank;

        while (true) {
            System.out.println("\nChoose a bank:");
            System.out.println("1. SBI");
            System.out.println("2. ICICI");
            System.out.println("3. AXIS");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bank = new SBI();
                    break;
                case 2:
                    bank = new ICICI();
                    break;
                case 3:
                    bank = new AXIS();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
                    continue;
            }

            double interest = (principal * bank.getRateOfInterest() * 1) / 100;
            System.out.println("Interest for " + bank.getClass().getSimpleName() + " bank: " + interest);
        }
    }
}