package SyntaxDLoopingConstruction;

import java.util.Scanner;

public class loginFor {
    public static void main(String[] args) {

        String username = "taetaetae333";
        String password = "Ritchie2Guns";

        Scanner scanner = new Scanner(System.in);

        for (int attempt = 1; attempt <= 5; attempt++) {

            System.out.print("username: ");
            String user = scanner.nextLine();

            System.out.print("password: ");
            String pass = scanner.nextLine();

            if (pass.equals(password) && user.equals(username)) {
                System.out.println("Log in successfully!");
                break;
            }
            else if (user.equals(username)) {
                System.out.println("Wrong password!");
            }
            else {
                System.out.println("Invalid username");
            }

            System.out.println("Attempts remaining: " + (5 - attempt));
        }

        scanner.close();
    }
}