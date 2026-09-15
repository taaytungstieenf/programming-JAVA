package SyntaxBVariationAndOperation;

import java.util.Scanner;

public class LaptopInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your laptop name: ");
        String productName = scanner.nextLine();

        System.out.print("Please enter laptop vendor: ");
        String vendorName = scanner.nextLine();

        System.out.print("Please enter the laptop price (VND): ");
        double productPrice = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character left by nextDouble()

        System.out.print("Please enter store name: ");
        String storeName = scanner.nextLine();

        System.out.print("Please enter laptop RAM capacity (GB): ");
        int ramCapacity = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt()

        System.out.print("Please enter laptop ROM capacity (GB): ");
        int romCapacity = scanner.nextInt();

        System.out.println("\n--- LAP TOP INFORMATION ---");
        System.out.println("Laptop Name: " + productName);
        System.out.println("Vendor Name: " + vendorName);
        System.out.printf("Price: %,.0f VND%n", productPrice);
        System.out.println("Store Name: " + storeName);
        System.out.println("RAM Capacity: " + ramCapacity + " GB");
        System.out.println("ROM Capacity: " + romCapacity + " GB");

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
