package SyntaxBVariationAndOperation;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the laptop price (VND): ");
        double productPrice = scanner.nextDouble();

        //scanner.nextLine();

        System.out.print("Please enter store name: ");
        String storeName = scanner.nextLine();

        System.out.printf("Price: %,.0f VND%n", productPrice);
        System.out.println("Store Name: " + storeName);

        scanner.close();
    }

}
