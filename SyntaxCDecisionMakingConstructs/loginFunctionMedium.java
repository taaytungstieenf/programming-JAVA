package SyntaxCDecisionMakingConstructs;

import java.util.Scanner;

public class loginFunctionMedium {
    public static void main(String[] args) {

        String userName = "root";
        String password = "admin";

        Scanner scanner = new Scanner(System.in);

        int maxAttempts = 3;
        int attempt = 0;
        boolean loginSuccessful = false;

        while (attempt < maxAttempts) {

            System.out.println("\n--- LOGIN ---");

            System.out.print("Enter username: ");
            String inputUsername = scanner.nextLine();

            System.out.print("Enter password: ");
            String inputPassword = scanner.nextLine();

            attempt++;

            if (inputUsername.equals(userName) && inputPassword.equals(password)) {

                System.out.println("Login successful!");
                loginSuccessful = true;
                break;

            } else if (!inputUsername.equals(userName)) {

                System.out.println("User not found.");

            } else {

                System.out.println("Invalid password.");
            }

            System.out.println("Attempts remaining: " + (maxAttempts - attempt));
        }

        if (!loginSuccessful) {
            System.out.println("\nAccount locked.");
        }

        scanner.close();
    }
}