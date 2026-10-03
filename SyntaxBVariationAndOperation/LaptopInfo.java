package SyntaxBVariationAndOperation;

import java.util.Scanner;

public class LaptopInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("- Please enter your username: ");
        String username = scanner.nextLine();

        System.out.print("- Please enter your password: ");
        String password = scanner.nextLine();

        System.out.print("- Please enter your fullname: ");
        String fullname = scanner.nextLine();

        System.out.print("- Please enter your year of birth: ");
        int YoB = scanner.nextInt();
        scanner.nextLine();

        System.out.print("- Please enter your nationality: ");
        String nationality = scanner.nextLine();

        System.out.println("\n--- YOUR ACCOUNT INFORMATION ---");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Full Name: " + fullname);
        System.out.println("Year of Birth: " + YoB);
        System.out.println("Nationality: " + nationality);

        scanner.close();
    }
}
