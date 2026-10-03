package SyntaxDLoopingConstruction;

import java.util.Scanner;

public class loginWhile {
    public static void main(String[] args) {

        String username = "taetaetae333";
        String password = "Ritchie2Guns";
        int maxAttempts = 5;

        while(maxAttempts > 0){

            Scanner scanner = new Scanner(System.in);

            System.out.print("username: ");
            String user = scanner.nextLine();

            System.out.print("password: ");
            String pass = scanner.nextLine();

            if(pass.equals(password) && user.equals(username)){
                System.out.print("Log in successfully!");
                break;
            }
            else if(user.equals(username)) {
                System.out.println("Wrong password!");
                maxAttempts--;
            }
            else {
                System.out.println("Invalid username");
                maxAttempts--;
            }
             
            System.out.println("Attempts remaining: " + maxAttempts);
        }
        if (maxAttempts == 0) {
                System.out.println("Your account has been blocked!");
        }
    }
}