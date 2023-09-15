
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            // Create a Scanner object to read user input
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter the purchase price
            System.out.print("Enter the purchase price: ");
            double purchasePrice = scanner.nextDouble();

            // Calculate the sales tax (5% of the purchase price)
            double salesTax = 0.05 * purchasePrice;

            // Display the purchase price and the computed sales tax
            System.out.printf("Purchase Price: $%.2f%n", purchasePrice);
            System.out.printf("Sales Tax (5%%): $%.2f%n", salesTax);

            // Close the scanner
            scanner.close();
        }
    }



