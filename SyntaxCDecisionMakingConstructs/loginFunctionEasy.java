package SyntaxCDecisionMakingConstructs;

import java.util.Scanner;

public class loginFunctionEasy {
    public static void main(String[] args) {
        String userName = "root";
        String password = "admin";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        scanner.close();

        if (inputUsername.equals(userName) && inputPassword.equals(password)) {
            System.out.println("Login successful!");
        } else if (inputUsername.equals(userName)) {
            System.out.println("Invalid password.");
        } else {
            System.out.println("User not found.");
        }
    }
}
