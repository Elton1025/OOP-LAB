import java.util.Scanner;

interface Sellable {
    double calculateSales(int months);
}

class Hardware implements Sellable {
    String category;
    String manufacturer;
    double[] monthlySales;

    public Hardware(String category, String manufacturer) {
        this.category = category;
        this.manufacturer = manufacturer;
        this.monthlySales = new double[3]; // Sales for the last 3 months
    }

    public void recordSales(int month, double sales) {
        if (month >= 0 && month < 3) {
            this.monthlySales[month] = sales;
        } else {
            System.out.println("Invalid month index.");
        }
    }

    @Override
    public double calculateSales(int months) {
        double totalSales = 0;
        if (months <= 3) {
            for (int i = 0; i < months; i++) {
                totalSales += this.monthlySales[i];
            }
        } else {
            System.out.println("Invalid number of months. Maximum 3 months allowed.");
        }
        return totalSales;
    }
}

class Software implements Sellable {
    String type;
    String operatingSystem;
    double[] monthlySales;

    public Software(String type, String operatingSystem) {
        this.type = type;
        this.operatingSystem = operatingSystem;
        this.monthlySales = new double[3]; // Sales for the last 3 months
    }

    public void recordSales(int month, double sales) {
        if (month >= 0 && month < 3) {
            this.monthlySales[month] = sales;
        } else {
            System.out.println("Invalid month index.");
        }
    }

    @Override
    public double calculateSales(int months) {
        double totalSales = 0;
        if (months <= 3) {
            for (int i = 0; i < months; i++) {
                totalSales += this.monthlySales[i];
            }
        } else {
            System.out.println("Invalid number of months. Maximum 3 months allowed.");
        }
        return totalSales;
    }
}

public class exer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Hardware hardware = new Hardware("Laptop", "Dell");
        Software software = new Software("Antivirus", "Windows");

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter hardware sales for month " + (i + 1) + ":");
            hardware.recordSales(i, scanner.nextDouble());
            System.out.println("Enter software sales for month " + (i + 1) + ":");
            software.recordSales(i, scanner.nextDouble());
        }

        System.out.println("Total hardware sales for last 3 months: " + hardware.calculateSales(3));
        System.out.println("Total software sales for last 3 months: " + software.calculateSales(3));
    }
}