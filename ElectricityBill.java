import java.util.Scanner;

public class ElectricityBill {

    // Method to calculate electricity bill
    public static double calculateBill(int units) {
        double billAmount = 0;

        // Define the rates for the slab system
        if (units <= 100) {
            billAmount = units * 1.20;  // 1.20 per unit for up to 100 units
        } else if (units <= 300) {
            billAmount = 100 * 1.20 + (units - 100) * 2.00;  // 2.00 per unit for units between 101 and 300
        } else {
            billAmount = 100 * 1.20 + 200 * 2.00 + (units - 300) * 3.00;  // 3.00 per unit for units above 300
        }

        return billAmount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Number of customers
        System.out.print("Enter the number of customers: ");
        int numberOfCustomers = scanner.nextInt();

        // Loop through each customer
        for (int i = 1; i <= numberOfCustomers; i++) {
            // Input customer ID and name
            System.out.print("Enter Customer ID for customer " + i + ": ");
            int customerId = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter Customer Name for customer " + i + ": ");
            String customerName = scanner.nextLine();

            // Input units consumed
            System.out.print("Enter the number of units consumed by " + customerName + ": ");
            int units = scanner.nextInt();

            // Calculate bill
            double totalBill = calculateBill(units);

            // Output the bill amount
            System.out.println("Customer ID: " + customerId + ", Name: " + customerName);
            System.out.println("The total electricity bill is: $" + totalBill);
            System.out.println();
        }

        scanner.close();
    }
}
